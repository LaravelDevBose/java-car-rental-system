/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.text.ParseException;


/**
 *
 * @author Brainchild Software
 */
public class CarRental {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        System.out.println("***********************************************************************************");
        System.out.println("\t \t \t Welcome To Carrington Car Rental");
        System.out.println("***********************************************************************************");
        Car car = new Car();
        
        MenuDisplay mDisplay = new MenuDisplay();
        
        CarBooking carbooking = new CarBooking();
        
        CarAndBookingDates cbDates = new CarAndBookingDates();
        
        Customer cus = new Customer();
        
        PrintBookingDetails printBooking = new PrintBookingDetails();
        
        
        car.printCarList();
        int permission = mDisplay.userPermission();
        
            
        while(permission != 2){
            cbDates.makeABooking();
            cus.getCustomerData();
            System.out.println("------------------------------------------------------------------------");
            
            carbooking.calculateBookingData(cbDates, car);
            printBooking.printBookingInfo(cus, cbDates, carbooking);
            permission = mDisplay.userPermission();
        }
        System.out.println("exit..."); 
        // Terminate JVM 
        System.exit(0); 
    }
    
    
}
