package A19_Object_Oriented_Programming;

public class B6_Method_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(1,3));
        System.out.println(calc.sum(2.2f,4.5f));
        System.out.println(calc.sum(2,4,5));

        Deer d1 = new Deer();
        d1.eat();
    }
}
// Function Overloading
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a , int b ,int c ){
        return a+b+c;
    }
}

// Method Overriding
class AnimalO{
    void eat(){
        System.out.println("You are in Animal class eat");
    }
}
class Deer extends AnimalO{
    void eat(){
        System.out.println("You are in Deer class eat");
    }
}
