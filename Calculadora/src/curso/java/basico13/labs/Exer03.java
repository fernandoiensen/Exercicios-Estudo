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
public class Exer03 {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o primeiro número");
        int num1 = scan.nextInt();
        System.out.println("digite o segundo número");
        int num2 = scan.nextInt();
        
        int soma = num1 + num2;
        
        System.out.println("a soma dos números:" + soma);
        
        
    }
    
}
