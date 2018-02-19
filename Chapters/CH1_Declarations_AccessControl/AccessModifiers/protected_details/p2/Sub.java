package p2;

import p1.Super;

public class Sub extends Super {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.action();

        // Will blow compiler up.. action is protected, must be executed in super internally or in sub.ja
        // Super s2 = new Super();
        // s2.action();
    }
}