/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultra.aula09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiz claudio
 */
public class Josephus {
     public static List<Integer> getResult(int n, int m) {
        List<Integer> circle = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int k = 0;

        while (circle.size() >= m) {
            k = k + m;
            k = k % (circle.size()) - 1;

            if (k < 0) {
                circle.remove(circle.size()-1);
                k = 0;
            } else {
                circle.remove(k);
            }
        }

        return circle;
}}
