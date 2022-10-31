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
public class Laptop extends Device {

    protected String displayType, storage;

//Constructor: Initialzes the data member
    public Laptop() {
        super("", "", "");
    }

    public Laptop(String brandName, String ownerName, String SerialID) {
        super(brandName, ownerName, SerialID);
    }

    public void setdisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getdisplayType() {
        return displayType;
    }

    public void setstorage(String storage) {
        this.storage = storage;
    }

    public String getstorage() {
        return storage;
    }

}
