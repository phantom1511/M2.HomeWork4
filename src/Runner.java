public class Runner extends Thread {
    Thread runner1 = new Thread("Runner 1 ");
    Thread runner2 = new Thread("Runner 2 ");
    Thread runner3 = new Thread("Runner 3 ");
    Thread runner4 = new Thread("Runner 4 ");
    Thread runner5 = new Thread("Runner 5 ");


    public void run() {
        try {
            System.out.println(runner1.getName() + " берет палочку");
            System.out.println(runner1.getName() + " бежит к " + runner2.getName());
            runner1.start();
            runner1.sleep(5000);

            System.out.println(runner2.getName() + " берет палочку");
            System.out.println(runner2.getName() + " бежит к " + runner3.getName());
            runner2.start();
            runner2.sleep(5000);

            System.out.println(runner3.getName() + " берет палочку");
            System.out.println(runner3.getName() + " бежит к " + runner4.getName());
            runner3.start();
            runner3.sleep(5000);

            System.out.println(runner4.getName() + " берет палочку");
            System.out.println(runner4.getName() + " бежит к " + runner5.getName());
            runner4.start();
            runner4.sleep(5000);

            System.out.println(runner5.getName() + " берет палочку");
            System.out.println(runner5.getName() + " бежит к " + runner4.getName());
            runner5.start();
            runner5.sleep(5000);

            System.out.println(runner4.getName() + " берет палочку");
            System.out.println(runner4.getName() + " бежит к " + runner3.getName());
            runner4.sleep(5000);
            runner4.join();

            System.out.println(runner3.getName() + " берет палочку");
            System.out.println(runner3.getName() + " бежит к " + runner2.getName());
            runner3.sleep(5000);
            runner3.join();

            System.out.println(runner2.getName() + " берет палочку");
            System.out.println(runner2.getName() + " бежит к " + runner1.getName());
            runner2.sleep(5000);
            runner2.join();

            System.out.println(runner1.getName() + " берет палочку");


        } catch (InterruptedException ie) {
        }
    }
}
