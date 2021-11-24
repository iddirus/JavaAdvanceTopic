package methods;

public class LearnNonReturnTypeMethod {

    // method is a block of code
    // method naming convention: verb+noun/adjective
    // any name(){}
    // Method types:
    // 1: return type
    // 2: void / non return type

    public void demo() {
        System.out.println("hello every body");
    }

    // non return type without parameter/ non static
    public void getName() {
        System.out.println("my name is iddir ");
    }

    // static non return type method without parameter
    public static void getAge() {
        System.out.println("my age is 42");
    }

    public void DoPractice() {
        System.out.println("practice is more better to understand Java ");
    }

    // non return type method with parameter/ non static

    public void GetPizza(int pizzaPrice) {
        System.out.println("pizza price is " + pizzaPrice);
    }

    public static void orderPizza(int pizzaPrice, String pizzaName) {
        System.out.println("pizza price is " + pizzaPrice + " pizza name is " + pizzaName);
    }

    public void goPizza(int pizzaPrice, String pizzaName, String pizzaTopping) {
        System.out.println("pizza price is " + pizzaPrice + " pizza name is " + pizzaName + " pizza topping is " + pizzaTopping);
    }
    public void doSummation(int num1,int num2){
        int sum=num1+num2;
        System.out.println("summation of two numbers is "+sum);
    }


    public static void main(String[] args) {
        LearnNonReturnTypeMethod learnnonreturntypemethod = new LearnNonReturnTypeMethod();
        learnnonreturntypemethod.demo();
        learnnonreturntypemethod.getName();
        LearnNonReturnTypeMethod.getAge();
        learnnonreturntypemethod.DoPractice();
        System.out.println("******************non return type method with parameter*****************");
        learnnonreturntypemethod.GetPizza(23);
        LearnNonReturnTypeMethod.orderPizza(25, "cheese");
        learnnonreturntypemethod.goPizza(18, "dominoes", "mushroom");
        learnnonreturntypemethod.doSummation(23,25);
    }




}
