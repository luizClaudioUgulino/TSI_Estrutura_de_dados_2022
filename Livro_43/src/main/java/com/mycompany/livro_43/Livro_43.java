/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_43;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Claudio
 */
public class Livro_43 {

    public static void main(String[] args) {
        double num, logaritmo; 
        num = (double) Float.parseFloat(JOptionPane.showInputDialog(" entre com o logaritmando: "));
        logaritmo = Math.log(num) / Math.log(10);
        
         JOptionPane.showMessageDialog(null,"logaritmo: "+ logaritmo);
    }
}
