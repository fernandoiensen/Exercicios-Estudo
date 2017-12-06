/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.basico.exer15;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Exerc2 {
    
    Scanner scan = new Scanner(System.in);
    
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com uma letra (F - M): ");
        String input = scan.next();
        
        if(input.equalsIgnoreCase("f")){
            
            System.out.println("F - feminino");
            
        }else if(input.equalsIgnoreCase("m")){
            
            System.out.println("M - masculino");
                
        }else{
            System.out.println("Sexo inválido");
        }
        
    }
    
}
