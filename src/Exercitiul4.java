import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);

        System.out.print("Introduceti primult numar: ");
        double num1 = obiectScanner.nextDouble();

        System.out.print("Introduceti al doilea numar: ");
        double num2 = obiectScanner.nextDouble();

        if ( num1 > num2 ) {
            System.out.println("Numarul mai mare este: " + num1);
            System.out.println("Numarul mai mic este: " + num2);
        } else {
            System.out.println("Numarul mai mare este: " + num2);
            System.out.println("Numarul mai mic este: " + num1);

        }
    }
}