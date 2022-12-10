public interface Currency {
  Currency addedCurrency(float value, String currency);

  Currency subtractedCurrency(float value, String currency);

  String abbreviation();

  String symbol();

  String balance();

  float toDollarExchangeRate();
}

import java.util.HashMap;

public class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f);
    put("GBP", 0.87063f);
    put("CHF", 0.9881f);
    put("JPY", 145.12f);
  }};


  public float euroToRate(String currency) {
    return this.rates.get(currency);
  }

  public FakeCantor() {

  }

}

class Euro implements Currency {
    private String balance;
    private String currency;
    private float value;

    Bank (String balance) {
        this.balance = balance;
    }

    @Override
    public Currency addedCurrency (float value, String currency) {
        System.out.println("Current balance is: " + this.balance + "EUR.");
        private float rate = euroToRate(currency);  
        Float.parseFloat(this.balance) += rate;
        System.out.println("Balance after operation is: " + this.balance + "EUR.");
        return new Bank (Float.toString(this.balance));
    }

    public Currency subtractedCurrency(float value, String currency) {
        System.out.println("Current balance is: " + this.balance + "EUR.");
        public float rate = euroToRate(currency);  
        Float.parseFloat(this.balance) -= rate;
        System.out.println("Balance after operation is: " + this.balance + "EUR.");
        return new Bank (Float.toString(this.balance));
    }
    
    public String abbreviation {
        return "EUR";
    }
}