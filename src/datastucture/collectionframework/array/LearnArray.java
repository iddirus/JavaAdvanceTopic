package datastucture.collectionframework.array;

public class LearnArray {

    public static String profession;
    public int age;

    // declare an array
    public static String[] states;

    // declare an array with length in global level
    public static String[] daysOfTheWeek = new String[7];


    public static void main(String[] args) {
        String name, address, email;
        String firstName, lastName;

        // variable
        String schoolName = "NYC"; // this is variable which can hold only one single value

        // Array: [] dimension/ square bracers
        // syntax
        // data type [] arrayName={};
        // declare an array
        String[] students;
        // declare and assign value to an array
        String[] NYSchools = {"Laguardia", "Queens College", "NYU", "The Bronx College", "Manhattan School"};

        // call a single variable
        System.out.println("*****calling variable ****************");
        System.out.println(schoolName);

        // call array values
        System.out.println("*****calling Array ****************");
        System.out.println(NYSchools[0]);
        System.out.println(NYSchools[3]);
        System.out.println(NYSchools[4]);
        System.out.println(NYSchools[1]);
        // print two values from array
        System.out.println(NYSchools[0] + "  second value is : " + NYSchools[1]);

        // call static global variable
        profession = "QA engineer"; // assign value to variable
        System.out.println(LearnArray.profession);
        // assign value to non static variable (age)
        LearnArray learnArray = new LearnArray();
        learnArray.age = 40;
        System.out.println(learnArray.age);

        // Assign value to an array declared in global level
        states = new String[]{"NY", "NJ", "CT"};
        System.out.println(LearnArray.states[0]);
        System.out.println(LearnArray.states[2]);
        System.out.println("***print single value after assign values to an array with length from global level***");

        // assign value to an array with length from global level
        learnArray.daysOfTheWeek[0] = "Monday";
        LearnArray.daysOfTheWeek[1] = "Tuesday";
        learnArray.daysOfTheWeek[2] = "Wednesday";
        learnArray.daysOfTheWeek[3] = "Thursday";
        learnArray.daysOfTheWeek[4] = "Friday";
        learnArray.daysOfTheWeek[5] = "Saturday";
        learnArray.daysOfTheWeek[6] = "Sunday";
        // print any value
        System.out.println("First day of the week is : " + LearnArray.daysOfTheWeek[0]);
        System.out.println("Last day of the week is : " + LearnArray.daysOfTheWeek[6]);
        // Array Index Out Of Bounds Exception
        // System.out.println(daysOfTheWeek[7]); 7 is out of the length declared in the array
        // to handle this exception we use try and catch
        try {
            System.out.println(daysOfTheWeek[7]);
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        System.out.println("****************print all the value from an array using for loop***************");
        
        // how to print all the value from an array using for loop
       for (int i=0;i<daysOfTheWeek.length;i++){
           System.out.println("days of the week are :"+daysOfTheWeek[i]);
       }

        System.out.println("***print single value after assign values to an array with length from local level***");

        // declare an array with length in local level inside main method
        String[] monthsOfTheYear = new String[12];

        // assign value to an array with length from local level
        monthsOfTheYear[0] = "January";
        monthsOfTheYear[1] = "February";
        monthsOfTheYear[2] = "March";
        monthsOfTheYear[3] = "April";
        monthsOfTheYear[4] = "May";
        monthsOfTheYear[5] = "June";
        monthsOfTheYear[6] = "July";
        monthsOfTheYear[7] = "August";
        monthsOfTheYear[8] = "September";
        monthsOfTheYear[9] = "October";
        monthsOfTheYear[10] = "November";
        monthsOfTheYear[11] = "December";
        // print single value
        System.out.println("the third month of the year is :" + monthsOfTheYear[2]);
        System.out.println("the first month of the year is :" + monthsOfTheYear[0]);
        System.out.println("the last month of the year is :" + monthsOfTheYear[11]);
        // System.out.println(monthsOfTheYear[12]);
        // handle the exception we use try and catch bloc
        try {
            System.out.println(monthsOfTheYear[12]);
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        System.out.println("****************print all the value from an array using for loop***************");
        for (int j=0;j<monthsOfTheYear.length;j++){
            System.out.println("Months of the year are : "+monthsOfTheYear[j]);
        }

        System.out.println("****************Other approach using for loop***************");

        // if there we think there is any exception use all this for loop inside try catch bloc
        // to print the length of the array
        System.out.println("array length is : "+monthsOfTheYear.length);
        try{
            for (int j=0;j<monthsOfTheYear.length;j++){
                System.out.println("Months of the year are : "+monthsOfTheYear[j]);
            }
        }catch(Exception e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }

        // retrieve/ print all the value using for each loop
        System.out.println("***** print all the value using for each loop *********");
        for (String days : daysOfTheWeek){
            System.out.println("days of the week : "+days);
        }
        // print all data for moths of the year using for each loop
        System.out.println("**** for each loop months of the year *******************");
        for (String months : monthsOfTheYear){
            System.out.println("moths of the year : "+months);
        }



        
        


    }


}
