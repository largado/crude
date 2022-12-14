package com.crude.crude;

import jakarta.persistence.*;

@Entity
@Table(name= "funcionarios")
public class Funcionario {

    private long id;
    private String nome;
    private String sobreNome;
    private String emailId;

    public Funcionario(){

    }

    public Funcionario(String nome, String sobreNome, String emailId){
        this.sobreNome = sobreNome;
        this.nome = nome;
        this.emailId = emailId;


    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    @Column(name = "primeiro_nome", nullable = false)
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    @Column(name = "segundo_nome", nullable = false)
    public String getSobreNome(){
        return sobreNome;
    }
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }

    @Column(name = "email_address", nullable = false)
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }

}
