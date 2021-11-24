package oop.inheritance;

public class Android extends MobilePhone{

    public int androidPrice = 1200;
    public String androidColor = "Silver";
    public String androidScreenResolution = "HD+";

    private String androidRam;

    public void getMobilePhoneInfo(){
        // calling super class variable
        System.out.println(super.mobilePhoneColor);
        // calling super class method
        super.clearDisplay();
    }

    // create android methods

    public void touchControl() {
        System.out.println("Android have touch control feature");
    }

    public void connectivity() {
        System.out.println("Android have connectivity feature");
    }

    public void storage() {
        System.out.println("Android have storage feature");
    }

    // create constructor
    public Android() {
        super(); //
        System.out.println("this is android class default constructor");
    }

    public Android(int androidPrice, String androidColor) {
        this.androidPrice = androidPrice;
        this.androidColor = androidColor;
    }

    public Android(int androidPrice, String androidColor, String androidScreenResolution, String androidRam) {
        this.androidPrice = androidPrice;
        this.androidColor = androidColor;
        this.androidScreenResolution = androidScreenResolution;
        this.androidRam = androidRam;
    }
    // getter and setter method


    public String getAndroidRam() {
        return androidRam;
    }

    public void setAndroidRam(String androidRam) {
        this.androidRam = androidRam;
    }
}
