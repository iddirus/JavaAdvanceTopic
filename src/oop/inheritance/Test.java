package oop.inheritance;

public class Test {

    public static void main(String []args){
        // create object of android class
        Android android = new Android();
        android.connectivity();
        android.waterResistance();
        android.clearDisplay();
        System.out.println(android.androidScreenResolution);
        System.out.println(android.mobilePhoneScreenResolution);
        System.out.println("**********samsung class ******************");
        // create object of samsung class
        Samsung samsung = new Samsung();
        samsung.fingerPrintLock(); // from samsung
        samsung.touchControl(); // from android
        samsung.NFLApp(); // from mobile phone
        // call some variables
        System.out.println(samsung.mobilePhonePrice); // from mobile phone
        System.out.println(samsung.androidColor); // from android
        System.out.println(samsung.samsungScreenResolution);
        System.out.println("********sony class *********************");
        // create object of sony class
        Sony sony = new Sony();
        // call methods
        sony.camera();
        sony.storage();
        sony.largeDisplay();
        // call variables
        System.out.println(sony.mobilePhonePrice);
        System.out.println(sony.androidPrice);
        System.out.println(sony.sonyColor);

    }
}
