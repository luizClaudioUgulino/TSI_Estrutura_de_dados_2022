/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultra.lista07;

import javax.swing.JOptionPane;

/**
 *
 * @author luiz claudio
 */
public class Pilha7 {
    /*atributos*/
    int[] pilha = new int[20]; //estrutura da pilha
    int topopilha = -1; //indicar o topo da pilha
    
    /*metodos*/
    void imprimir(int topo){ //Imprime a pilha
        for(int i=topo; i >= 0; i--){
            System.out.println("Valor na pilha..: "+this.pilha[i]);
        }
    }
    
    int push(int topo, int num){ //insere elementos na pilha
        this.topopilha = topo;
        this.topopilha++;
        
        if(this.topopilha<0){
            this.topopilha = 0;
        }
        
        if(this.topopilha > 19){
            JOptionPane.showMessageDialog(null,"Estouro de pilha, Erro: -999");
            return(this.topopilha--);
        }else{
            this.pilha[this.topopilha] = num;
            return(this.topopilha);
        }
    }
    
    int pop(int topo){ //retirar elementos da pilha
        this.topopilha = topo;
        this.topopilha--;
        
        if(this.topopilha<-1){
           JOptionPane.showMessageDialog(null,"Pilha vazia!!! Erro..: -997");
           return(-997);
        }else{
            return(this.pilha[this.topopilha+1]);
        }     
    }
}
