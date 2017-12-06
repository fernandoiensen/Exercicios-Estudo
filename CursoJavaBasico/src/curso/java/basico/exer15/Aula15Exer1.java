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
public class Aula15Exer1 {
    
   public static void main(String[]args){
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Digite o primeiro número");
       int num1 = scan.nextInt();
       
       System.out.println("Digite o segundo número");
       int num2 = scan.nextInt();
       
       if(num1 > num2){
           
           System.out.println("primeiro é maior que o segundo: " + num1);
       
       }else{System.out.println("segundo é maior que o primeiro: " + num2);
           
           
       
       }
       
       
       
       

}
    
}
