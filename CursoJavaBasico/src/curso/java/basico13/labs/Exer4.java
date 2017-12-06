/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.java.basico13.labs;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Exer4 {
    
    public static void main(String[] args){
                
        Scanner scan = new Scanner(System.in);
        System.out.println("primeira nota");
        double nota1 = scan.nextDouble();
        
        System.out.println("segunda nota");
        double nota2 = scan.nextDouble();
        
        System.out.println("terceia nota");
        double nota3 = scan.nextDouble();
        
        System.out.println("quarta nota");
        double nota4 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4)/4;
        
        System.out.println("A média é: " + media);
        
        
        
        
        
       
    }
}
