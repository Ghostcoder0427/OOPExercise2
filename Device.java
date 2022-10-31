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
public class Device {
    protected String brandName, ownerName, SerialID;
    
    public Device(String brandName, String ownerName, String SerialID) {
        this.brandName = brandName;
        this.ownerName = ownerName;
        this.SerialID = SerialID;
    }
    //Returns the name of this bicycle's owner

    public String getOwnerName() {
        return ownerName;
    }
//Assigns the name of this bicycle's owner

    public void setOwnerName(String name) {
        ownerName = name;
    }

    public String getbrandName() {
        return brandName;
    }

    public void setbrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setSerialID(String SerialID) {
        this.SerialID = SerialID;
    }

    public String getSerialID() {
        return SerialID;
    }
}
