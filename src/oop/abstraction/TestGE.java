package oop.abstraction;

public class TestGE {

    public static void main(String[] args) {
        // create object of general electric class
        GeneralElectric generalElectric = new GeneralElectric();
        generalElectric.planeCockpit();
        generalElectric.planeEngine();
        generalElectric.planeRudder();
        System.out.println("Plane price is "+generalElectric.gePlanePrice);
        System.out.println("Plane name is "+generalElectric.gePlaneName);
        generalElectric.autoPilot();
        generalElectric.invisibilityToRadar();
        System.out.println("Price is "+generalElectric.StealthAirCraftPrice);
        // create object of airbus class
        Airbus airbus = new Airbus();
        airbus.superSonic();
        airbus.planeEngine();
        airbus.planeFuselage();
        airbus.airbusPlaneEngineQty();
        System.out.println("airbus engine quantity "+ airbus.engineQty);
    }

}
