public class StockMarketApplication {
    public static void main(String[] args) {
        Subject stock = new Subject();

        Observer user1 = new ConcreteObserver("User 1");
        Observer user2 = new ConcreteObserver("User 2");

        stock.attach(user1);
        stock.attach(user2);

        stock.setStockPrice(100.00); // Notify all users of stock price change
        stock.setStockPrice(101.00); // Notify all users of stock price change
    }
}
