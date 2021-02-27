package com.gxrj.test.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CategoriaServico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private String descricao;
    @ManyToOne
    private Secretaria secretaria;
    @OneToMany(mappedBy="categoria")
    private List<Servico> servicos;
    @ManyToOne
    private CategoriaServico categoriaMae;
    @OneToMany(mappedBy="categoriaMae")
    private List<CategoriaServico> subCategorias;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(List<Servico> servicos) {
        this.servicos = servicos;
    }

    public CategoriaServico getCategoriaMae() {
        return categoriaMae;
    }

    public void setCategoriaMae(CategoriaServico categoriaMae) {
        this.categoriaMae = categoriaMae;
    }

    public List<CategoriaServico> getSubCategorias() {
        return subCategorias;
    }

    public void setSubCategorias(List<CategoriaServico> subCategorias) {
        this.subCategorias = subCategorias;
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
        if (!(object instanceof CategoriaServico)) {
            return false;
        }
        CategoriaServico other = (CategoriaServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.gxrj.test.model.CategoriaServico[ id=" + id + " ]";
    }
    
}
