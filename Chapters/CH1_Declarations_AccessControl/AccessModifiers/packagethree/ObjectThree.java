package packagethree;

import packageone.ObjectOne;

public class ObjectThree extends ObjectOne {

    public static void main(String[] args) {
        ObjectThree o3 = new ObjectThree();

        // Even though it is subclassed, the doAction method in ObjectOne is default (void doAction()) so you can't
        // access it even in subclass. 
        //o3.doAction();

        // However, even though ObjectThree and ObjectOne are in different packages, if you make the method protected
        // in the super class a subclass in a different package can access it. 
        o3.doAction2();

        // This is a public method in a public class, we are all good to go.
        o3.doAction3();

        System.out.println("public variable    : " + o3.publicVariable);
        System.out.println("protected variable : " + o3.protectedVariable);
        // This won't work because you can't access a default variable just like you can't access a default method. Rules are the same. 
        //System.out.println("default variable   : " + o3.defaultVariable);

        // How about this one? This works fine in packageone.ObjectOne2 (same package.. but here we are in packagethree.. hmm)

        ObjectOne o1 = new ObjectOne();
        System.out.println("public variable: " + o1.publicVariable);
        // These fail because they are not in the same package but they DO work from ObjectThree because it is a subclass. 
        //System.out.println("private variable: " + o1.protectedVariable);
        //System.out.println("default varialbe: " + o1.defaultVariable);

    }

}