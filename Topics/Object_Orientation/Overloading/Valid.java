public class Valid extends Super {
    public void action(String type, int tot) {
        System.out.println("Valid.action(String, int) type:" + type + " tot:" + tot);
    }

    public void action(String type) {
        System.out.println("Valid.action(String) type:" + type);
    }

    public static void main(String[] args) {
        Valid v = new Valid();
        v.action("hello world");
        v.action("hello world ", 2);
    }
}

class Super {
    public void action(String type) {
        System.out.println("Super.action(String):" + type);
    }
}

class Processor {
    public void process(Super s) {
        s.action("Super action");
    }

    public void process(Valid v) {
        v.action("Valid action");
    }

    public static void main(String[] args) {
        Super s = new Valid();
        Valid v = new Valid();

        Processor p = new Processor();
        p.process(s);
        p.process(v);
    }
}