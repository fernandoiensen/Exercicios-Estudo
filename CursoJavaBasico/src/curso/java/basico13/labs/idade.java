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
public class idade {
    
    public static void main(String[]args){
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Qual a sua idade?");
    int idade = scan.nextInt();
    
    if(idade>=18){
    
      System.out.println("maior de idade");
    }
    else {
       
    System.out.println("Menor de idade");
    
    }
    
    }
}
