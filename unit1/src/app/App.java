package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
           
        int tries = 0;  
     
while (tries < 3 ){
     System.out.println("Please Enter Password");
            String enteredPassword = input.nextLine();
        if (enteredPassword.equals("john")) {
            System.out.println("Correct");
            System.out.println(" Your prize is the friends you made along the way ");
        } else {
            System.out.println("Incorrect");
            System.out.println("Try again");
            tries++;

        }
    }

    }
}
