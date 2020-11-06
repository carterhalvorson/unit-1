package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     helloWorld();
     firstName();
     middleName();
     lastName();
     isCool("Carter");
     number(11);
multiply(4, 6, 2, 8);
    }

    public static void helloWorld(){
        System.out.println("Hello world");
    }
    public static void firstName(){
         System.out.println("Carter");
    }
    public static void middleName(){
        System.out.println("Bennet");
    }
    public static void lastName(){
        System.out.println("Halvorson");
    }
    public static void isCool(String name){
System.out.println(name + " is cool");

    }
    public static void number(int number){
    if ( number > 10){
System.out.println(number + " is greater than 10");
    }else {
        System.out.println(number + " is less than 10");

    }
    }
    public static void multiply(int num1,int num2,int num3,int num4){
        System.out.println(num1 * num2 * num3 * num4 );

    }
    
    
    
}
