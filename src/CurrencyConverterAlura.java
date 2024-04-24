import Entities.Currency;
import Requests.CurrencyRequest;
import Services.CurrencyService;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class CurrencyConverterAlura {
    public static void main(String[] args) throws IOException {
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

    private static void CurrencySwitch() throws IOException {
        boolean exit = false;
        CurrencyService cs = new CurrencyService();
        Currency c = new Currency();
        do {

            switch (selectOption().toUpperCase()){
                case "1":
                    c  = cs.createCurrency("COP");
                    System.out.println(c);
                    break;
                case "2":
                    c  = cs.createCurrency("USD");
                    System.out.println(c);

                    break;
                case "3":
                    c  = cs.createCurrency("BRL");
                    System.out.println(c);
                    break;
                case "4":
                    c  = cs.createCurrency("ARS");
                    System.out.println(c);
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



