package A19_Object_Oriented_Programming;

public class B7_Abstract_Class {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        Mustang myHorse = new Mustang();
        // Animala -> Horse -> Mustang
    }



}
// Cannot create an instance of abstract class
// Can have abstraction-abstract method
// Can have constructors
abstract class Animala{
    String color;
    Animala(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk(); // we just declare the walk function in abstract so it is compulsory implement in extended class
    // Walk is does not depend on Animal class
}

class Horse extends Animala{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animala{
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}
