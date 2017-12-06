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
public class Exer5 {
    
    public static void main(String[]args){
    
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Entre com a quantidade de metros");
        double metros = scan.nextDouble();
        
        double cm = metros * 100;
        
        System.out.println(metros + "metro é igual " + cm + " cm ");
                
        
    
    }
}
