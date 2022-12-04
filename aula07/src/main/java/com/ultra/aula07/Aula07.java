/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ultra.aula07;

import java.util.Scanner;

/**
 *
 * @author luiz claudio
 */
public class Aula07 {

    public static void main(String[] args) {
        
int n; // número de discos

		// recebe o número de discos digitado pelo usuário
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = entrada.nextInt();

		// executa o hanoi!
		TorresDeHanoi.hanoi(n, 1, 3, 2);
	}
    }

