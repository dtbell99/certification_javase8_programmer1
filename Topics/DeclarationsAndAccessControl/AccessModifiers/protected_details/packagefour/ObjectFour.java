package packagefour;

import packagethree.ObjectThree;

class ObjectFour {

    public static void main(String[] args) {
        ObjectThree o3 = new ObjectThree();
        // This fails, as the inherited protected method doAction2() is private outside the extending class.
        o3.doAction2();
    }
}