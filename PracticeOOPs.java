package com.bank.account;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int sl){
        salary = sl;
    }
    public void setName(String n){
         name = n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Phone is ringing.........");
    }
    public  void vibrate(){
        System.out.println("Phone is vibrating.........");
    }
    public void callFriend(){
        System.out.println("Calling a friend.......");
    }
    public void playMusic(){
        System.out.println("Playing a music...............");
    }
}
class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4 * side;
    }
}
class Rectangle{
    int length;
    int width;

    public int area(){
        return length * width;
    }
    public int perimeter(){
        return (length + width) * 2;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy.....");
    }
    public void fire(){
        System.out.println("Firing on the enemy........");
    }
    public void run(){
        System.out.println("Running behind the enemy..........");
    }
}
class Circle{
    int radius;
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
    public double area(){
        return 3.14 * radius * radius;
    }
}
public class PracticeOOPs {
    public static void main(String[] args) {

        // Problem 1
        Employee anunay = new Employee();
        anunay.name = "Anunay Singh";
        anunay.salary = 35000;

        System.out.println(anunay.getName());
        System.out.println(anunay.getSalary());

        // setMethod used
        anunay.setName("Gaurav Kumar");
        anunay.setSalary(50000);
        System.out.print("Name changed : ");
        System.out.println(anunay.getName());
        System.out.print("Salary Changed : ");
        System.out.println(anunay.getSalary());


        // Problem 2 : Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
        CellPhone iphone = new CellPhone();
        iphone.ring();
        iphone.callFriend();
        iphone.playMusic();
        iphone.vibrate();

        // Problem 3 : Create a class Square with a method to initialize its side, calculating area, perimeter etc.
        Square square = new Square();
        square.side = 3;
        square.area();
        square.perimeter();

        System.out.println(square.area());
        System.out.println(square.perimeter());

        // Problem 4 : Create a class Rectangle & problem 3.
        Rectangle rectangle = new Rectangle();
        rectangle.width = 3;
        rectangle.length = 4;
        rectangle.area();
        rectangle.perimeter();

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());



        // Problem 5 : Create a class Tommy for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
        Tommy game = new Tommy();
        game.fire();
        game.hit();
        game.run();

        // Problem 6 : Repeat problem 4 for a circle.
        Circle circle = new Circle();
        circle.radius = 3;
        circle.area();
        circle.perimeter();

        System.out.println(circle.area());
        System.out.println(circle.perimeter());


    }
}
