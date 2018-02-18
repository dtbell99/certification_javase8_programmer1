class Dog extends Animal {

    public void eat() {
        System.out.println("Ruff ruff, i'm eating");
    }

    public void sleep() {
        System.out.println("I'm a sleepy puppy");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }

}