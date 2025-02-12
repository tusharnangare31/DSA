package A19_Object_Oriented_Programming;

public class P1_Complex_Number {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, -3);

        System.out.println("First Complex Number: " + c1);
        System.out.println("Second Complex Number: " + c2);

        System.out.println("Addition: " + Complex.add(c1,c2));
        System.out.println("Subtraction: " + Complex.subtract(c1,c2));
        System.out.println("Multiplication: " + Complex.multiply(c1,c2));
        System.out.println("Division: " + Complex.divide(c1,c2));
    }
}
class Complex{
    int real;
    int img;

    Complex(int real,int img){
        this.real = real;
        this.img = img;
    }
    public static Complex add(Complex a , Complex b){
        return new Complex(a.real+b.real,a.img+b.img);
    }

    public static Complex subtract(Complex a , Complex b){
        return new Complex(a.real-b.real,a.img-b.img);
    }

    public static Complex multiply(Complex a , Complex b){
        return new Complex((a.real*b.real)-(a.img*b.img),(a.real*b.img)+(a.img*b.real));
    }

    public static Complex divide(Complex a , Complex b){
        return new Complex(
                ((a.real * b.real) + (a.img * b.img)) / (b.real * b.real + b.img * b.img),
                ((a.img * b.real) - (a.real * b.img)) / (b.real * b.real + b.img * b.img)
        );
    }
    @Override
    public String toString() {
        if (img >= 0) {
            return real + " + " + img + "i";
        } else {
            return real + " - " + (-img) + "i";
        }
    }

}
