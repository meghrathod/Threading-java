public class Program {
    public static void main(String args[]) {
        System.out.println("Welcome to threading");

        Work1 w1 = new Work1();
        Work2 w2 = new Work2();

        w1.start();
        w2.start();
        w1.setName("w1");
        w2.setName("w2");
        Thread t = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(t.getName() + " says hello " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }

    }
}

class Work1 extends Thread {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 5; i > 0; i--) {
            System.out.println(t.getName() + " says Hello!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}

class Work2 extends Thread {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 5; i > 0; i--) {
            System.out.println(t.getName() + " says Hello!");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }
}