/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Brainchild Software
 */
public class CarBooking {
    public int totalBooked;
    public float perDayRant;
    public float totalCost;
    public float totalIns = 0;
    public float perDayIns = 0;
    
    /*
        *calculate number of day user booked for a car
    */
    public void calculateBookingData(CarAndBookingDates cbDates, Car car) throws ParseException{
        if("Premium".equals(cbDates.carInfo[4])){
            perDayIns = car.getInsuranceAmmount(Integer.parseInt(cbDates.carInfo[5]));
        }
        totalBooked = cbDates.getNumberofDayBooked();
        perDayRant = Integer.parseInt(cbDates.carInfo[5])+perDayIns;
        totalIns = perDayIns * totalBooked;
        totalCost = (perDayRant*totalBooked) + totalIns;
    }
    
    
}
