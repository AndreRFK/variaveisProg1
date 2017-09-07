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
public class SufixoEPrefixo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int prefixo = 10;
        int sufixo = 40;

        int diferencaPrefixo, diferencaSufixo;

        diferencaPrefixo = ++prefixo;

        System.out.println("Diferenca" + diferencaPrefixo);
        System.out.println("Prefixo" + prefixo);

        diferencaSufixo = sufixo++;

        System.out.println("Diferenca2 " + diferencaSufixo);
        System.out.println("Sufixo" + sufixo);

        int a = 10;
        if (a++ == 11) {
            System.out.println("Sucesso");
        } else {
            System.out.println("Ferrou");
        }
    }

}
