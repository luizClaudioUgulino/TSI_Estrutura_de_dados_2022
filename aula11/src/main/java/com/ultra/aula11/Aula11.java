/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ultra.aula11;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author luiz claudio
 */
public class Aula11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);       
        conferirString c = new conferirString();       
        String x = JOptionPane.showInputDialog("Por favor, digitar valor da equacao");
        JOptionPane.showMessageDialog(null,"equacao :" + c.calculo(x));
        
        
    }
}
 