/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultra.aula11;

/**
 *
 * @author luiz claudio
 */
public class conferirString {
     
    char vetor[] = new char[1000];
    int abre;
    int fecha;
 
    
    String correto = "correto";
    String errado = "errado";
    
    public String calculo(String entrada){
    
        String myString = entrada;
        char[] myChars = myString.toCharArray();
        for (int i=0; i<myChars.length; i++){
            System.out.println(myChars[i]);
           
            if(myChars[i] == '('){
            abre++;
            
            } else if( myChars[i] == ')'){
            fecha++;
            } 
        }
        
        if(abre == fecha){
        return correto;
        }else if(abre != fecha){
        return errado;
        }

        return null;
    
    
    
    
    
}}




