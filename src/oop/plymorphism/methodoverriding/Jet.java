package oop.plymorphism.methodoverriding;

public class Jet extends Concorde implements Plane {
    @Override
    public void superSonicSpeed() {
        System.out.println("jet has a super sonic speed ");
    }

    @Override
    public void planeCockpit() {

    }

    @Override
    public void planeRudder() {

    }

    @Override
    public void planeElevator() {

    }

    @Override
    public void planeEngine() {

    }

    @Override
    public void planeFuselage() {

    }
}
