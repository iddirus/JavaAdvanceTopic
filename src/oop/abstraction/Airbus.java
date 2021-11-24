package oop.abstraction;

public class Airbus implements Plane, SuperSonicPlane {
    // declare variable
    int doors;
    int engineQty=4;
    // declare method
    public void airbusPlaneEngineQty(){
        System.out.println("this is airbus plane engine quantity method ");
    }

    // Implemented method
    public void planeCockpit() {
        System.out.println("airbus plane has a cockpit");
    }

    public void planeRudder() {
        System.out.println("airbus plane has a runner");
    }

    public void planeElevator() {
        System.out.println("airbus plane has a elevator");
    }

    public void planeEngine() {
        System.out.println("airbus plane has a engine");
    }

    public void planeFuselage() {
        System.out.println("airbus plane has a fuselage");
    }

    public void superSonic() {
        System.out.println("airbus plane has a super Sonic feature");
    }
}
