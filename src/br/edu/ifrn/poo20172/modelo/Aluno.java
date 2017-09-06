/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo20172.modelo;

import java.util.Date;

/**
 *
 * @author João
 */
public class Aluno {
    
    private String nome;
    private Date dataNascimento;
    private Curso curso;
    
    public Aluno(){       
        this.nome = "Aluno sem nome";
    }
    
    public Aluno (String nome){
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
    @Override
    public String toString(){
        return nome;
    }
}
