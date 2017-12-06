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
public class Exer7 {
    
    public static void main(String[]args){
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Entre  com o tamanho do lado do quadrado");
    double lado = scan.nextDouble();
    
    double area = Math.pow (lado, 2);
    
    System.out.println("Moste a área do quadrado: " + area);
    System.out.println("Moste a área do quadrado: " + (area * 2));
    
    }
    
}
