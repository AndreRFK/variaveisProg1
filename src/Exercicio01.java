/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunoadm
 */
import javax.swing.*;
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

String saida="";
String entrada=JOptionPane.showInputDialog("Entre com um numero");

int i = Integer.parseInt(entrada);

if(i % 2 == 0)
saida+="O numero é par";
else
saida+="O numero é impar";

JOptionPane.showMessageDialog(null,
"Valor "+saida,"Testa numero ",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);

}
} 