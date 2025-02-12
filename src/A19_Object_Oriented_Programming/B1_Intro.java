package A19_Object_Oriented_Programming;

import java.util.Scanner;

public class B1_Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.color);//We can not use p1.color when color is private
        System.out.println(p1.tip);
        BankAccount b1 = new BankAccount();
        b1.username = "tusharnangare";
        b1.changePass("t1121tdn");



    }
}

class Pen{
    String color;
    int tip;

    // This keyword is used to refer to the current object

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String color){
        this.color = color;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}

class Student{
    String name;
    int age;
    int percentage;

    void calculatePercentage(int phy, int chem ,int math){
        percentage = (phy + chem + math)/3;

    }
}
class BankAccount{
    public String username; // here we make the username to the public so any one can access it
    private String password;// when we use private access specifier
    void changePass(String pwd){
        password = pwd;
    }
}
