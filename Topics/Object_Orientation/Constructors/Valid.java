class Bar {

    private String s;

    Bar() {
        // You must create this because Foo() below gets a compiler inserted super() :) Tricky huh.
    }

    Bar(String s) {
        this.s = s;
    }

    public String getS() {
        return this.s;
    }
}

class Foo extends Bar {
    Foo() {
        // You have to call super here yourself.. compiler inserted super() will blow because the super calss
        // does not have one and because one exists for a string argument overload you must create the regular.
        
    }

    Foo(String t) {
        super(t);
    }


}