import java.util.Scanner;

public class Exercitiul12 {
    public static void main(String[] args) {

        Scanner obScan = new Scanner(System.in);

        System.out.print("Introduceti virsta persoanei: ");
        int virsta = obScan.nextInt();

        if ( virsta <= 0 || virsta > 135) {
            System.out.println("Hai las-o mai moale :D");
        } else if ( virsta >= 1 && virsta < 12 ) {
            System.out.println("Este copil!");
        } else if ( virsta >= 12 && virsta <= 18) {
            System.out.println("Este adolescent!");
        } else if ( virsta > 18 && virsta <= 135) {
            System.out.println("Este adult!");
        }

    }
}