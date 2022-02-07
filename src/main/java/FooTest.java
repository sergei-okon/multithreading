import java.util.concurrent.*;

public class FooTest {

    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture.runAsync(foo::third);
        CompletableFuture.runAsync(foo::first);
        CompletableFuture.runAsync(foo::second);
    }
}


