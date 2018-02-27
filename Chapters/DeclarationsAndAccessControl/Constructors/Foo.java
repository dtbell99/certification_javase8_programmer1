class Foo {
    public Foo() {
        System.out.println("In constructor");
    }

    public void Foo() {
        System.out.println("This is still valid.. improper but valid");
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        f.Foo();
    }
}