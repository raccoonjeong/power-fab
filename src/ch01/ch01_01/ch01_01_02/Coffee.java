package ch01.ch01_01.ch01_01_02;

public abstract class Coffee {
    public abstract int getPrice();

    @Override
    public String toString() {
        return "Hi this coffee is "+ this.getPrice();
    }
}
