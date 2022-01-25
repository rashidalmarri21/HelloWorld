import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World"); //Print Hello World
        Scanner myObj = new Scanner(System.in); //Declare object
        System.out.println("What is your name?");

        String name = myObj.nextLine(); //Read user input!
        System.out.println("Hello " + name); // Display user input

    }
}
