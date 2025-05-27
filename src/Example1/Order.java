package Example1;

public class Order {
    private int id; // переменная экземпляра класса закрытая
    static int bonus; // переменная класса - существует в единственном экземпляре
    public final int MIN_TAX = 8 + (int)(Math.random()*5); // константа экземпляра класса
    public final static int PURCHASE_TAX = 6; // константа класса

    // метод доступен  вне пакета
    public double calculatePrice(double price, int counter) {
        double amount; // локальная переменная метода
        amount = (price - bonus) * counter;
        double tax = amount * PURCHASE_TAX/100;
        return amount + tax;
    }
}
