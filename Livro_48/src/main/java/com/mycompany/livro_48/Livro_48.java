/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_48;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Claudio
 */
public class Livro_48 {

    public static void main(String[] args) {
        double sm, qtdade, preco, vp, vd; 
         sm  = (double) Float.parseFloat(JOptionPane.showInputDialog("entre com o salário mínimo"));
         qtdade  = (double) Float.parseFloat(JOptionPane.showInputDialog("entre com a quantidade em quilowatt"));
        
         preco = sm/700;
         vp = preco*qtdade;
         vp = vp * 0.9;
         
          JOptionPane.showMessageDialog(null,"preço do quilowatt : "+ preco + "\n valor a ser pago: "+ vp);
        
    }
}
