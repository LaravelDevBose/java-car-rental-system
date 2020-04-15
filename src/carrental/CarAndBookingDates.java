/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.text.ParseException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Brainchild Software
 */
public class CarAndBookingDates {
    
    public int carId;
    public int carIndex;
    public String[] carInfo = new String[5];
    
    public String s_year;
    public String s_month;
    public int s_day;
    
    public String e_year;
    public String e_month;
    public int e_day;
    
    public String startDate;
    public String endDate;
    
    /*
    *   for making a booking call other function to get user input
    */
    
    public void makeABooking(){
        System.out.println("\n");
        System.out.println("To make booking: ");
        this.selectACar();
        this.getBookingDates();
    }
    
    /*
        *  take user input for car section
        * and check is selected car valid or not
    */
    
    private void selectACar(){
        Car car = new Car();
        Scanner sc=new Scanner(System.in);  
        System.out.print("\t Selecte the car number from the car list:"); 
        do{
            carId = sc.nextInt(); 
            carIndex = carId-1;
            if(carIndex < 0 || carIndex > car.carIndex){
                System.out.print("\t Invalid car selection. Try Again: ");
            }else {
                carInfo = car.findCarInfo(carIndex);
            }
        }while(carIndex < 0 || carIndex > car.carIndex);
    }
    
    /*
        *take start dates and end date for booked a car
    */
    
    private void getBookingDates(){
        
        Scanner sc=new Scanner(System.in);  
        System.out.println("\n \t Enter booking start date.");
        System.out.print("\t Please enter the year - for example '2020':"); 
        s_year = sc.nextLine();
        
        System.out.print("\t Please enter the month number - for example '6':");
        s_month = sc.nextLine();
        
        while(Integer.parseInt(s_month) < 1 || Integer.parseInt(s_month) > 12){
            System.out.print("\t !invalid month entry, try again: ");
            s_month = sc.nextLine();
        }
        
        
        System.out.print("\t Please enter the day number - for example '21':");
        s_day = sc.nextInt();
        while(s_day < 1 || s_day > 31){
            System.out.print("\t !invalid day entry, try again: ");
            s_day = sc.nextInt();
        }
        
        
        System.out.println("\n \t Enter booking end date.");
        
        System.out.print("\t Please enter the year - for example '2020':"); 
        e_year = sc.next();
        while(Integer.parseInt(s_year) > Integer.parseInt(e_year)){
            System.out.print("\t !invalid year entry, try again: ");
            e_year = sc.next();
        }
        
        System.out.print("\t Please enter the month number - for example '6':");
        e_month = sc.next();
        
        while((Integer.parseInt(e_month) < Integer.parseInt(s_month) && Integer.parseInt(s_year) == Integer.parseInt(e_year))
                || Integer.parseInt(e_month) < 1 || Integer.parseInt(e_month) > 12){
            System.out.print("\t !invalid month entry, try again: ");
            e_month = sc.next();
        }
        
        System.out.print("\t Please enter the day number - for example '21':");
        e_day = sc.nextInt();
        while(e_day < 1 || e_day > 31){
            System.out.print("\t !invalid day entry, try again: ");
            e_day = sc.nextInt();
        }
    }
    
    /*
        *calculate number of day user booked for a car
    */
    
    public int getNumberofDayBooked() throws ParseException{
        startDate = s_year+"-"+s_month+"-"+s_day;
        endDate = e_year+"-"+e_month+"-"+e_day;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
        Date dateObj1 = sdf.parse(startDate+" 00:00 AM");
        Date dateObj2 = sdf.parse(endDate+" 00:00 AM");
        
        long diff = dateObj2.getTime() - dateObj1.getTime();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }
}
