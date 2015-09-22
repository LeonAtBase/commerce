package model;

public class OrderDetail {

    private int id;
    private int orderId;
    private int[] productId;
    private double price;
    private int[] number;

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public int[] getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int[] getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setProductId(int[] productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }
}
