class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal animal1 = new Dog(); 
        Animal animal2 = new Cat(); 

        dog.sound();
        cat.sound();

        animal1.sound(); 
        animal2.sound(); 
    }
}

