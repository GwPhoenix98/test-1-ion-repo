import java.util.Arrays;

public class Exercitiul15 {
    public static void main(String[] args) {

        byte [] numere = {1, 2, 3, 4, 5, 6};
        System.out.println("Array initial este: ");
        for(byte i : numere) {
            System.out.println(i + " ");
        }

        numere[4] = 7;

        System.out.println("______________________");
        System.out.println("Array modificat este: ");
        for(byte i : numere) {
            System.out.println(i + " ");
        }

    }
}