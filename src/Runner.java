public class Runner extends Thread {
    String name2;

    public String getName2() {
        return name2;
    }

    public Runner(String name, String name2) {
        super(name);
        this.name2 = name2;
    }

    public void run() {
        System.out.println(this.getName() + " берет палочку");
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " бежит к " + name2);

        /*System.out.println("Runner 2 берет палочку");
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
        System.out.println("Runner 5 бежит к Runner 1");*/
    }
}
