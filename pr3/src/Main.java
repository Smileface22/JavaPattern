import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("_____MAP_____");

        Map<Integer, Integer> semaphoreMap = new SemaphoreMap<>();
        Thread firstThread = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                semaphoreMap.put(i, i * 10);
                System.out.println("Added: " + i + ", " + i * 10);
            }
        });

        Thread secondThread = new Thread(() -> {
            for (int i = 5; i <= 10; i++) {
                semaphoreMap.put(i, i * 10);
                System.out.println("Added: " + i + ", " + i * 10);
            }
        });

        firstThread.start();
        secondThread.start();
        Thread.sleep(1000);
        semaphoreMap.forEach((K, V) -> System.out.print("(" + K + ", " + V + ") "));

        System.out.println("\n\n_____LIST_____");

        List<Integer> lockList = new LockList<>();
        Thread thirdThread = new Thread(() -> {
            for (int i = 1; i < 5; i++) {
                lockList.add(i);
                System.out.println("Added: " + i);
            }
        });

        Thread forthThread = new Thread(() -> {
            for (int i = 5; i < 10; i++) {
                lockList.add(i);
                System.out.println("Added: " + i);
            }
        });

        thirdThread.start();
        forthThread.start();

        Thread.sleep(1000);
        lockList.forEach(elem -> System.out.print(elem + " "));
    }
}
