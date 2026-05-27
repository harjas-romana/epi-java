// STRATEGY PATTERN
// Defines a family of algorithms and encapsulates each one

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using Credit Card: " + cardNumber);
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using PayPal: " + email);
    }
}

class UPIPayment implements PaymentStrategy {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying $" + amount + " using UPI: " + upiId);
    }
}

public class StrategyPattern {
    private PaymentStrategy paymentStrategy;

    public StrategyPattern(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        StrategyPattern checkout1 = new StrategyPattern(new CreditCardPayment("1234-5678-9012-3456"));
        checkout1.checkout(100.0);

        StrategyPattern checkout2 = new StrategyPattern(new PayPalPayment("user@paypal.com"));
        checkout2.checkout(50.0);

        StrategyPattern checkout3 = new StrategyPattern(new UPIPayment("user@upi"));
        checkout3.checkout(75.0);
    }
}
