package Enumerators;

import java.util.stream.Stream;

public enum CurrencyEnums {

    USD("USD", "United States Dollar"),
    COP("COP", "Colombian Peso"),
    ARS("ARS", "Argentine Peso");

    private final String currencyCode;
    private final String currencyName;



    CurrencyEnums(String currencyCode, String currencyName) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public static Stream<CurrencyEnums> stream(){
        return Stream.of(CurrencyEnums.values());
    }
}
