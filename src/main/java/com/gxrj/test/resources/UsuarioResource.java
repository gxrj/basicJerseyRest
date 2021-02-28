package com.gxrj.test.resources;

import com.gxrj.test.dao.UsuarioDao;
import com.gxrj.test.model.Usuario;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {
    
    @EJB
    UsuarioDao daoUser;
    
    @POST
    @PathParam("{cfp}/{email}/{nome}")
    public void cadastrar(Usuario user){   
       daoUser.inserir(user);
    }
    
}
