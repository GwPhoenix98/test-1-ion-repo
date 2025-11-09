import java.util.Scanner;

public class Exercitiul7 {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);

        System.out.print("Introduceti numarul: ");
        int numar = obiectScanner.nextInt();

        if ( numar % 2 == 0) {
            System.out.println("Numarul este par.");
        } else {
            System.out.println("Numarul este impar.");
        }

    }
}
