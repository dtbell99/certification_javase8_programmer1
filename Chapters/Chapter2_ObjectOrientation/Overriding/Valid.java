// You can override with a stronger privilege.. like override a default with a public.
// You can NOT override a public with a private though for example.

public class Valid extends SuperValid {
    public void doAction() {
        System.out.println("Overriding doAction()");
    }
}

class SuperValid {
     void doAction() {
        System.out.println("SuperValid Doing Action");
    }
}