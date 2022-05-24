package SD_ArrayList_LinkedList;

public class Product implements Comparable<Product>{
    private int productId;
    private String productName;
    private double price;

    public Product() {
    }

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Productor{" +
                "productorId=" + productId +
                ", productorName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product product){
        if (this.price > product.price){
            return 1;
        } else if (this.price < product.price) {
            return -1;
        } else {
            return 0;
        }
    }
}
