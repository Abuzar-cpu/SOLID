package o.good;

public class GroundShipping implements ShippingMethod{
    private String shippingMethod;
    @Override
    public int deliverFee() {
        return 10;
    }
}
