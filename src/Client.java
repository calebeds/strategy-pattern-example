public class Client {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(); // the context

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);

        cart.addItem(item1);
        cart.addItem(item2);

        // pay by paypal
        cart.pay(new PaypalStrategy("calebe@email.com", "mypassword"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("Calebe Oliveira", "4564546465", "444", "04/29"));


    }
}
