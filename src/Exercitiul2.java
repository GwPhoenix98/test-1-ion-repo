import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);

        System.out.print("Introduceti primult numar: ");
        double num1 = obiectScanner.nextDouble();

        System.out.print("Introduceti al doilea numar: ");
        double num2 = obiectScanner.nextDouble();

        System.out.println("Produsul lor este: " + num1*num2);

    }

}
