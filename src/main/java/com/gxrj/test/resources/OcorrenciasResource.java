
package com.gxrj.test.resources;

import com.gxrj.test.dao.OcorrenciaDao;
import com.gxrj.test.model.Ocorrencia;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Souza
 */
@Path("ocorrencias")
@Produces(MediaType.APPLICATION_JSON)
public class OcorrenciasResource{ 
        
        public OcorrenciaDao daoOcorrencia = new OcorrenciaDao(); 

        @GET
        public List<Ocorrencia> listOcorrencias(){
            return daoOcorrencia.getTodasOcorrencias();
        }
    
}
