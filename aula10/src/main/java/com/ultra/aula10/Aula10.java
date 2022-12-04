/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ultra.aula10;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz claudio
 */
public class Aula10 {

    public static void main(String[] args) {
       double vetor[];
       vetor = new double[1000];
       
       Random gerador = new Random();
       Pilha p = new Pilha();
       
        
    int vet[] = new int[1000];
    int aux = 0;

    //lendo os valores do vetor
    for (int i = 0; i < vet.length; i++) {
        //vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o elemento " + i));
        vet[i] = gerador.nextInt(-9999,9999);
        
    }

    //ordenação
    for (int i = 0; i < vet.length; i++) {
        for (int j = 0; j < vet.length - 1; j++) {
            if (vet[j] > vet[j + 1]) {
                aux = vet[j];
                vet[j] = vet[j + 1];
                vet[j + 1] = aux;
            }
            
        }
    }

    //imprimindo valores do vetor ordenado
    for (int i = 0; i < vet.length; i++) {
       // JOptionPane.showMessageDialog(null, "Valor da posição " + i + " -->" + vet[i]);
         System.out.println(" linha " + i + " -->" + vet[i]);
    }
  
       
       
       
       
    }
    
   
    
}
