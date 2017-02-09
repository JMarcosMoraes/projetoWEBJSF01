package br.com.josemarcos.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.josemarcos.model.Aluno;

@RequestScoped
public class AlunoListProducer {

    @Inject
    private AlunoRepository alunoRepository;

    private List<Aluno> listaAlunos;

    @Produces
    @Named
    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void onAlunoListChanged(@Observes(notifyObserver = Reception.IF_EXISTS) final Aluno aluno) {
        retrieveAllMembersOrderedByName();
    }

    @PostConstruct
    public void retrieveAllMembersOrderedByName() {
        listaAlunos = alunoRepository.findAllOrderedByName();
    }
}
