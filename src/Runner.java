public class Runner extends Thread {
    public Runner(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Runner 1 берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner 1 бежит к Runner 2");

        System.out.println("Runner 2 берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner 2 бежит к Runner 3");

        System.out.println("Runner 3 берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner 3 бежит к Runner 4");

        System.out.println("Runner 4 берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner 4 бежит к Runner 5");

        System.out.println("Runner 5 берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Runner 5 бежит к Runner 1");
        System.out.println("Runner 1 берет палочку");
    }
}
