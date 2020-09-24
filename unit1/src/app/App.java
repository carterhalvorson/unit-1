package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner input = new Scanner(System.in);

        System.out.println("please enter first name");
        String firstName = input.nextLine();
        System.out.println("please enter last name");
        String lastName = input.nextLine();
        System.out.println("please enter your age");
        String age = input.nextLine();
        System.out.println("please enter Grade");
        String grade = input.nextLine();
        System.out.println("please enter favorite color");
        String color = input.nextLine();

        System.out.println("your name is " + firstName + lastName + " your age is " + age + " your grade is " + grade + " your favorite color is " + color);


    }
}