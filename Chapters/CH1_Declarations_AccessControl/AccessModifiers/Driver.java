class Driver {
    public void doDriverStuff() {
        SportsCar car = new SportsCar();
        car.goFast();

        Convertible con = new Convertible();
        con.goFast();
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.doDriverStuff();
    }

}