public class Runner extends Thread {

    public Runner(String name) {

        super(name);
    }

    public void run() {
        Thread runner1 = new Thread("Runner 1 ");
        Thread runner2 = new Thread("Runner 2 ");
        Thread runner3 = new Thread("Runner 3 ");
        Thread runner4 = new Thread("Runner 4 ");
        Thread runner5 = new Thread("Runner 5 ");

        System.out.println(runner1.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner1.getName() + " бежит к " + runner2.getName());

        System.out.println(runner2.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner2.getName() + " бежит к " + runner3.getName());

        System.out.println(runner3.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner3.getName() + " бежит к " + runner4.getName());

        System.out.println(runner4.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner4.getName() + " бежит к " + runner5.getName());

        System.out.println(runner5.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner5.getName() + " бежит к " + runner1.getName());
        System.out.println(runner1.getName() + " берет палочку");
    }
}
