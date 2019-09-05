public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Запуск главного потока " + Thread.currentThread().getName());

            new Runner("Runner ").start();

        System.out.println("Завершение главного потока " + Thread.currentThread().getName());

    }
}
