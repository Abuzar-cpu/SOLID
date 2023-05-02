package d.good;

public class Report {
    private Database database;

    public void getReport() {
        System.out.println("Generating report");
    }


    // Good example. Now we are loosely coupled with Database interface and we don't care about implementation of Database classes
    public void writeToDb() {
        this.database.writeToDb();
    }
}
