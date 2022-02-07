public class Foo extends Thread {

    private String print(String str) {
        return str;
    }

    public String first() {
        return print("first");
    }

    public String second() {
        return print("second");
    }

    public String third() {
        return print("third");
    }
}
