package oop.inheritance;

public class Sony extends Android{

    public int sonyPrice = 800;
    public String sonyColor = "Blue clear";
    public String sonyScreenResolution = "10*7 inches";

    private String sonyRam;

    public void getAndroidInfo(){
        // calling super class variable
        System.out.println(super.mobilePhoneColor);
        // calling super class method
        super.getMobilePhoneRam();
        super.getAndroidRam();


    }

    // create constructor
    public Sony() {
        super(); //
        System.out.println("this is Sony class default constructor");
    }

    public Sony(int sonyPrice, String sonyColor, String sonyScreenResolution, String sonyRam) {
        this.sonyPrice = sonyPrice;
        this.sonyColor = sonyColor;
        this.sonyScreenResolution = sonyScreenResolution;
        this.sonyRam = sonyRam;
    }

    // create android methods

    public void battery() {
        System.out.println("Sony have a good battery");
    }

    public void processor() {
        System.out.println("Sony have processor feature");
    }

    public void largeDisplay() {
        System.out.println("Sony have  large Display feature");
    }

    // getter and setter methods


    public String getSonyRam() {
        return sonyRam;
    }

    public void setSonyRam(String sonyRam) {
        this.sonyRam = sonyRam;
    }
}
