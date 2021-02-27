package com.gxrj.test.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Ocorrencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String protocolo;
    
    @ManyToOne
    private Usuario autor;
    private Timestamp dtPostagem;
    private String descricao;
    @OneToMany(mappedBy="ocorrencia")
    private List<Atendimento> atendientos;
    

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }

    public Timestamp getDtPostagem() {
        return dtPostagem;
    }

    public void setDtPostagem(Timestamp dtPostagem) {
        this.dtPostagem = dtPostagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Atendimento> getAtendientos() {
        return atendientos;
    }

    public void setAtendientos(List<Atendimento> atendientos) {
        this.atendientos = atendientos;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocorrencia)) {
            return false;
        }
        Ocorrencia other = (Ocorrencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gxrj.test.model.Ocorrencia[ id=" + id + " ]";
    }
    
}
