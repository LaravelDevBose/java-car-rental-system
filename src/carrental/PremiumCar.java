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
public class PremiumCar{
    
    private static final int insurance = 5;
    
    /*
        *calculate perday insurance of a primium car
    */
    public float getInsuranceAmmount(int rant){
       return (rant*insurance)/100;
    }
    
}
