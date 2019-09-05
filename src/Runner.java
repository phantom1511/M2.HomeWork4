public class Runner extends Thread {

    public Runner(String name) {
        super(name);
    }

    public void run() {
        Runner runner1 = new Runner("Runner 1 ");
        Runner runner2 = new Runner("Runner 2");
        Runner runner3 = new Runner("Runner 3");
        Runner runner4 = new Runner("Runner 4");
        Runner runner5 = new Runner("Runner 5");

        System.out.println(runner1.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner1.getName() + " бежит к " + runner2.getName());

        System.out.println(runner2.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner2.getName() + " бежит к " + runner3.getName());

        System.out.println(runner3.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner3.getName() + " бежит к " + runner4.getName());

        System.out.println(runner4.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner4.getName() + " бежит к " + runner5.getName());

        System.out.println(runner5.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(runner5.getName() + " бежит к " + runner1.getName());
    }
}
