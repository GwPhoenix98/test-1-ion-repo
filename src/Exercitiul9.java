import java.util.Scanner;

public class Exercitiul9 {
    public static void main(String[] args) {

        Scanner obiectScanner = new Scanner(System.in);
        String season;

        System.out.print("Introduceti numarul de ordine a  lunii: ");
        int numOrdine = obiectScanner.nextInt();

        switch (numOrdine) {
            case 12:
            case 1:
            case 2:
                season = "Iarna";
                break;
            case 3:
            case 4:
            case 5:
                season = "Primavara";
                break;
            case 6:
            case 7:
            case 8:
                season = "Vara";
                break;
            case 9:
            case 10:
            case 11:
                season = "Toamna";
                break;
            default:
                season = "Nu a fost gasita nici o asociere.";
        }
        System.out.println("Luna sub numarul " + numOrdine + " este in perioada anotimpului " + season);
    }
}