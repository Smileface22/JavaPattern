
public class Main {
    public static void main(String[] args) {
        CustomExecutorService executorService = new CustomExecutorService(3);
        executorService.submit(() -> {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("first");
        });
        executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("second");
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("third");
        });

        CustomExecutorService executorService2 = new CustomExecutorService(2);
        executorService2.submit(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            System.out.println("first");
        });
        executorService2.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("second");
        });

        executorService.shutdown();
        executorService2.shutdown();
    }
};