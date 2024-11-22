package lv.rvt;

public class Product {

    private double initialPrice;
    private int initialQuantity;
    private String initialName;
    private String initialLocation;
    private Integer initialWeight;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.initialPrice = initialPrice;
        this.initialQuantity = initialQuantity;
        this.initialName = initialName;
    }

    public Product(String name) {
        this.initialName = name;
        this.initialWeight = 1;
        this.initialLocation = "shelf";
    }

    public Product(String name, String location) {
        this.initialName = name;
        this.initialWeight = 1;
        this.initialLocation = location;
    }

    public Product(String name, int weight) {
        this.initialName = name;
        this.initialWeight = weight;
        this.initialLocation = "shelf";
    }

    public void printProduct() {
        System.out.printf(this.initialName + " (" + this.initialWeight + " kg)" + " can be found from " + this.initialLocation);
        System.out.println();
    }

}
