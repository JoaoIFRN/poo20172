/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo20172.testes;

import br.edu.ifrn.poo20172.modelo.Aluno;

/**
 *
 * @author João
 */
public class TestesReferencias {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        Aluno alunoII;
        alunoII = aluno;
        alunoII.setNome("José");
        aluno = null;
        System.out.println(alunoII.getNome());
        alunoII = null;
    }
    
}
