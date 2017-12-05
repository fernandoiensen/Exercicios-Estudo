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
public class loopWhile {
    
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        int i= 1;
        int max = 10;
        
        System.out.println("Contando até " + max);
        
        while (i< max){
            
            System.out.println("valor de i: " + i);
            i++;
            
        }
        
        
    }
    
}
