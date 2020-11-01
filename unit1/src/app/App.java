package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner input = new Scanner(System.in);

    int targetNum = 33;
    boolean isComplete = false;

    while (isComplete == false) {
         System.out.println("guess a number between 0 and 100");
         int guess = input.nextInt();
         input.nextLine();
    if (guess == targetNum) {
        System.out.println("Correct");
        isComplete = true;
    }
    else if (guess < targetNum) {
        System.out.println("Low");
    }
    else {
        System.out.println("High");
    }
    }
        }
    


String line[] = {"Ditty", "Daisy", "Yoshi", "Toad", "Wario", "DK", "Luigi", "Peach", "Mario", "Waluigi"};

System.out.println(line[2]);

System.out.println(line[0]);

line[4] = "Bowser";

int numberOfPeopleInLine = line.length;

for (int i = 0; i < line.length; i++){
    System.out.println(line[i]);
}
    }
}
