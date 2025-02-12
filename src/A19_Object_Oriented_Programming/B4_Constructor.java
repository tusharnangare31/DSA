package A19_Object_Oriented_Programming;

public class B4_Constructor {
    public static void main(String[] args) {
        // Non Parameterizes
        StudentC s1 = new StudentC();
        s1.name = "Tushar";
        s1.password = "it@123";
        s1.marks[0] = 90;
        s1.marks[1] = 87;
        s1.marks[2] = 98;
        // parameterized
//        StudentC s2 = new StudentC("Rahul");
//        StudentC s3 = new StudentC(123);
//        StudentC s4 = new StudentC("Tushar",321);
//        System.out.println(s4.name);

        StudentC s2 = new StudentC(s1);
        s2.password = "xyz";
        System.out.println(s2.password);
        s2.marks[2] = 100;
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
        System.out.println(s1.marks[2]);

    }

}
class StudentC{
    String name;
    int roll;
    String password;
    int[] marks;

    // Shallow copy constructor
//    StudentC(StudentC s1){
//        marks = new int[3];
//        this.name = s1.name;
//        this.roll = s1.roll;
//        this.password = s1.password;
//        this.marks = s1.marks;
//    }

    // Deep copy constructor
    StudentC(StudentC s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }


    StudentC(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    StudentC(String name){
        marks = new int[3];
        this.name = name;
    }
    StudentC(int roll){
        marks = new int[3];
        this.roll = roll;
    }
    StudentC(String name,int roll){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
    }
}
