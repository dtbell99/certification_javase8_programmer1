class Moo extends Zoo {
    public void useMyCoolMethod() {
        System.out.println("Moo says, " + this.coolMethod());
        Zoo z = new Zoo();
        System.out.println("Zoo says, " + z.coolMethod());
    }

    public static void main(String[] args) {
        Moo m = new Moo();
        m.useMyCoolMethod();
    }
}