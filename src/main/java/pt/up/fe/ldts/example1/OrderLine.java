package pt.up.fe.ldts.example1;

public class OrderLine {
    public Product product;

    public int getQuantity() {
        return quantity;
    }

    public int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double getTotal(){
        return product.getPrice()*getQuantity();
    }
    @Override
    public String toString(){
        return product.getName() + "(x" + getQuantity() + "): " + getTotal() + "\n";
    }
}
