package ch01.ch01_01.ch01_01_02;

public class Latte extends Coffee{
    private int price;

    public Latte(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
