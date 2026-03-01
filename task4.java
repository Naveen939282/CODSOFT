import java.util.Scanner;
class CurrencyConverter {
    public static double getExchangeRate(String baseCurrency, String targetCurrency) {
        if (baseCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18;
        } else if (baseCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            return 0.75;
        } else if (baseCurrency.equals("GBP") && targetCurrency.equals("USD")) {
            return 1.33;
        } else if (baseCurrency.equals("EUR") && targetCurrency.equals("GBP")) {
            return 0.88;
        } else if (baseCurrency.equals("GBP") && targetCurrency.equals("EUR")) {
            return 1.14;
        } else {
            return -1;
        }
    }
}
public class task4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();
        System.out.println("Enter base currency: ");
        String baseCurrency = sc.nextLine().toUpperCase();
        System.out.println("Enter target currency: ");
        String targetCurrency = sc.nextLine().toUpperCase();
        System.out.println("Enter amount to convert: ");
        double amount = sc.nextDouble();
        double exchangeRate = converter.getExchangeRate(baseCurrency, targetCurrency);
        if (exchangeRate != -1) {
            double convertedAmount = amount * exchangeRate;
            System.out.println(amount + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
        } else {
            System.out.println("Invalid currency code.");
        }
        sc.close();
    }
    
}
