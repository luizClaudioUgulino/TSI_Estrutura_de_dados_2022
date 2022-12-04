/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.ultra.aula06v2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author luiz claudio
 */
public class Aula06v2 {
private static final int CRIAR_CONTA = 1;
	private static final int CONSULTA_SALDO = 2;
	private static final int SAIR_DO_PROGRAMA = 7;
        private static final int multi = 3;
        private static final int somar = 1;
        private static final int sub = 2;
        private static final int divi = 4;
        
    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        	
		Integer opcao = lerOpcaoDoMenu();
		
		while(opcao != SAIR_DO_PROGRAMA){
			switch(opcao){
			case CRIAR_CONTA:
				calculadoInfixa();
				break;
			case CONSULTA_SALDO:
				calculadoPosInfixa();
				break; 
			case SAIR_DO_PROGRAMA:
				JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
				break;
			 default:
				 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
				 break;
			}
			
			opcao = lerOpcaoDoMenu();
		}
		
	}
	

	private static Integer lerOpcaoDoMenu(){
		String menu = "[-------- Menu ---------]";
		menu += "\n[1] - calculadora infixa ";
		menu += "\n[2] - Consultar pos-fixa";
		menu += "\n[7] - Sair";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme sua opcao: ";
		
		String strOpcao = JOptionPane.showInputDialog(null,menu);
		
		return Integer.parseInt(strOpcao);
	}


 public static void calculadoInfixa(){

     int x = 300;
     
     while(x > 0){ 
     int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do primeiro valor"));
     
     Integer opcao = operador();
		
		while(opcao != SAIR_DO_PROGRAMA){
			switch(opcao){
			case somar:
				int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor1 = valor + valor1;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor1);
				break;
			case sub:
				int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor2 = valor - valor2;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor2);
				break;
                        case divi:
				float valor3 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor3 = valor + valor3;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor3);
				break; 
                        case multi:
				float valor4 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor4 = valor + valor4;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor4);
				break;         
			case SAIR_DO_PROGRAMA:
				JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
				break;
			 default:
				 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
				 break;
			}
			
			opcao = lerOpcaoDoMenu();
		}
     
     
     
     }
     
     
     
     
     
     
   }

 public static void calculadoPosInfixa(){
int x = 300;
     
     while(x > 0){ 
     int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do primeiro valor"));
     
     Integer opcao = operador();
		
		while(opcao != SAIR_DO_PROGRAMA){
			switch(opcao){
			case somar:
				int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor1 = valor + valor1;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor1);
				break;
			case sub:
				int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor2 = valor - valor2;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor2);
				break;
                        case divi:
				float valor3 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor3 = valor + valor3;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor3);
				break; 
                        case multi:
				float valor4 = Integer.parseInt(JOptionPane.showInputDialog(null,"valor do segundo valor"));
                                valor4 = valor + valor4;
                                JOptionPane.showMessageDialog(null,"valor do calculo e :" + valor4);
				break;         
			case SAIR_DO_PROGRAMA:
				JOptionPane.showMessageDialog(null,"[Programa será encerado!]");
				break;
			 default:
				 JOptionPane.showMessageDialog(null,"Opcao Invalida!");
				 break;
			}
			
			opcao = lerOpcaoDoMenu();
		}
     
     
     
     }
     
     
     
     
     
     
     
     
   }
 
 private static Integer operador(){
		String menu = "[-------- Menu ---------]";
		menu += "\n[1] - + ";
		menu += "\n[2] - - ";
                menu += "\n[3] - / ";
                menu += "\n[4] - * ";
		menu += "\n[ ------------------------- ]";
		menu += "\nInforme sua opcao: ";
		
		String strOpcao = JOptionPane.showInputDialog(null,menu);
		
		return Integer.parseInt(strOpcao);
	}
 
}
	
	
        
       
