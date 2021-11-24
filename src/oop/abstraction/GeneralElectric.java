package oop.abstraction;

public class GeneralElectric extends StealthAirCraft implements Plane {
    // Concrete class

    // declare variable
    String gePlaneName = "B777";
    int gePlanePrice = 300000000;
    int gePlaneQty;

    // create constructor
    // 1. default constructor
    public GeneralElectric() {

    }

    // single parameterized
    public GeneralElectric(String gePlaneName) {
        this.gePlaneName = gePlaneName;
    }

    // multi parameterized
    public GeneralElectric(String gePlaneName, int gePlanePrice, int gePlaneQty) {
        this.gePlaneName = gePlaneName;
        this.gePlanePrice = gePlanePrice;
        this.gePlaneQty = gePlaneQty;
    }

    public void planeCockpit() {
        System.out.println("general electric plane has Cockpit");
    }

    public void planeRudder() {
        System.out.println("general electric plane has rudder");

    }

    public void planeElevator() {
        System.out.println("general electric plane has  elevator");

    }

    public void planeEngine() {
        System.out.println("general electric plane has engine");
    }

    public void planeFuselage() {
        System.out.println("general electric plane has fuselage");
    }

    public void highSpeed() {
        System.out.println("general electric plane has high Speed functionality");
    }

    public void invisibilityToRadar() {
        System.out.println("general electric plane has invisibility To Radar feature");
    }

    public void surveillanceCamera() {
        System.out.println("general electric plane has surveillance Camera feature");
    }

    public void autoPilot() {
        System.out.println("general electric plane has auto pilot feature");
    }
}
