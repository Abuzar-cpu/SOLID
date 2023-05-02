package l.bad;

public class MobilePhone implements Phone{
    @Override
    public String call() {
        return "Calling";
    }

    @Override
    public void addBalance() {
        System.out.println("Added balance");
    }
}
