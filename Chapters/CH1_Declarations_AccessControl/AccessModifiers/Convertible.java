
class Convertible extends SportsCar {
    public void doThings() {
        SportsCar sc = new SportsCar();
        sc.goFast();

    }

    public void doMore() {
        goFast();
    }
}