import java.util.Scanner;

public class Exercitiul5{
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);

        System.out.print("Introduceti parola :");
        String password = obiectScanner.nextLine();
        System.out.println("Parola introdusa este: " + password);

    }
}
