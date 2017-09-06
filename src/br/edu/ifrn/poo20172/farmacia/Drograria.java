/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo20172.farmacia;

import java.util.ArrayList;

/**
 *
 * @author João
 */
public class Drograria {
    
    private int id;
    private String nome;
    private ArrayList<Estoque> estoques = new ArrayList();
    
    public void enviarMedicamentos(){
        
    }

    public ArrayList<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(ArrayList<Estoque> estoques) {
        this.estoques = estoques;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
