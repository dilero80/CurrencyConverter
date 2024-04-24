import Entities.Currency;
import Enumerators.CurrencyEnums;
import Services.CurrencyService;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.util.function.Predicate.not;

public class CurrencyConverterAlura {
    public static void main(String[] args) throws IOException {
        boolean exit = false;
        do {
            Menu.displayPrincipalMenu();
            switch (selectOption()){
                case "1":
                    Menu.displayCurrencyMenu("COP");
                    CurrencySwitch("COP");
                    break;
                case "2":
                    Menu.displayCurrencyMenu("USD");
                    CurrencySwitch("USD");
                    break;
                case "3":
                    Menu.displayCurrencyMenu("BRL");
                    CurrencySwitch("BRL");
                    break;
                case "4":
                    Menu.displayCurrencyMenu("ARS");
                    CurrencySwitch("ARS");
                    break;
                case "5":
                    exit = true;
                    break;
                default:
                    break;
            }
        }while (!exit);
    }

    private static void CurrencySwitch(String cur) throws IOException {
        boolean exit = false;
        String curTo;
        CurrencyService cs = new CurrencyService();
        Currency c;
        c  = cs.createCurrency(cur);
        String[] currencyConverters =
                CurrencyEnums.stream()
                        .filter(not(cu -> cu.getCurrencyCode().equals(cur)))
                        .map(Enum::toString)
                        .toArray(String[] :: new);


        do {

            switch (selectOption().toUpperCase()){
                case "1":
                    System.out.println(c);
                    curTo = currencyConverters[0];
                    howMuch(cur,curTo,valueOfCurrency(curTo,c));
                    waitForContinue();
                    Menu.displayCurrencyMenu(cur);
                    break;
                case "2":
                    System.out.println(c);
                    curTo = currencyConverters[1];
                    howMuch(cur,curTo,valueOfCurrency(curTo,c));
                    waitForContinue();
                    Menu.displayCurrencyMenu(cur);
                    break;
                case "3":
                    System.out.println(c);
                    curTo = currencyConverters[2];
                    howMuch(cur,curTo,valueOfCurrency(curTo,c));
                    waitForContinue();
                    Menu.displayCurrencyMenu(cur);
                    break;
                case "4":
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

    public static void waitForContinue(){
        String option;
        do {
            System.out.println("Digit C to continue");
            option = selectOption();

        }while (!option.equalsIgnoreCase("C"));

    }
     public static void howMuch (String cur1, String cur2, double curValue){
         double howMuch;
         double total;
         Scanner read = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n");

         System.out.println("How much you want to convert from " + CurrencyEnums.valueOf(cur1) + " to " + CurrencyEnums.valueOf(cur2));
         howMuch = (read.nextDouble());
         total = howMuch * curValue;
         System.out.println(STR."You will need \{CurrencyEnums.valueOf(cur2).getCurrencyName()} \{CurrencyEnums.valueOf(cur2).getCurrencyCode()}  $ \{String.format("%,.2f", total)} for \{CurrencyEnums.valueOf(cur1).getCurrencyName()} \{CurrencyEnums.valueOf(cur1).getCurrencyCode()} $\{howMuch}");
     }

     public static double valueOfCurrency (String curName, Currency c){
        double valuetoReturn = 0;
        switch (curName){
            case "USD":
                valuetoReturn = c.getUsd();
                break;
            case "COP":
                valuetoReturn = c.getCop();
                break;
            case "ARS":
                valuetoReturn = c.getArs();
                break;
            case "BRL":
                valuetoReturn = c.getBrl();
                break;
            default:
                break;

        }
        return valuetoReturn;
     }
}



