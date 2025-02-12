package A19_Object_Oriented_Programming;

public class B8_Interfaces {
    public static void main(String[] args) {
        Bear b1 = new Bear();
        b1.eatMeat();
        b1.eatPlants();
    }
}
// 1.Interface is blueprint of a class
// 2.Multiple Inheritance
// 3.Total Abstraction

// Interfaces
// 1.All methods are public,abstract & without implementation
// 2.Used to achieve total abstraction
// 3.Variables in the interface are final, public and static

interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all direction)");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (1 unit only)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

// Multiple Inheritance
interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Herbivore, Carnivore {

    // Implementing methods from Herbivore
    public void eatPlants() {
        System.out.println("Bear eats berries and plants.");
    }

    // Implementing methods from Carnivore
    public void eatMeat() {
        System.out.println("Bear eats fish and meat.");
    }
}
