class ValidVarargs {
    public void processOne(int... i) {
        System.out.println("ValidVarargs.processOne");
        for (int r = 0; r < i.length; r++) {
            System.out.println("r:" + r + " val->" + i[r]);
        }
    }

    public void processTwo(String title, int... i) {
        System.out.println("ValidVarargs.processTwo");
    }

    public static void main(String[] args) {
        ValidVarargs v = new ValidVarargs();
        v.processOne(1, 2, 3, 4, 5);
        v.processTwo("Some Title", 4, 5, 6, 7, 8, 10);
    }
}