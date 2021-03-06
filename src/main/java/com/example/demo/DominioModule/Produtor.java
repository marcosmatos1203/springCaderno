package com.example.demo.DominioModule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produtor implements Serializable{

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
    private String email;
    private String telefone1;
    private String telefone2;
    @OneToMany(mappedBy = "produtor")
    List<Pomar> pomares = new ArrayList<>();
    
    public Produtor(Integer id, String nome, String logradouro, String bairro_localidade, String cidade, String estado,
            String cep, String email, String telefone1, String telefone2) {
        this.id = id;
        this.nome = nome;
        this.logradouro = logradouro;
        this.bairro_localidade = bairro_localidade;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }


    public Produtor() {
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
        Produtor other = (Produtor) obj;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone1() {
        return telefone1;
    }


    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }


    public String getTelefone2() {
        return telefone2;
    }


    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }


    public List<Pomar> getPomares() {
        return pomares;
    }


    public void setPomares(List<Pomar> pomares) {
        this.pomares = pomares;
    }
}
