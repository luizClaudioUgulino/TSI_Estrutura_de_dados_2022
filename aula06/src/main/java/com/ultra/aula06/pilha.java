/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ultra.aula06;

/**
 *
 * @author luiz claudio
 */
public class pilha {
  public Object[] pilha;
  public int posicaoPilha;
  
  public pilha() {
  this. posicaoPilha = -1;
        this.pilha = new Object[1000]; // 
}
  
  public boolean pilhaVazia() {
        if (this. posicaoPilha == -1) {
            return true;
        }
        return false;
}
  
  public int tamanho() {
        if (this.pilhaVazia()) {
            return 0; 
        }
        return this. posicaoPilha + 1;
}
  
  public void empilhar(Object valor) {
        
        if (this. posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
}
  public Object desempilhar() {
       
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this. posicaoPilha --];
 
}
  
  
  
}
