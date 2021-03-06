package com.gxrj.test.resources;

import com.gxrj.test.dao.UsuarioDao;
import com.gxrj.test.model.Usuario;
import java.util.List;
import java.util.UUID;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioResource {
    
    @EJB
    UsuarioDao daoUser;
    
    @POST
    @Path("/{cfp}/{email}/{nome}")
    public Response cadastrar(@PathParam("cpf") String cpf,
                              @PathParam("nome") String nome,
                              @PathParam("email") String email){ 
        try{
            Usuario user = new Usuario();
            user.setId(UUID.randomUUID());
            user.setCpf(cpf);
            user.setEmail(email);
            user.setNome(nome);
            daoUser.inserir(user);

            return Response.status(201).entity("Usuario criado").build();
        }
        catch(Exception e){
            return Response.status(500).entity(e.getMessage()).build();
        }
    }
    
    @GET
    public List<Usuario> listarUsuarios(){
        return daoUser.listarUsuarios();
    }
    
}
