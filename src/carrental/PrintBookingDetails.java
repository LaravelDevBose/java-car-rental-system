/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

/**
 *
 * @author Brainchild Software
 */
public class PrintBookingDetails {
    
    /*
        * print customer informatio
        * booking details and amount of booked
    */
    
    public void printBookingInfo(Customer cus, CarAndBookingDates cbDates, CarBooking carbooking){
       
        System.out.println("\t Thank for your booking "+ cus.name);
        System.out.println("\t Email \t \t "+ cus.email);
        System.out.println("\t Address \t "+ cus.address);
        System.out.println("\t - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("\n");
        System.out.println("\t Booking Confirmed \n");
        System.out.println("\t Here's your booking summery");
        System.out.println("\t - - - - - - - - - - - - - - - - - - - - - - -");
        
        System.out.println("\t Car Selected \t \t \t"+ cbDates.carInfo[1]);
        System.out.println("\t Start date \t \t \t"+cbDates.startDate);
        System.out.println("\t End Date \t \t \t" + cbDates.endDate);
        System.out.println("\t Number of days booked \t \t"+ carbooking.totalBooked);
        System.out.println("\t Car rate per day \t \t"+carbooking.perDayRant);
        System.out.println("\t _______________________________________________________ \n");
        System.out.println("\t Total cost \t \t \t"+carbooking.totalCost);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("******************************************************");
    }
}
