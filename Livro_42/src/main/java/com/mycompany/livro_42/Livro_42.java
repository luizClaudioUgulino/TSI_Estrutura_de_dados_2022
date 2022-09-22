/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_42;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Claudio
 */
public class Livro_42 {

    public static void main(String[] args) {
        double rang,angulo;
         JOptionPane.showMessageDialog(null,"Calculo de angulo Seno,Cosseno e tangente");
         angulo = (double) Float.parseFloat(JOptionPane.showInputDialog("valor do angulo :"));
         rang = (angulo * Math.PI) /180;
         
         JOptionPane.showMessageDialog(null,"\n seno: " + Math.sin(rang)+ "\n cosseno: " + Math.cos(rang)+ "\n tangente: "+ Math.tan(rang));
         JOptionPane.showMessageDialog(null,"\n senocante: " + 1/Math.sin(rang)+ "\n cossenocante: " + 1/Math.cos(rang)+ "\n tangentecante: "+ 1/Math.tan(rang));
    }
}
