package oop.encapsulation;

public class TestStudents {

    public static void main(String[] args) {
        // create object of students class
        Students students = new Students();
        students.stId=100;
        System.out.println("student Id is "+students.stId);
        students.setStName("Iddir");
        System.out.println("student name is "+students.getStName());
        students.setStAddress("NJ");
        System.out.println("student address is "+students.getStAddress());
        students.setPhoneNumber(2021235);
        System.out.println("student phone number is "+students.getPhoneNumber());
        students.setCourseFee(3500.5);
        System.out.println("student course fee is  "+students.getCourseFee());
    }
}
