package ch01.ch01_01.ch01_01_02;

public class Americano extends Coffee{
    private int price;

    public Americano(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
