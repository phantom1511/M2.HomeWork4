public class Runner extends Thread implements Runnable {

    public Runner(String name) {
        super(name);
    }

    public void run() {
        Runner runner1 = new Runner("Runner 1 ");
        Runner runner2 = new Runner("Runner 2 ");
        Runner runner3 = new Runner("Runner 3 ");
        Runner runner4 = new Runner("Runner 4 ");
        Runner runner5 = new Runner("Runner 5 ");

        System.out.println(runner1.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner1.getName()+ " бежит к " + runner2.getName());

        System.out.println(runner2.getName() + " берет палочку");
        try {
            Thread th2 = new Thread(runner2);
            th2.start();
            th2.join();
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner2.getName()+ " бежит к " + runner3.getName());

        System.out.println(runner3.getName() + " берет палочку");
        try {
            Thread th3 = new Thread(runner3);
            th3.start();
            th3.join();
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner3.getName()+ " бежит к " + runner4.getName());

        System.out.println(runner4.getName() + " берет палочку");
        try {
            Thread th4 = new Thread(runner4);
            th4.start();
            th4.join();
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner4.getName()+ " бежит к " + runner5.getName());

        System.out.println(runner5.getName() + " берет палочку");
        try {
            Thread th5 = new Thread(runner5);
            th5.start();
            th5.join();
            sleep(5000);
        } catch (InterruptedException ie) {
        }
        System.out.println(runner5.getName()+ " бежит к " + runner1.getName());
    }
}
