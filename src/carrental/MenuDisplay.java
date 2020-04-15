/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.util.Scanner;

/**
 *
 * @author Brainchild Software
 */
public class MenuDisplay {
    
    public MenuDisplay(){
        
    }
    /*
        *take permition from user to make booking or exit
    */
    public int userPermission(){
        System.out.println("Select from one of the following Options. \n");
        System.out.println("\t 1. To make a booking");
        System.out.println("\t 2. To exit the sytem \n");
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter your selection: ");  
        return sc.nextInt(); 
    }
    
}
