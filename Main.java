public class Main {
    public static void main(String[] args) {
        QueueSystem queue = QueueSystem.getInstance();

        queue.reserveNum(1);
        queue.reserveNum(2);
        queue.reserveNum(2);   // already in use
        queue.resetNum(2);
    }
}