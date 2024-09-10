import java.util.HashMap;
import java.util.Map;

public class SimpleDatabase {
    private Map<Integer, String> database;
    private int idCounter;

    public SimpleDatabase() {
        database = new HashMap<>();
        idCounter = 1;
    }

    public int create(String value) {
        int id = idCounter++;
        database.put(id, value);
        return id;
    }

    public String read(int id) {
        return database.get(id);
    }

    public void update(int id, String newValue) {
        if (database.containsKey(id)) {
            database.put(id, newValue);
        } else {
            System.out.println("Record not found");
        }
    }

    public void delete(int id) {
        if (database.containsKey(id)) {
            database.remove(id);
        } else {
            System.out.println("Record not found");
        }
    }

    public static void main(String[] args) {
        SimpleDatabase db = new SimpleDatabase();
        int id = db.create("First Record");
        System.out.println("Read: " + db.read(id)); // Output: Read: First Record
        db.update(id, "Updated Record");
        System.out.println("Read after update: " + db.read(id)); // Output: Read after update: Updated Record
        db.delete(id);
        System.out.println("Read after delete: " + db.read(id)); // Output: Read after delete: null
    }
}
