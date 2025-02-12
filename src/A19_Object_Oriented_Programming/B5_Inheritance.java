package A19_Object_Oriented_Programming;

public class B5_Inheritance {
    public static void main(String[] args) {
//    Fish shark = new Fish();
//    shark.eat();
//    shark.breathe();
//    shark.swim();

        // Multilevel Inheritance
//        Dog tommy = new Dog();
//        tommy.eat();
//        tommy.legs = 4;
//        System.out.println(tommy.legs);






    }
}

// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}

class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("Walk");
    }
}

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
class bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}

class Dog extends Mammal {
    String bread;
}
// Derived Class subclass

