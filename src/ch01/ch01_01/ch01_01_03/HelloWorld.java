package ch01.ch01_01.ch01_01_03;

public class HelloWorld {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item A = new Item("kundolA", 100);
        Item B = new Item("kundolB", 300);

        cart.addItem(A);
        cart.addItem(B);

        cart.pay(new LUNACardStategy("kundol@example.com", "pukubababo"));

        cart.pay(new KAKAOCardStrategy("Ju homhchul", "123456789", "234", "23/02"));
    }
}
