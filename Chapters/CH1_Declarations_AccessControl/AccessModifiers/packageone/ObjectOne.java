package packageone;

public class ObjectOne {

    // packagetwo.ObjectTwo cant access this method because it has default access
    // Only objects in this packageone can call it even though this class is
    // public.
    void doAction() {
        System.out.println("ObjectOne.doAction() I'm Default");
    }

    protected void doAction2() {
        System.out.println("ObjectOne.doAction2() I'm Protected");
    }

    public void doAction3() {
        System.out.println("ObjectOne.doAction3() I'm Public :) ");
    }

    public int publicVariable = 0;

    protected int protectedVariable = 1;

    int defaultVariable = 2;

    private int privateVariable = 3;
}
