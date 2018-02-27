abstract class Computer {

    public Computer() {
        displayBiosInformation();
    }

    public void boot() {
        System.out.println("Computer Is booting");
    }

    public void displayBiosInformation() {
        System.out.println("BIOS Info: Blah Blah");
        doSomethingPrivateInSuperClass();
    }

    private void doSomethingPrivateInSuperClass() {
        System.out.println("Doing something private in superclass computer");
    }
}