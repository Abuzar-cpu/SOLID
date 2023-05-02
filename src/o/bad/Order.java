package o.bad;

import java.util.List;

public class Order {
    private List<OrderItem> items;
    private String shipping;

    // That is bad because each time we implement a new Shipping method, we should change the Order class to adopt the new rules
    public int getShippingFee() {
        if(this.shipping.trim().equals("ground"))
            return 10;

        else if(this.shipping.trim().equals("air"))
            return 50;

        else return 25;
    }
    public Order(List<OrderItem> items, String shipping) {
        this.items = items;
        this.shipping = shipping;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }
}
