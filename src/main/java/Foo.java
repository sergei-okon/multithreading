import java.util.concurrent.Semaphore;

public class Foo {

    public Semaphore semaphoreForSecond = new Semaphore(0);
    public Semaphore semaphoreForThird = new Semaphore(0);

    private synchronized void print(String str) {
        System.out.print(str);
    }

    public void first() {
        print("first");
        semaphoreForSecond.release();
    }

    public void second() {
        try {
            semaphoreForSecond.acquire();
            print("second");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphoreForThird.release();
    }

    public void third() {
        try {
            semaphoreForThird.acquire();
            print("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
