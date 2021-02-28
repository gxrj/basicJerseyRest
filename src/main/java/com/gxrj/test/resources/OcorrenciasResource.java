package com.gxrj.test.resources;

import com.gxrj.test.dao.OcorrenciaDao;
import com.gxrj.test.model.Ocorrencia;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("ocorrencias")
@Produces(MediaType.APPLICATION_JSON)
public class OcorrenciasResource{ 
        
        public OcorrenciaDao daoOcorrencia = new OcorrenciaDao(); 
        
        @GET
        public List<Ocorrencia> listOcorrencias(){
            try{
                return daoOcorrencia.getTodasOcorrencias();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                return null;
            }
                
        }
        
    
}
