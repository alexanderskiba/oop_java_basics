package Example1;

import java.util.Scanner;

public class MainPurchase {
    public static void main(String[] args) {
        Commodity commodity = new Commodity();
        Scanner scan = new Scanner(System.in);
        commodity.productName = scan.nextLine();
        commodity.price = scan.nextInt();

        Purchase purchase = new Purchase();
        purchase.product = commodity;
        purchase.productAmount = scan.nextInt();
        purchase.show();
        commodity.price = scan.nextInt();
        System.out.println();
        purchase.show();
    }
}
