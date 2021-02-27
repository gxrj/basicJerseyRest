package com.gxrj.test.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Atendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID protocolo;
    @ManyToOne
    private Ocorrencia ocorrencia;
    @ManyToOne
    private Tecnico responsavel;
    private String descricao;
    private Timestamp dtExecucao;
    
    public UUID getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(UUID protocolo) {
        this.protocolo = protocolo;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Tecnico getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Tecnico responsavel) {
        this.responsavel = responsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getDtExecucao() {
        return dtExecucao;
    }

    public void setDtExecucao(Timestamp dtExecucao) {
        this.dtExecucao = dtExecucao;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (protocolo != null ? protocolo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the protocolo fields are not set
        if (!(object instanceof Atendimento)) {
            return false;
        }
        Atendimento other = (Atendimento) object;
        if ((this.protocolo == null && other.protocolo != null) || (this.protocolo != null && !this.protocolo.equals(other.protocolo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gxrj.test.model.Atendimento[ id=" + protocolo + " ]";
    }
    
}
