
package com.gxrj.test.dao;

import com.gxrj.test.model.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UsuarioDao {
    
    @PersistenceContext
    EntityManager em;
    
    public void inserir(Usuario u){
        em.persist(u);
    }
    
    public void alterar(Usuario u){
        em.merge(u);
    }
    
    public void excluit(Usuario u){
        em.remove(em.merge(u));
    }
    
}
