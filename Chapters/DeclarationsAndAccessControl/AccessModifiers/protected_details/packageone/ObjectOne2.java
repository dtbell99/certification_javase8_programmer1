package packageone;

import packageone.ObjectOne;

class ObjectOne2 {

    public static void main(String[] args) {

        // These all work because ObjectOne2 is in the same package as ObjectOne :) 
        // If you try this in packagethree.ObjectThree you will get compile failures

        ObjectOne o1 = new ObjectOne();
        System.out.println("public variable: " + o1.publicVariable);
        System.out.println("private variable: " + o1.protectedVariable);
        System.out.println("default varialbe: " + o1.defaultVariable);
    }
}