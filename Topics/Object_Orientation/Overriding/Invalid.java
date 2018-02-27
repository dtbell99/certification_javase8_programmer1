public class Invalid extends SuperInvalid {
    
    // You can't override a method with a lower privilege.
    // attempting to assign weaker access privileges; was public

    private void doAction() {
        System.out.println("Overriding doAction()");
    }

    public void doSubAction() {
        System.out.println("Doing sub action");
    }

    public static void main(String[] args) {
        SuperInvalid si = new Invalid(); // Notice reference vs. object
        si.doSubAction(); // This will fail in compile because SuperInvalid knows nothing about doSubAction()
        System.out.println("si.counter:"+si.counter);
    }

    public int counter = 200;

    
}

class SuperInvalid {

    public void doAction() {
        System.out.println("SuperInvalid Doing Action");
    }

    public int counter = 929;
}