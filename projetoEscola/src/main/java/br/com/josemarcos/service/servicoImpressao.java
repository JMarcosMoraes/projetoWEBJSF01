package br.com.josemarcos.service;

import java.util.Scanner;

public class servicoImpressao {

	public static void main(String[] args) {
        int numero,
            espacos,
            asteriscos;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número ímpar: ");
        numero = entrada.nextInt();
        
        if(numero%2 != 0){
            
            //Imprimindo a parte de cima do diamante
            asteriscos = 1;
            espacos = (numero-1)/2;
            for(int linha = 1 ; espacos > 0 ; linha++){
                
                //Espaços
                for(int count = 1 ; count <= espacos ; count++){
                    System.out.print(":");
                }
                
                //Asteriscos
                for(int count = 1 ; count <= asteriscos ; count++){
                    System.out.print("***");
                }
                
                espacos--;
                asteriscos += 2;
                System.out.println();
            }
            
            //Imprimindo a parte de baixo do diamante
            for(int linha=1 ; asteriscos > 0 ; linha++){
                
                //Espaços
                for(int count = 1 ; count <= espacos ; count++){
                    System.out.print(":");
                }
                
                //Asteriscos
                for(int count = 1 ; count <= asteriscos ; count++){
                    System.out.print("***");
                }
                
                espacos++;
                asteriscos -= 2;
                System.out.println();
            }
            
        }else{
            System.out.println("Não é ímpar!");
        }
        
        
    }	
  
	
	
}
