/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo20172.modelo;

import java.util.ArrayList;

/**
 *
 * @author João
 */
public class Curso {
    
    private String nome;
    private int cargaHoraria;
    //Exemplo com vetor
    //private Disciplina [] disciplinas = new Disciplina[10];
    private ArrayList<Disciplina> disciplinas = new ArrayList();
    
    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    
    

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
}
