package constructor;

public class Pizza {

    // declare variable

    int pizzaPrice;
    String pizzaName;
    int pizzaQty;
    String pizzaTopping;
    int pizzaSize;

    public Pizza() { // default constructor
        System.out.println("hello");
    }

    // single parameterized constructor
    public Pizza(int pizzaPrice){
        this.pizzaPrice=pizzaPrice;
        System.out.println("pizza price is "+this.pizzaPrice);

    }

    // multi parameterized constructor
    public Pizza(int pizzaPrice,String pizzaName){
        this.pizzaPrice=pizzaPrice;
        this.pizzaName=pizzaName;
        System.out.println("pizza price is "+this.pizzaPrice);
        System.out.println("pizza name is "+this.pizzaName);

    }

    public Pizza(int pizzaPrice,String pizzaName,int pizzaQty){
        this.pizzaPrice=pizzaPrice;
        this.pizzaName=pizzaName;
        this.pizzaQty=pizzaQty;
        System.out.println("Pizza qty is "+this.pizzaQty);

    }

    public Pizza(int pizzaPrice,String pizzaName,int pizzaQty,String pizzaTopping){
        this.pizzaPrice=pizzaPrice;
        this.pizzaName=pizzaName;
        this.pizzaQty=pizzaQty;
        this.pizzaTopping=pizzaTopping;
        System.out.println("pizza topping is "+this.pizzaTopping);

    }
    public Pizza(int pizzaPrice,String pizzaName,int pizzaQty,String pizzaTopping, int pizzaSize){
        this.pizzaPrice=pizzaPrice;
        this.pizzaName=pizzaName;
        this.pizzaQty=pizzaQty;
        this.pizzaTopping=pizzaTopping;
        this.pizzaSize=pizzaSize;
        System.out.println("pizza topping is "+this.pizzaTopping);
        System.out.println("pizza size is "+this.pizzaSize);

    }







    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        Pizza myPizza = new Pizza(45);
        Pizza hisPizza = new Pizza(15,"Dominos");
        Pizza herPizza = new Pizza(20,"papa jhon's",12);
        Pizza popularPizza = new Pizza(23,"pizza hot",25,"cheese");
        Pizza pizza1 = new Pizza(23,"aldo",23,"mashroom",'L');


    }
}
