package paymentStrategy;

public class CreditCardAlgorithm implements Payment {

    private String cardNumber;
    private String name;

    public CreditCardAlgorithm(String cardNumber, String name) {
        this.cardNumber = cardNumber;
        this.name = name;
    }

    public CreditCardAlgorithm() {
    }

    @Override
    public void pay(int amount) {
        System.out.println( amount + " paid with credit card");
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
