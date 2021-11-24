package datastucture.collectionframework.array;

public class Learn3DArray {
    // 3D array means : 2D+1D
    // 3D array : three dimension [][][]'
    // syntax
    // datatype [dimension1][dimension2][dimension3] arrayName = new datatype[size1][size2][size3];


    public static void main(String[] args) {
        String [][][] mobileInfo= new String[3][4][5];
        System.out.println(mobileInfo.length);
        // how to add value
        mobileInfo[0][0][0]="Sl";
        mobileInfo[0][0][1]="Brand";
        mobileInfo[0][0][2]="color";
        mobileInfo[0][0][3]="Price";
        mobileInfo[0][0][4]="Qty";

        mobileInfo[0][1][0]="10";
        mobileInfo[0][1][1]="Iphone";
        mobileInfo[0][1][2]="Silver";
        mobileInfo[0][1][3]="1300";
        mobileInfo[0][1][4]="2";

        mobileInfo[0][2][0]="20";
        mobileInfo[0][2][1]="Samsung";
        mobileInfo[0][2][2]="Black";
        mobileInfo[0][2][3]="1200";
        mobileInfo[0][2][4]="5";

        mobileInfo[0][3][0]="30";
        mobileInfo[0][3][1]="LG";
        mobileInfo[0][3][2]="White";
        mobileInfo[0][3][3]="1000";
        mobileInfo[0][3][4]="6";

        System.out.println("*************get a single value from 3D array********************");
        // get a single value
        System.out.println( mobileInfo[0][0][3]);
        System.out.println( mobileInfo[0][0][1]);

        System.out.println("*************Iterate all the value from 3D array********************");
        // How to iterate all the value from 3D Array using for each loop
        // convert 3D Array to 2D Array then 2D array to 1D Array
        for(String str [][] : mobileInfo){
            for(String []st : str){
                for(String s : st){
                    System.out.println(" mobile phone info is : " +s);
                }
            }

        }

         System.out.println("****************Declare and Initialize value*********************");
        // String [][][] mobileInfo= new String[3][4][5];
        String [][][] weatherInfo={
                {
                   // 1st time
                        {"sl","weather area","geo location ","max temperature","min temperature"},
                        {"B1","NY","manhattan","15","6"},
                        {"B2","AL","Alaska","-5","-15"},
                        {"B3","CA","LA","32","15"},
                        {"B4","Canada","Montreal","0","-10"}

                },
                {
                    // 2nd time
                },
                {
                   // 3rd time
                },

        };

        // how to print single value from 3D Array

        System.out.println(weatherInfo[0][3][3]);
        System.out.println(weatherInfo[0][1][2]);
        System.out.println(weatherInfo[0][4][2]);

        // how to iterate all the values using for each loop

        for(String str [][] : weatherInfo){
            for(String []st : str){
                for(String s : st){
                    System.out.println(" weatherInfo is : " +s);
                }
            }

        }





    }





}
