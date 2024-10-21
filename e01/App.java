import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = scanner.nextLine();
    if (name.equals("Luis")) {
        System.out.println("Are you french?");
    } else {
        System.out.println("You have a great name!");
    }
    scanner.close();
    }
    }
