package p2;

import p2.Sub;

class Sub2 extends Sub {
    public static void main(String[] args) {
        // Fails, action in super is protected
        // Sub s = new Sub();
        // s.action();

        Sub2 s2 = new Sub2();
        System.out.println("Calling sub2.action()");
        s2.action();

    }
}