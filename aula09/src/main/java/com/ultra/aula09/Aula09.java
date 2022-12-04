/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ultra.aula09;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luiz claudio
 */
public class Aula09 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, insira o número total de pessoas:");
        int n = scanner.nextInt();
        System.out.print("Por favor, insira o tamanho do tempo:");
        int m = scanner.nextInt();
        List<Integer> res = Josephus.getResult(n, m);
        for (Integer i : res) {
            System.out.println(i);
        }
    }
    }

