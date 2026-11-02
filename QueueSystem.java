import java.util.HashSet;
import java.util.Set;

public class QueueSystem {
    private static QueueSystem instance;
    private final Set<Integer> reservedNums = new HashSet<>();
    // used hashset for easier int management

    private QueueSystem() {}

    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized void reserveNum(int num) {
        if (reservedNums.add(num)) {
            System.out.println(num + " is now reserved.");
        } else {
            System.out.println(num + " is already in use.");
        }
    }

    public synchronized void resetNum(int num) {
        if (reservedNums.remove(num)) {
            System.out.println(num + " is reset.");
        } else {
            System.out.println(num + " was not reserved.");
        }
    }
}