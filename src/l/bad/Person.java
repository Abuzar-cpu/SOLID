package l.bad;

public class Person {
    private Phone phone;

    public void callSomeone() {
        System.out.printf(this.phone.call());
    }

    // Bad example because addBalance method is unimplemented in HomePhone call
    // That means HomePhone is not suitable always to replace base class
    public void addBalance() {
        this.phone.addBalance();
    }
}
