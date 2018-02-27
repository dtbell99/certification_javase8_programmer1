class Farm {

    public void feedAnimal(Animal m) {
        m.eat();
        if (m instanceof Dog) {
            Dog d = (Dog) m;
            System.out.println("I'm a dog so I want to bark when I eat");
            d.bark();
        }
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Farm f = new Farm();
        f.feedAnimal(d);
        f.feedAnimal(c);

    }
}