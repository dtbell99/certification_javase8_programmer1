public class Valid extends Super {
    public void action(String type, int tot) {
        System.out.println("overload type:"+type+" tot:"+tot);
    }

    public void action(String type) {
        System.out.println("Overriding type:"+type);
    }

    public static void main(String[] args) {
        Valid v = new Valid();
        v.action("hello world");
        v.action("hello world ", 2);
    }
}

class Super {
    public void action(String type) {
        System.out.println("type:"+type);
    }
}