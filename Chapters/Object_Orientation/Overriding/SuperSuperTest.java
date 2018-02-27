class SuperOne {
    public void action() {
        System.out.println("SuperOne.action()");
    }
}

class SuperTwo extends SuperOne {
    public void action() {
        super.action();
        System.out.println("SuperTwo.action()");
    }
}

class SubOne extends SuperTwo {

    public void action() {
        super.action();
        System.out.println("SubOne.action()");
    }

    public static void main(String[] args) {
        SubOne sub = new SubOne();
        sub.action();
    }
}