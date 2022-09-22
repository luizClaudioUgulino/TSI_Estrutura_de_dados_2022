/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_41;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Claudio
 */
public class Livro_41 {

    
    public static void main(String[] args) {
        int a,b,c,d,mp;
        JOptionPane.showMessageDialog(null,"Calculo media ponderada");
        a = (int) Float.parseFloat(JOptionPane.showInputDialog("valor 1 :"));
        b = (int) Float.parseFloat(JOptionPane.showInputDialog("valor 2 :"));
        c = (int) Float.parseFloat(JOptionPane.showInputDialog("valor 3 :"));
        d = (int) Float.parseFloat(JOptionPane.showInputDialog("valor 4 :"));
        
         mp = (a*2 + b*2 + c*2 + d * 2)/10;
        
        JOptionPane.showMessageDialog(null,"media ponderada: "+ mp);
    }
    
     
}
