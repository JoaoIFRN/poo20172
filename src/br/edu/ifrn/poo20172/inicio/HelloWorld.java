/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo20172.inicio;

import br.edu.ifrn.poo20172.modelo.Aluno;
import java.util.Date;

/**
 *
 * @author João
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(new Date());

        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno("João");
        
        aluno2.setNome("Fábio");
        

        System.out.println(aluno.getNome());
        System.out.println(aluno2.getNome());
    }
}
