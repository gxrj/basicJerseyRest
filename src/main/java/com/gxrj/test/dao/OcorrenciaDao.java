package com.gxrj.test.dao;

import com.gxrj.test.model.Ocorrencia;
import com.gxrj.test.model.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateless
public class OcorrenciaDao {
    
    @PersistenceContext
    EntityManager em;
    
    public void inserir(Ocorrencia o){ 
        em.persist(o);
    }
    
    public void alterar(Ocorrencia o){
        em.merge(o);
    }
    
    public void excluir(Ocorrencia o){
        em.remove(em.merge(o));
    }
    
    public Ocorrencia getOcorrenciaPorProtocolo(String protocolo){
        Query q = em.createQuery("select o from Ocorrencia where o.protocolo := p");
        q.setParameter("p", protocolo);
        return (Ocorrencia) q.getSingleResult();
    }
    
    public List<Ocorrencia> getOcorrenciasPorAutor(Usuario user){
        Query q = em.createQuery("select o from Ocorrencia where o.autor :=u");
        q.setParameter("u", user);
        return q.getResultList();
    }
}
