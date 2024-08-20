public class ConcurrentExample {
    public static void main(String[] args) {
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        Thread printThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Print: " + i);
                try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        });

        numberThread.start();
        printThread.start();
    }
}
