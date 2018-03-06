class Pet {
    void eat() {
        System.out.println("Num num");
    }
}

class Cat extends Pet {
    
    private String getName() {
        return "Bobcat";
    }

    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.eat();
        //pet.getName(); // This will throw up

        Cat cat = (Cat) pet;
        cat.getName();

        Pet newPet = new Pet();
        //Cat newCat = (Cat) newPet; // Exception in thread "main" java.lang.ClassCastException: Pet cannot be cast to Cat
    
        //String newPetString = (String) newPet; // Valid.java:24: error: incompatible types: Pet cannot be converted to String
    }
}

class AlleyCat extends Cat {

    private void digThroughGarbage() {
        System.out.println("Dig baby dig");
    }

    public static void main(String[] args) {
        AlleyCat alleyCat = new AlleyCat();
        boolean isPet = (alleyCat instanceof Pet);
        System.out.println("AlleyCat is-a pet? : " + isPet);

        Pet pet = new AlleyCat();
        pet.eat();

        ((AlleyCat) pet).digThroughGarbage(); // Remember to watch out for this shortening code.
    }
}