class Foo {
    void action() {
        System.out.println("Nothing");
    }
}

class Bar extends Foo {
    int action() {
        return 1;
    }
}

public class Valid {
    public Bar getABar() {
        Foo f = new Foo();
        return f;
    }
}