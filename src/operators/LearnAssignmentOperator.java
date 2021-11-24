package operators;

public class LearnAssignmentOperator {
    // Assignment operator (=)
    String name = "Ronaldo";

    public static void main(String[] args) {
        // call this variable
        // create object
        LearnAssignmentOperator learnassignmentoperator = new LearnAssignmentOperator();
        System.out.println("the name is "+learnassignmentoperator.name);

        System.out.println("***************************");
        learnassignmentoperator.name= "Cristiano"; // Variable reassignment
        System.out.println("the name is "+learnassignmentoperator.name);


    }


}
