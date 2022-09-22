/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.licro_40;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Claudio
 * 
 * Entrar com dois numeros inteiros e imprimir a seguinte saída:
dividendo
divisor:
quociente:
resto
prog leal3
int quoc, rest, vali, va12;
imprima "\nentre com o dividendo:
leia vali;
imprima "\nentre com divisor.-
leia val2,
quoc <- vali div val2,
rest <- vali % va12;
imprima "\n\n\n",
imprima "\ndividendo ", vali,
imprima "\ndivisor ", va12,
imprima "\nquociente ", quoc,
imprima "\nresto ", rest,
imprima "\n",
fimprog
* 
 */
public class Licro_40 {

    public static void main(String[] args) {
       double quoc, rest, vali, va12;
       
       vali = (double) Float.parseFloat(JOptionPane.showInputDialog("Valor do dividendo :"));
          va12 = (double) Float.parseFloat(JOptionPane.showInputDialog("Valor do divisor :"));
          
          quoc = vali / va12 ;
          rest = vali % va12;
          
          JOptionPane.showMessageDialog(null,"\n dividendo: "+vali+"\n divisor: "+ va12 + "\n quociente: " + quoc + "\n resto: " + rest);
           
    }
}
