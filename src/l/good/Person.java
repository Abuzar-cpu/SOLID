package l.good;

public class Person {
    private CellPhone phone;

    public void callSomeone() {
        System.out.printf(this.phone.call());
    }

    // Good example. There is no method unimplemented method so that we clearly know what can be with the interface we got without hesitation
    public void addBalance() {
        this.phone.addBalance();
    }
}
