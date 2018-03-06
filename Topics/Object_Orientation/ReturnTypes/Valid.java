class Valid {
    public int getInt() {
        char c = '2';
        return c;
    }

    public static void main(String[] args) {
        Valid v = new Valid();
        Object o = v.getAnObject();
        if (o instanceof int[]) {
            System.out.println("What.. oh right a array is an object even if it is filled with primatives.");
        }
    }

    public Foo getAFoo() {
        Bar b = new Bar();
        return b;
    }

    public Object getAnObject() {
        int[] intArray = {1, 2, 3};
        return intArray;
    }
}


class Foo {

}

class Bar extends Foo {

}