package com.gxrj.test;

import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class AppConf extends Application {
    /*
        O método abaixo torna os recursos visíveis quando acessados via 
        requisicao http
    */
    private void addRestResourceClasses(Set<Class<?>> resources){
        resources.add(com.gxrj.test.resources.HelloWorld.class);
        resources.add(com.gxrj.test.resources.OcorrenciasResource.class);
        resources.add(com.gxrj.test.resources.UsuarioResource.class);
    }
}
