// You can override with a stronger privilege.. like override a default with a public.
// You can NOT override a public with a private though for example.

public class Valid extends SuperValid {

     int counter = 929;

    public void doAction() {
        super.doAction(); // Calling the super version first
        System.out.println("Overriding doAction()");
    }

    public void doASubAction() {
        System.out.println("Doing a sub action");
    }

    public static void main(String[] args) {
        SuperValid v = new Valid();
        v.doASuperAction();
        v.doAction();
// ---
        System.out.println("Counter:"+v.counter); // Will be the super counter btw (you can't override instance variables)
// --- 
        Valid v2 = new Valid();
        v2.doASubAction();
// ---




        
    }
}

class SuperValid {

    int counter = 200;

     void doAction() {
        System.out.println("SuperValid Doing Action");
    }

    public void doASuperAction() {
        System.out.println("Doing a super action");
    }


}