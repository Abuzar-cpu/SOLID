package o.good;

import java.util.List;

public class Order {
    private List<OrderItem> items;
    private ShippingMethod shipping;

    // Good, because now if we need to implement new delivery method, we just implement the dedicated interface and use id
    // No need to change this class anymore
    public int getShippingFee() {
        return this.shipping.deliverFee();
    }
    public Order(List<OrderItem> items, ShippingMethod shipping) {
        this.items = items;
        this.shipping = shipping;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public ShippingMethod getShipping() {
        return shipping;
    }

    public void setShipping(ShippingMethod shipping) {
        this.shipping = shipping;
    }
}
