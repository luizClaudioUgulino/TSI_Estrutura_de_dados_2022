/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_44;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Claudio
 */
public class Livro_44 {

    public static void main(String[] args) {
        double num, base, logaritmo;
        num = (double) Float.parseFloat(JOptionPane.showInputDialog(" entre com o logaritmando: "));
        base = (double) Float.parseFloat(JOptionPane.showInputDialog(" entre com a base: "));
         logaritmo = Math.log(num) / Math.log(base);
         
            JOptionPane.showMessageDialog(null,"logaritmoando : "+ Math.log(num) + "\n base : "+ Math.log(base) + "\n logaritmo: " + logaritmo);
                
    }
}
