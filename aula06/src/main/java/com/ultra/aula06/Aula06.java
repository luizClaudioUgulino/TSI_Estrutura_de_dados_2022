/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ultra.aula06;

/**
 *
 * @author luiz claudio
 */
public class Aula06 {

    public static void main(String[] args) {
        
        pilha p = new pilha();
        p.empilhar("UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE");

        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
        
        p.empilhar("ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG");
        
        while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
        
        
    }
}
