import Enumerators.CurrencyEnums;

import static java.util.function.Predicate.not;

public class Menu {
    public static void displayPrincipalMenu(){
        System.out.println("========================================");
        System.out.println("----- PRINCIPAL MENU-----");
        System.out.println("1. COLOMBIAN PESO COP CONVERTER MENU");
        System.out.println("2. DOLLAR USD CONVERTER MENU");
        System.out.println("3. BRAZILIAN REAL CONVERTER MENU");
        System.out.println("4. ARGENTINE PESO CONVERTER MENU");
        System.out.println("5. EXIT");
        System.out.println("========================================");
    }

    public static void displayCurrencyMenu(String currency){
        int cont = 1;

       String[] currencyConverters =
                CurrencyEnums.stream()
                .filter(not(c -> c.getCurrencyCode().equals(currency)))
                .map(Enum::toString)
                .toArray(String[] :: new);

        //System.out.println(Arrays.toString(currencyConverters));
        //System.out.println(currencyConverters[0]);
        System.out.println("========================================");
        System.out.println("----- USER MENU-----");
        for(String cur : currencyConverters){
            System.out.println(cont +" "+ currency + " TO " + cur);
            cont++;
        }
        System.out.println("M. RETURN MAIN MENU");
        System.out.println("========================================");
    }
}

