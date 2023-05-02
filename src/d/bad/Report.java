package d.bad;

public class Report {
    private MySqlDatabase database;

    public void getReport() {
        System.out.println("Generating report");
    }


    // bad example because we are hardly coupled to the MySqlDatabase object. Now any change made to that database will directly affect us
    public void writeToDb() {
        this.database.writeToDb();
    }
}
