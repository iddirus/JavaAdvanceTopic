package oop.encapsulation;

public class Students {
    // Encapsulation : data hiding

    public int stId;

    private String stName;
    private String stAddress;
    private int phoneNumber;
    private double courseFee;

    // create constructor
    // default
    public Students() {

    }

    // single parameterized constructor
    public Students(int stId) {
        this.stId = stId;
    }

    // multi parameterized constructor
    public Students(int stId, String stName) {
        this.stId = stId;
        this.stName = stName;
    }
    public Students(int stId, String stName, String stAddress, int phoneNumber) {
        this.stId = stId;
        this.stName = stName;
        this.stAddress = stAddress;
        this.phoneNumber = phoneNumber;
    }
    public Students(int stId, String stName, String stAddress, int phoneNumber, double courseFee) {
        this.stId = stId;
        this.stName = stName;
        this.stAddress = stAddress;
        this.phoneNumber = phoneNumber;
        this.courseFee = courseFee;
    }

    // getter and setter method: used to access all the private properties from another class
    // 1. getter method : used to get the value, which is a return type method
    public String getStName(){
        return stName;
    }
    // 2. setter method : used to set the value, which is non return type method
    public void setStName(String stName){
        this.stName=stName;
    }

    public String getStAddress() {
        return stAddress;
    }

    public void setStAddress(String stAddress) {
        this.stAddress = stAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
}
