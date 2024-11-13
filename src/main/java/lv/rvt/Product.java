package lv.rvt;

public class Product {

    private double initialPrice;
    private int initialQuantity;
    private String initialName;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
        this.initialName = initialName;
    }

    public void printProduct() {
        System.out.printf(this.initialName + ", " + this.initialPrice + ", " + this.initialQuantity + " pcs");
    }

}
