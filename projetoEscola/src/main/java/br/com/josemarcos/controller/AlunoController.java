package br.com.josemarcos.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.josemarcos.model.Aluno;
import br.com.josemarcos.service.EscolaService;

/*
 * @Version 02
 */

@Model
public class AlunoController {

    @Inject
    private FacesContext facesContext;

	@Inject
    private EscolaService escolaService;

    @Produces
    @Named
    private Aluno aluno;

    @PostConstruct
    public void initNewAluno() {
        aluno = new Aluno();
    }

    public void register() {
    	try {
    		escolaService.register(aluno);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_INFO, "Salvar!", "Registro salvo com sucesso!");
            facesContext.addMessage(null, m);
            initNewAluno();
        } catch (Exception e) {
            String errorMessage = getRootErrorMessage(e);
            FacesMessage m = new FacesMessage(FacesMessage.SEVERITY_ERROR, errorMessage, "Error ao persistir.");
            facesContext.addMessage(null, m);
        }
    }

    private String getRootErrorMessage(Exception e) {
        String errorMessage = "Error ao salvar . Ver log servidor para mais informações.";
        if (e == null) {        
            return errorMessage;
        }

        Throwable t = e;
        while (t != null) {
            errorMessage = t.getLocalizedMessage();
            t = t.getCause();
        }
        return errorMessage;
    }
    
    public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
}
