// Base class (Parent)
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;  // 'this' keyword is used to refer to the current object's name
    }

    // Method to display the name
    void display() {
        System.out.println("I am an animal named " + this.name);
    }
}

// Derived class (Child)
class Dog extends Animal {
    String breed;

    // Constructor
    Dog(String name, String breed) {
        super(name);  // 'super' keyword is used to call the parent class's constructor
        this.breed = breed;  // 'this' refers to the current object's breed
    }

    // Method to display the breed and name
    void displayDetails() {
        super.display();  // 'super' keyword is used to call the parent class's method
        System.out.println("I am a " + this.breed);  // 'this' refers to the current object's breed
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Displaying details
        dog.displayDetails();
    }
}
