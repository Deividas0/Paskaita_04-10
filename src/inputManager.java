import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class inputManager {
    Scanner scanner = new Scanner(System.in);
    // List<String> sarasas = new ArrayList<>();
    String[] sarasas = new String[2];

    int insertDigit;
    int a;
    int b;

    private int insertDigit() {
        System.out.println("Iveskite skaičių: ");

        try {
            int insertDigit = Integer.parseInt(scanner.nextLine());
            return insertDigit;
        } catch (InputMismatchException ivestasNeSkaicius) {
            return insertDigit();
        } catch (NumberFormatException e) {
            System.out.println("Nepasirinktas joks skaičius");
            return insertDigit();
        }
    }
        public String[] askForInput () {
            sarasas[0] = String.valueOf(insertDigit());
            sarasas[1] = String.valueOf(insertDigit());
            return sarasas;

        }

    }
