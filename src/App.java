public class App {
    public static void main(String[] args) throws Exception {
        DatabaseManager db = new DatabaseManager();
        db.resetTable("pokemon");
    }
}
