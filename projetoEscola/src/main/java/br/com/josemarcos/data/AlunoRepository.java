package br.com.josemarcos.data;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.josemarcos.model.Aluno;

@ApplicationScoped
public class AlunoRepository {

    @Inject
    private EntityManager em;

    public Aluno findById(Long id) {
        return em.find(Aluno.class, id);
    }

    public Aluno findByEmail(String email) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Aluno> criteria = cb.createQuery(Aluno.class);
        Root<Aluno> aluno = criteria.from(Aluno.class);
        criteria.select(aluno).where(cb.equal(aluno.get("email"), email));
        return em.createQuery(criteria).getSingleResult();
    }

    public List<Aluno> findAllOrderedByName() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Aluno> criteria = cb.createQuery(Aluno.class);
        Root<Aluno> aluno = criteria.from(Aluno.class);
        criteria.select(aluno).orderBy(cb.asc(aluno.get("nome")));
        return em.createQuery(criteria).getResultList();
    }
}
