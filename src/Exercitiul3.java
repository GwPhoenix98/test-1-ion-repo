import java.util.Scanner;

public class Exercitiul3 {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);

        System.out.print("Introduceti primult numar: ");
        double num1 = obiectScanner.nextDouble();

        System.out.print("Introduceti al doilea numar: ");
        double num2 = obiectScanner.nextDouble();

        System.out.println("Suma lor este: " + num1 + num2);
        System.out.println("Diferenta lor este: " + ( num1 - num2 ));
        System.out.println("Produsul lor este: " + num1 * num2);
        System.out.println("Citul lor este: " + num1 / num2);
        System.out.println("Restul impartirii este: " + num1 % num2);

    }

}