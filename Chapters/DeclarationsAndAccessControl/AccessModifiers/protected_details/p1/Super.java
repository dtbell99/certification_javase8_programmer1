package p1;

public class Super {

    public Super() {
        System.out.println("In constructor");
        action();
        System.out.println("Leaving Constructor");

    }

    protected void action() {
        System.out.println("Super.action()");
    }
}