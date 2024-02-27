
package curso12;
import java.util.Scanner;


public class Inicio {
    public static void main(String[] args) {}
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name = scanner.nextLine();
    System.out.println("How old are you ? ");
    int age = scanner.nextInd();

    System.out.pritln("What is your favorite food? ");
    String food = scanner.extLine();

    System.out.println("Hello " + name);
    System.out.println("You are " + age + "years old");




}
