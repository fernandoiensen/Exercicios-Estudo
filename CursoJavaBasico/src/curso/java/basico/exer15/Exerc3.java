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
public class Exerc3 {
    
    public static void main(String[]args){
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Digite o primeiro número");
       int num1 = scan.nextInt();
       
            
       if(num1 >=0){
           
           System.out.println("O número é pisitivo");
       
       }else{System.out.println("O número é negativo");
       
       }
       }
    
}
