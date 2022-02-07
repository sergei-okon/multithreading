import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FooTest {

    public static void main(String[] args) {
        Foo foo = new Foo();

        CompletableFuture<String> future3
                = CompletableFuture.supplyAsync(foo::third);

        CompletableFuture<String> future1
                = CompletableFuture.supplyAsync(foo::first);

        CompletableFuture<String> future2
                = CompletableFuture.supplyAsync(foo::second);

        String combined = Stream.of(future1, future2, future3)
                .map(CompletableFuture::join)
                .collect(Collectors.joining());

        System.out.println(combined);

    }
}


