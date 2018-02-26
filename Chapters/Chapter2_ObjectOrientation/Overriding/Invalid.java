public class Invalid extends SuperInvalid {
    
    // You can't override a method with a lower privilege.
    // attempting to assign weaker access privileges; was public

    private void doAction() {
        System.out.println("Overriding doAction()");
    }

    
}

class SuperInvalid {

    public void doAction() {
        System.out.println("SuperInvalid Doing Action");
    }
}