package Example1;

class BusinessTrip {
    static int dailyMoney = 25;
    String nameLastName;
    int days;
    int transportCost;
    int totalCost;

    public void getTotal() {
        this.totalCost = transportCost + days * dailyMoney;
    }

    public void show() {
        System.out.printf("Суточные = %d\n" +
                          "Фамилия Имя = %s\n" +
                          "Транспортные расходы = %d\n" +
                          "Количество дней = %d\n" +
                          "Итого расходы = %d",dailyMoney, nameLastName, transportCost, days, totalCost);
    }
}
