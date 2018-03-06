interface Computer {
    void boot();
    default int disconnect() { return 0; }
    Computer getComputer();
}

interface ElectronicDevice {
    default int disconnect() { return 1; }
}

class PC implements Computer, ElectronicDevice {

    public void boot() {
        System.out.println("Booting up PC");
    }

    // You have to implement your own method for disconnect here because both Computer
    // and ElectronicDevice have a default disconnect method. 
    public int disconnect() {
        return 3;
    }

    public Computer getComputer() {
        return new PC();
    }

    public static void main(String[] args) {
        System.out.println("PC");
    }
}

abstract class Mac implements Computer {

}

class MacbookPro extends Mac {
    public void boot() {
        System.out.println("Macbook Pro Booting");
    }

    public int disconnect() {
        return 2;
    }

    public Computer getComputer() {
        return new MacbookPro();
    }

    public static void main(String[] args) {
        Computer macbookPro = new MacbookPro();
        macbookPro.boot();
        System.out.println("Macbook Pro");
    }
}

