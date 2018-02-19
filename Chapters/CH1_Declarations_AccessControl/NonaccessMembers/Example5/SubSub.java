class SubSub extends Sub {
    public void doAction2() {
        System.out.println("SubSub.doAction()");
    }

    public static void main(String[] args) {
        SubSub ss = new SubSub();
          ss.doAction();
        ss.getType();
    }
}