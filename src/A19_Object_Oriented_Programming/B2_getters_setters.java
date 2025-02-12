package A19_Object_Oriented_Programming;

public class B2_getters_setters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

    }
}
