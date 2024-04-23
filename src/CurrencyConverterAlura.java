import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CurrencyConverterAlura {
    public static void main(String[] args) {
        boolean exit = false;
        do {
            Menu.displayPrincipalMenu();
            switch (selectOption()){
                case "1":
                    Menu.displayCurrencyMenu("COP");
                    CurrencySwitch();
                    break;
                case "2":
                    Menu.displayCurrencyMenu("USD");
                    break;
                case "3":
                    Menu.displayCurrencyMenu("BRL");
                    break;
                case "4":
                    Menu.displayCurrencyMenu("ARS");
                    break;
                case "5":
                    exit = true;
                    break;
                default:
                    break;
            }
        }while (!exit);
    }

    private static void CurrencySwitch() {
        boolean exit = false;
        do {

            switch (selectOption().toUpperCase()){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "M":
                    exit = true;
                    break;
            }

        }while (!exit);
    }
    public static String selectOption(){
        Scanner read = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n");
        System.out.println("Digit your option : ");
        return read.next();
    }
}



