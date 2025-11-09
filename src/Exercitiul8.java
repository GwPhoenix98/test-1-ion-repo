import java.util.Scanner;

public class Exercitiul8 {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);

        System.out.print("Introduceti ora: ");
        int ora = obiectScanner.nextInt();

        if ( ora > 0 && ora <= 6 ) {
            System.out.println("Este noaptea!");
        } else if ( ora > 6 && ora <= 12 ) {
            System.out.println("Este dimineata!");
        } else if ( ora > 12 && ora <= 18) {
            System.out.println("Este ziua!");
        } else if ( ora > 18 && ora <= 24) {
            System.out.println("Este seara!");
        }

    }

}
