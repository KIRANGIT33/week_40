import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        StringBuilder concatenatedNames = new StringBuilder();
        while (true) {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("Quit")) {
                break;

            }
            concatenatedNames.append(name);
            System.out.println(concatenatedNames.toString());
        }
        scanner.close();
        

    }
}