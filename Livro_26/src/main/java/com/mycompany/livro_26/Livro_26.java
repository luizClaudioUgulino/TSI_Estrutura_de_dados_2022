/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.livro_26;

import javax.swing.JOptionPane;

/**
 *
 * @author lcunha
 */
public class Livro_26 {

    public static void main(String[] args) {
      int data = 0,mes = 0,ano = 0,dia = 0 ,x;
       
       data = (int) Float.parseFloat(JOptionPane.showInputDialog("Digite data no formato ddmmaa :"));
        
        dia = data/ 1000000;
        mes = data % 1000000;
         mes = mes / 10000; 
        ano = data %10000;
        JOptionPane.showMessageDialog(null,"\n dia:" + dia + " \n mes:" + mes + " \n ano:" + ano + "\n Data :" + mes + "/" + dia + "/" + ano  );

    }
}
