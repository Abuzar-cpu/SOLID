package d.good;

public class MySqlDatabase implements Database{
    @Override
    public void writeToDb() {
        System.out.println("Writing to database");
    }
}
