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
public class Variaveis {
    
    int a;
    Aluno aluno;
    
    public static void main(String[] args) {
        float resultado = 0.0f;
        float numerador = 4.6f;
        double denominador = 5.8;
        resultado = (float) (numerador / denominador);
        resultado = (float) denominador;      
        int a = 0;
        System.out.println(a);
        
        Variaveis variaveis = new Variaveis();
        System.out.println(variaveis.a);
        System.out.println(variaveis.aluno);
        
        
    }
    
}
