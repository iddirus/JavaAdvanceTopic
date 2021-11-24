package databaseconnection;

public class Students {

    private String stFirstName;
    private String stLastName;
    private String stScore;
    private String stId;

    // create constructor

    public Students(){

    }
    public Students(String stFirstName){
        this.stFirstName=stFirstName;
    }

    public Students(String stFirstName,String stLastName){
        this.stFirstName=stFirstName;
        this.stLastName= stLastName;
    }

    public Students(String stFirstName, String stLastName, String stScore) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stScore = stScore;
    }

    public Students(String stFirstName, String stLastName, String stScore, String stId) {
        this.stFirstName = stFirstName;
        this.stLastName = stLastName;
        this.stScore = stScore;
        this.stId = stId;
    }

    // create method
    public void studentsInformation(){
        System.out.println("This is students Information method");
    }

    // getter and setter method fpr the private variable


}
