class TestSuperExceptionSuperClass {

    public void action() throws Exception {
        System.out.println("super.action()");
    }
}

public class TestSuperException extends TestSuperExceptionSuperClass {

    public void action() {
        // No exception declared to be thrown. 
        System.out.println("action()");
    }

    public static void main(String[] args) {
        TestSuperException tse = new TestSuperException();
        tse.action();

        TestSuperExceptionSuperClass tseSuper = new TestSuperException();
        tseSuper.action();
    }
}