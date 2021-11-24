package oop.plymorphism.methodoverriding;

public class Phantom extends Boeing {
    @Override
    public void superSonicSpeed() {
        System.out.println("phantom has a super sonic speed ");
    }
}
