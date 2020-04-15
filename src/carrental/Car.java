/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrental;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Brainchild Software
 */
public class Car extends PremiumCar{
    private static final String csvFile = "D://Java Projects/CarRental/src/csv/CarList.csv";
    private static String line = "";
    private static final String cvsSplitBy = ",";
    private String[][] cars = new String[20][5];
    public int carIndex = 0;
   
    public Car() {
        this.fetchDataFromCsv();
    }
    
    /*
    *fetching the car list from csv file
    * and store it in cars
    */
    public void fetchDataFromCsv(){
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((this.line = br.readLine()) != null) {

                // use comma as separator
                String[] car = this.line.split(cvsSplitBy);
//                System.out.println(car[0]+" "+car[1]+" "+car[2]+" "+car[3]+" "+car[4]);
                this.setCarData(car);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    *
    *store car info in cars array
    */
    private void setCarData(String[] car){
        try{
            cars[carIndex] = car;
//            System.out.println(cars[carIndex][0]+"\t"+cars[carIndex][1]+"   "+cars[carIndex][2]+"  "+cars[carIndex][3]+"  "+cars[carIndex][4]+"  "+cars[carIndex][5]);
            carIndex++;
        }catch(Exception e){
            printStackTrace();
        }
    }
    
    /*
    *   print car list data
    */
    public void printCarList(){
        System.out.println("Car avaiable for Booking:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Car No.   Car Name           Seats      Transmission   Car Types   Rate/Day(s)");
        System.out.println("-------   ---------          ------     -------------  ----------  -----------");
        for(int i=0; i< carIndex; i++){
            if(i==2){
                System.out.println(cars[i][0]+"\t  "+cars[i][1]+"       "+cars[i][2]+"\t"+cars[i][3]+"\t"+cars[i][4]+"\t"+cars[i][5]);
            }else {
                System.out.println(cars[i][0]+"\t  "+cars[i][1]+"\t       "+cars[i][2]+"\t"+cars[i][3]+"\t"+cars[i][4]+"\t"+cars[i][5]);
            }
            
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total "+ carIndex+" cars avaiable.");
        System.out.println("** Note for premium cars, there's additional 5% insurance access applied to the car rate.");
        System.out.println("*****************************************************************");
    }
    
    
    /*
    *   find the car information on using index
    */
    
    public String[] findCarInfo(int index){
        return cars[index];
    }
}
