package Example1;

class Purchase {
    Commodity product;
    int productAmount;

    private int getCost(){
        return product.price * productAmount;
    }

    void show() {
        System.out.printf("Наименование товара: %s\n" +
                "Цена товара: %d\n" +
                "Количество: %d\n" +
                "Стоимость покупки: %d\n", product.productName, product.price, productAmount, this.getCost());
    }
}
