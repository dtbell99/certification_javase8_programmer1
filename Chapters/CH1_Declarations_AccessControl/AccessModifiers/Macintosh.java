class Macintosh extends Computer {

    public Macintosh() {
        super();
    }

    public void boot() {
        System.out.println("Booting Macintosh Computer");
    }

    public static void main(String[] args) {
        Macintosh mac = new Macintosh();
        mac.boot();
    }
}