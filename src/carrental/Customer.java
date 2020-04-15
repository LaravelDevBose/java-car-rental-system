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
public class Customer {
    public String name;
    public String email;
    public String address;
    
   /*
        *take user information from user
    */
    public void getCustomerData(){
        System.out.println("\n");
        Scanner sca = new Scanner(System.in);
        System.out.print("\t Your name: "); 
        name = sca.nextLine();
        System.out.print("\t Your email: ");
        email = sca.nextLine();
        
        System.out.print("\t Your residential address: ");
        address = sca.nextLine();
    }
}
