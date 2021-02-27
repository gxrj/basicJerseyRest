package com.gxrj.test.enums;

public enum Privilegio {
    supervisor, comum;
    
    @Override
    public String toString(){
        switch(this){
            case supervisor:
                return "Supervisor";
            case comum:
                return "Comum";
        }
        return null;
    }
}
