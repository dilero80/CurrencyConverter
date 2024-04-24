package Services;

import Entities.Currency;
import Requests.CurrencyRequest;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.io.PrintStream;

public class CurrencyService {
    CurrencyRequest cr = new CurrencyRequest();
    public CurrencyService() {
    }

    public Currency createCurrency (String principalCurrency) throws IOException {
        Currency c = new Currency();
        JsonObject conversionRates = cr.AskCurrencies(principalCurrency);
        c.setUsd(conversionRates.get("USD").getAsDouble());
        c.setArs(conversionRates.get("ARS").getAsDouble());
        c.setBrl(conversionRates.get("BRL").getAsDouble());
        c.setCop(conversionRates.get("COP").getAsDouble());
        return c;

    }

}
