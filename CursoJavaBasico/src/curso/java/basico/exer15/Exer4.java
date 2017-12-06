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
public class Exer4 {
    
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Primeira nota");
        double nota1 = scan.nextDouble();
        
        System.out.println("Segunda nota");
        double nota2 = scan.nextDouble();
        
        double media = (nota1 + nota2)/2;
        
        if(media >= 10){
            
            System.out.println("Aprovado com distinção");
           
        }else if (media >= 7){ 
            
            System.out.println("aprovado");
        }else {
            
            System.out.println("Reprovado");
    }
    }
    
}
