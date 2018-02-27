class Sub extends Super{

// This will cause compile to break because super class doAction has final on it. 
    public void doAction() {
        System.out.println("Doing an action");
    }
}