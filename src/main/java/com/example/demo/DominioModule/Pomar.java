package com.example.demo.DominioModule;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Pomar implements Serializable{

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String logradouro;
    private String bairro_localidade;
    private String cidade;
    private String estado;
    private String cep;

    @ManyToOne
    @JoinColumn()
    private Produtor produtor;

    @ManyToOne
    @JoinColumn()
    private RespTecnico respTecnico;

    public Pomar(Integer id, String nome, String logradouro, String bairro_localidade, String cidade, String estado,
            String cep, Produtor produtor, RespTecnico respTecnico) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro_localidade = bairro_localidade;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.produtor = produtor;
        this.respTecnico = respTecnico;
    }

    public Pomar() {
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pomar other = (Pomar) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro_localidade() {
        return bairro_localidade;
    }

    public void setBairro_localidade(String bairro_localidade) {
        this.bairro_localidade = bairro_localidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public RespTecnico getRespTecnico() {
        return respTecnico;
    }

    public void setRespTecnico(RespTecnico respTecnico) {
        this.respTecnico = respTecnico;
    
    }
}
