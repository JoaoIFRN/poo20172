/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.poo20172.testes;

import br.edu.ifrn.poo20172.modelo.*;

/**
 *
 * @author João
 */
public class TestesClassesI {
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        
        Curso curso = new Curso();
        curso.setNome("Sistemas para Internet");
        curso.setCargaHoraria(1000);
        
        //Definindo o curso do aluno
        aluno.setCurso(curso);

        //Imprimir o nome do aluno
        System.out.println(aluno.getNome());
        //Imprimir o nome do curso a partir da variável aluno
        System.out.println(aluno.getCurso().getNome());
        
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("POO");
        disciplina1.setCargaHoraria(60);
        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Estrutura de dados");
        disciplina2.setCargaHoraria(60);
        Disciplina disciplina3 = new Disciplina();
        disciplina3.setNome("WEB1");
        disciplina3.setCargaHoraria(60);
        
        //Exemplos de acesso ao atributo disciplina;
        //Inserção de disciplina no ArrayList (método add);
        curso.getDisciplinas().add(disciplina1);
        aluno.getCurso().getDisciplinas().add(disciplina2);
        //Boa prática
        curso.adicionarDisciplina(disciplina3);
        
        //Como imprimir as disciplinas do curso?
        //curso || aluno.getCurso()
        for (Disciplina disciplina : curso.getDisciplinas()){
            System.out.println(disciplina.getNome());
        }
       
        
    }
    
}
