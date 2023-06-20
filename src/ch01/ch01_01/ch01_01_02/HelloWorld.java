package ch01.ch01_01.ch01_01_02;

public class HelloWorld {
    public static void main(String[] args) {
        Coffee latte = CoffeFactory.getCoffee("Latte", 4000);
        Coffee ame = CoffeFactory.getCoffee("Americano", 3000);
        System.out.println("Factory latte ::" + latte);
        System.out.println("Factory ame ::" + ame);
    }
}
