package oop.abstraction;

public abstract class StealthAirCraft {

    // 1. is not fully abstract unlike the interface which is 100% abstract
    // 2. we can declare variable, declare and assign value like regular class

    String stealthAirCraftType; // declare variable
    int StealthAirCraftPrice = 200000000; // declare and assign value


    // create abstract methods without body
    public abstract void highSpeed();
    public abstract void invisibilityToRadar();
    public abstract void surveillanceCamera();
    public abstract void autoPilot();

    // create methods same as regular class
    public void infrared() {
        System.out.println("Stealth Air Craft  has infrared feature");
    }

    // create an object : not doable
     // StealthAirCraft st = new StealthAirCraft() {
    }



