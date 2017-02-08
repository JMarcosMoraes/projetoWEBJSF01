package br.com.josemarcos.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.josemarcos.model.Aluno;


@Stateless
public class EscolaService {

    @Inject
    private Logger log;

    @Inject
    private EntityManager em;

    @Inject
    private Event<Aluno> memberEventSrc;

    public void register(Aluno aluno) throws Exception {
        log.info("Registering " + aluno.getNome());
        em.persist(aluno);
        memberEventSrc.fire(aluno);
    }
}
