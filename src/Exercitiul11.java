import java.util.Scanner;

public class Exercitiul11 {
    public static void main(String[] args) {

        Scanner obScan = new Scanner(System.in);

        System.out.print("Introduceti sirul: ");
        String sirNou = obScan.nextLine();

        int indiceMaxim = sirNou.length() - 1;

        System.out.println("Indicele maxim este: " + indiceMaxim);
        System.out.println("Cantitatea de caractere este: " + sirNou.length());

    }
}
