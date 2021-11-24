package oop.plymorphism.methodoverriding;

public class Test {

    public static void main(String[] args) {
        // create object of Boeing class
        Boeing boeing = new Boeing();
        boeing.superSonicSpeed();

        // create object of Jet
        Jet jet = new Jet();
        jet.superSonicSpeed();

        // create object of phantom class
        Phantom phantom = new Phantom();
        phantom.superSonicSpeed();


    }
}
