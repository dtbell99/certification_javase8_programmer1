class Macintosh extends Computer {

    public Macintosh() {
        super();
        doSomethingPrivateInSuperClass();
    }

    public void boot() {
        System.out.println("Booting Macintosh Computer");
    }

    // private void displayBiosInformation() {
    //     Throws weaker access privilege compile error
    //     System.out.println("Special Java Private displayBiosInformation");
    // }

    public void doSomethingPrivateInSuperClass() {

        // This is NOT overriding the super class private method because
        // Macintosh class can't see it.. so Macintosh just thinks this is its own
        // Method and can be used as such. 

        System.out.println("Doing something private but in subclass with same superclass method signature");
    }

    public static void main(String[] args) {
        Macintosh mac = new Macintosh();
        mac.boot();

        //That method is private, you will get a 
        //Macintosh.java:22: error: cannot find symbol
        //mac.doSomethingPrivateInSuperClass();
    }
}