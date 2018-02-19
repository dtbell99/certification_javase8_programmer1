package packagethree;

import packagethree.ObjectThree;

class ObjectThree2 extends ObjectThree {

    public static void main(String[] args) {
        ObjectThree2 o32 = new ObjectThree2();
        // Default didn't work when ObjectThree subclassed out ObjectOne. so it still doesn't work
        //System.out.println("default variable   : " + o32.defaultVariable);
        System.out.println("public variable    : " + o32.publicVariable);
        System.out.println("protected variable : " + o32.protectedVariable);
    }
}