import food.Fruit;

class Apple extends Fruit {

    public String getColor() {
        return "red";
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println("Apple color is: " + apple.getColor());
    }
}