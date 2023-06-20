package ch01.ch01_01.ch01_01_02;

public class DefaultCoffee extends Coffee{
    private int price;

    public DefaultCoffee() {
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
