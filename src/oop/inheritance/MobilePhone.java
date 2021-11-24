package oop.inheritance;

public class MobilePhone {
    // Inheritance meaning: Inheritance is a mechanism in which one class get the properties of another class.
    // example, a child inherits the properties of his/her parents.
    // inheritance type:
    // 1.Single level (ex: Class B inherits from Class A) father from grand father
    // 2.Multi level (ex: Class C inherits from Class B, and Class B inherits from Class A)
    // 3.Hierarchical level (ex: Class B and C both inherit from Class A)

    // create some properties of any mobile phone/variable and method
    // 1.variable
    public int mobilePhonePrice=1000;
    public String mobilePhoneColor="Black";
    public String mobilePhoneScreenResolution="UHD";

    private String mobilePhoneRam;

    // declare methods (mobile phone properties)
    public void camera(){
        System.out.println("mobile phone have camera");
    }
    public void clearDisplay(){
        System.out.println("mobile phone have clear Display ");
    }
    public void NFLApp(){
        System.out.println("mobile phone have NFL");
    }
    public void waterResistance(){
        System.out.println("mobile phone have water resistance feature");
    }

    // create constructor
    public MobilePhone(){
        System.out.println("this is mobile phone default constructor");
    }
    public MobilePhone(int mobilePhonePrice){
        this.mobilePhonePrice=mobilePhonePrice;
    }

    public MobilePhone(String mobilePhoneColor, String mobilePhoneScreenResolution, String mobilePhoneRam) {
        this.mobilePhoneColor = mobilePhoneColor;
        this.mobilePhoneScreenResolution = mobilePhoneScreenResolution;
        this.mobilePhoneRam = mobilePhoneRam;
    }
    // getter and setter method
    public String getMobilePhoneRam(){
        return mobilePhoneRam;
    }
    public void  setMobilePhoneRam(String mobilePhoneRam){
        this.mobilePhoneRam=mobilePhoneRam;
    }

}
