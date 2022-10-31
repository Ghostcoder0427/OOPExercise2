/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopexercise2;

/**
 *
 * @author Best Friend
 */
public class Smartphone extends Device {
    
    protected String screenSize, batteryLife;

    
//Constructor: Initialzes the data member
   public Smartphone() {
        super("", "", "");
    }

    public Smartphone(String brandName, String ownerName, String SerialID) {
        super(brandName, ownerName, SerialID);
    }
    public void setscreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getscreenSize() {
        return screenSize;
    }
    public void setbatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getbatteryLife() {
        return batteryLife;
    }


}
