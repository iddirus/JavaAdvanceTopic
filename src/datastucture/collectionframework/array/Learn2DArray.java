package datastucture.collectionframework.array;

public class Learn2DArray {

    // 2D Array: multidimensional array / array of arrays
    // data in 2d array is stored in a tabular form (rows major order)
    // syntax:
    // datatype [1st dimension][2nd dimension]arrayName= new datatype[size1][size2];

    // declare 2DArray with length
    static String[][] studentsInformation = new String[4][5];

    public static void main(String[] args) {
        // how to insert data to 2D Array

        Learn2DArray.studentsInformation[0][0] = "StudentId";
        Learn2DArray.studentsInformation[0][1] = "StudentFirstname";
        Learn2DArray.studentsInformation[0][2] = "StudentLastName";
        Learn2DArray.studentsInformation[0][3] = "StudentEmail";
        Learn2DArray.studentsInformation[0][4] = "StudentAddress";

        Learn2DArray.studentsInformation[1][0] = "100";
        Learn2DArray.studentsInformation[1][1] = "iddir";
        Learn2DArray.studentsInformation[1][2] = "hadjal";
        Learn2DArray.studentsInformation[1][3] = "iddir@gmail.com";
        Learn2DArray.studentsInformation[1][4] = "jersey city,NJ";

        Learn2DArray.studentsInformation[2][0] = "101";
        Learn2DArray.studentsInformation[2][1] = "Farid";
        Learn2DArray.studentsInformation[2][2] = "Saidi";
        Learn2DArray.studentsInformation[2][3] = "farid@gmail.com";
        Learn2DArray.studentsInformation[2][4] = "long Island,NY";

        Learn2DArray.studentsInformation[3][0] = "102";
        Learn2DArray.studentsInformation[3][1] = "Eva";
        Learn2DArray.studentsInformation[3][2] = "messaad";
        Learn2DArray.studentsInformation[3][3] = "eva@gmail.com";
        Learn2DArray.studentsInformation[3][4] = "manhattan,NY";

        System.out.println(Learn2DArray.studentsInformation[0][3]);
        System.out.println("student first name is : " + Learn2DArray.studentsInformation[3][1]);
        // handle the exception
        try {
            System.out.println("student first name is : " + Learn2DArray.studentsInformation[3][5]);
        }catch (Exception e){
            System.out.println("Array Index Out Of Bounds Exception");
        }
        System.out.println("************iterate all the elements from 2DArray using for each loop*************");
        // print / iterate all the elements from 2DArray using for each loop
        // convert2D Array to 1D array
        for(String str [] : studentsInformation){
            for(String st : str){
                System.out.println("students information is "+st);
            }
        }

        System.out.println("****************Declare and Initialize value*********************");
        String stNames[]={"bob","marc","claire"}; // declare and initialize value in single dimensional array
        // declare and initialize value in 2D Array
        String [][] employeeDetails={
                {"Sl","FirstName","Address","phoneNumber","Email"},
                {"100","Bobby","NY","123456","Bobby@gmail.com"},
                {"101","Adam","NJ","234567","Adam@gmail.com"},
                {"102","Marc","CT","345678","Marc@gmail.com"}
        };
        System.out.println("**********how to print a single value ***************");
        // how to print a single value // i want to print ("Adam@gmail.com")
        System.out.println("Employee Details are : "+employeeDetails[2][4]);
        System.out.println("Employee Details are : "+employeeDetails[0][2]);
        System.out.println("Employee Details are : "+employeeDetails[1][1]);

        // how to iterate all the values using for each loop
        System.out.println("**********how to Iterate all the value using for each loop ***************");
        for(String str [] : employeeDetails){
            for(String st : str){
                System.out.print(st+ " ");
            }
            System.out.println();
        }





    }


}
