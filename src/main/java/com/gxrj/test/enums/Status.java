package com.gxrj.test.enums;

public enum Status {
    
    respondida, em_andamento, indeferida;
    
    @Override
    public String toString(){
        switch(this){
            case respondida:
                return "Respondida";
            case em_andamento:
                return "Em andamento";
            case indeferida:
                return "Indeferida";
        }
        return null;
    }
}
