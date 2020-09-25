package app;



public class App {
    public static void main(String[] args) throws Exception {
     
        int count = 0;
        String color = "red";
        boolean amIInSchool = true;

        while (count <= 10) {
            System.out.println("the count is " + count);
            count = count + 1;
        }
        System.out.println("count finished");

        while (color == "red"){
            System.out.println("the color is " + color);
            color = "green";
        }
        System.out.println("color finished");

        while (amIInSchool == true)  {
            System.out.println("are you in school? " + amIInSchool);
            amIInSchool = false;
        }
            System.out.println("you are in school");

        
    }
}