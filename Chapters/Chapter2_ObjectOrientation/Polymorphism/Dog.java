import static java.lang.System.*;

class Dog extends Animal {
    
    public Dog() {
        bark();
    }

    public void eat() {
        out.println("Yummy, i'm eating a bone!");
    }

    public void bark() {
        out.println("Ruff Ruff");
    }
}