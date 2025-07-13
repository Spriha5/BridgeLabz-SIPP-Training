package Day5_Inheritance;



public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("sound of animal");
    }
    
    
    
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy", 3);
        Animal cat = new Cat("Billi", 2);
        Animal bird = new Bird("Pipi", 1);

        dog.makeSound();   
        cat.makeSound();   
        bird.makeSound();  
    }
}

// Subclass: Dog
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("sound of dog");
    }
}

// Subclass: Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("sound of cat");
    }
}

// Subclass: Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("sound of Bird");
    }
}


