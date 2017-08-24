/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.com;

/**
 *
 * @author alunoadm
 */
public class variaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variaveis do tipo inteiro
        byte variavelDoTipoByte = 1;
        short variavel1DoTipoShort = 10;
        int variavelDoTipoInt = 100;
        long variavel1DoTipoLong = 1000;
        
        //Variaveis do tipo ponto flutuante / real
        float variavel1DoTipoFloat = 134.444f;
        double variavel1DoTipoDouble = 129999.98437289d;
        
        //variavel logica, recebe verdadeiro ou falso (true, false)
        boolean variavel1DoTipoBoolean = true;
        
        //variavel do tipo caracter
        char variavel1DoTipoCaracter = 'a';
        
        //Objeto do tipo Palavra/Texto
        String palavra = "Isto é uma string";
            
        //Se a variavelDoTipoInt for igual a 10
        if (variavelDoTipoInt == 10){
        //Imprima na tela Hello World!!!
        System.out.println("Hello World!!!");
        System.out.println("Esta variavel é do tipo short" + variavel1DoTipoShort);
        System.out.println("Esta variavel é do tipo int" + variavelDoTipoInt);
        System.out.println("Esta variavel é do tipo long" + variavel1DoTipoLong);
        System.out.println("Esta variavel é do tipo byte" + variavelDoTipoByte);
        System.out.println("Esta variavel é do tipo double" + variavel1DoTipoDouble);
        System.out.println("Esta variavel é do tipo boolean" + variavel1DoTipoFloat);
        System.out.println("Esta variavel é do tipo boolean" + variavel1DoTipoBoolean);
        System.out.println("Esta variavel é do tipo char" + variavel1DoTipoCaracter);
        System.out.println("Esta variavel é do tipo String" + palavra);
        }
    }
    
}