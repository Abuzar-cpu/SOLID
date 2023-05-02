package l.good;

public class MobilePhone implements CellPhone {
    @Override
    public String call() {
        return "Calling";
    }

    public void addBalance() {
        System.out.println("Added balance");
    }
}
