package week06.Instance;

public class Main {
    public static void main(String[] args) {
    Animal animal = new Cat();

    if (animal instanceof Animal) {
        System.out.println("The object is an instance of Animal");
    }

    if (animal instanceof Dog) {
        System.out.println("The object is an instance of Dog");
    }

    if (animal instanceof Cat) {
        System.out.println("The object is an instance of Cat");
    }

    animal.makeSound(); // Calls the overridden method in Dog
}
}
