package packagetwo;

import packageone.ObjectOne;

class ObjectTwo {
    public static void main(String[] args) {
        ObjectOne objectOne = new ObjectOne();
        // Causes compile error about being accessed from outside package. 
        //objectOne.doAction();

        // Again we get a compile error for this because doAction2 though protected
        // isn't subclassed, so protected doesn't help.
        //objectOne.doAction2();
    }
}