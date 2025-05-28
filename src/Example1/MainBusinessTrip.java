package Example1;

import java.util.Scanner;

public class MainBusinessTrip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BusinessTrip trip = new BusinessTrip();
        trip.nameLastName = scan.nextLine();
        trip.days = scan.nextInt();
        trip.transportCost = scan.nextInt();
        trip.getTotal();
        trip.show();
    }
}
