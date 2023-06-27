package ch01.ch01_01.ch01_01_03;

public class LUNACardStategy implements PaymentStrategy{
    private String emailId;
    private String password;

    public LUNACardStategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using LUNACard.");
    }
}
