public class Main {

    public static void main(String[] args) {
        System.out.println("Запуск главного потока " + Thread.currentThread().getName());
        Runner runner = new Runner();
        runner.start();
        System.out.println("Завершение главного потока " + Thread.currentThread().getName());
//        Thread th = new Thread(runner);
//        th.start();
//        try {
//            th.join();
//        } catch (InterruptedException ie) {
//        }
//
    }
}
