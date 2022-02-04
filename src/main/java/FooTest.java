public class FooTest {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();

        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
//                System.out.println("Current Thread Name- " + Thread.currentThread().getName());
                foo.first(this);
            }
        };

        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
//                System.out.println("Current Thread Name- " + Thread.currentThread().getName());
                foo.second(this);
            }
        };

        Runnable runnableC = new Runnable() {
            @Override
            public void run() {
//                System.out.println("Current Thread Name- " + Thread.currentThread().getName());
                foo.third(this);
            }
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        Thread threadC = new Thread(runnableC);

        threadA.start();
        threadA.join();

        threadB.start();
        threadB.join();

        threadC.start();
        threadC.join();
    }
}

