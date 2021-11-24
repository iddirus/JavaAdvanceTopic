package oop.inheritance;

public class Samsung extends Android {

    public int samsungPrice = 900;
    public String samsungColor = "white";
    public String samsungScreenResolution = "10 inches";

    private String samsungRam;

    public void getAndroidInfo(){
        // calling super class variable
        System.out.println(super.mobilePhoneColor);
        // calling super class method
        super.getMobilePhoneRam();
        super.getAndroidRam();
    }

    // create constructor
    public Samsung() {
        super(); //
        System.out.println("this is samsung class default constructor");
    }

    public Samsung(int samsungPrice, String samsungColor, String samsungScreenResolution, String samsungRam) {
        this.samsungPrice = samsungPrice;
        this.samsungColor = samsungColor;
        this.samsungScreenResolution = samsungScreenResolution;
        this.samsungRam = samsungRam;
    }

    // create android methods

    public void fingerPrintLock() {
        System.out.println("Samsung have finger Print Lock feature");
    }

    public void bluetooth() {
        System.out.println("Samsung have bluetooth feature");
    }

    public void runTwoAppsAtOnce() {
        System.out.println("Samsung have runTwoAppsAtOnce feature");
    }

    // getter and setter methods


    public String getSamsungRam() {
        return samsungRam;
    }

    public void setSamsungRam(String samsungRam) {
        this.samsungRam = samsungRam;
    }
}
