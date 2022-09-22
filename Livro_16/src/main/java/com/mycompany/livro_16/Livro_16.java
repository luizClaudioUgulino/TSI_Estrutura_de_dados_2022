/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_16;

import javax.swing.JOptionPane;

/**
 *
 * @author lcunha
 */
public class Livro_16 {

    public static void main(String[] args) {
       
        int x = (int) Float.parseFloat(JOptionPane.showInputDialog("Valor do x ?"));
       JOptionPane.showMessageDialog(null,"valor de x : "+ x);
    }
}
