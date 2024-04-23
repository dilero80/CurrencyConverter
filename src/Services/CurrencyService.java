package Services;

import Entities.Currency;
import Requests.CurrencyRequest;

import java.io.IOException;

public class CurrencyService {
    CurrencyRequest cr = new CurrencyRequest();
    public CurrencyService() {
    }

    public Currency createCurrency () throws IOException {
        Currency c = new Currency();
        System.out.println(cr.AskCurrencies("USD"));
        return c;

    }
}
