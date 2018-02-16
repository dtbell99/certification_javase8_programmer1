package testpackage;

import testpackage.interfaces.Rollable;

class Ball implements Rollable {
    public void roll() {
        System.out.println("I'm rollilng");
    }
}