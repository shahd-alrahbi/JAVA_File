// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        Dog dog=new Dog();
        dog.eat();
        dog.makeSound();
        System.out.println("\n");
        Cat cat=new Cat();
        cat.eat();
        cat.makeSound();
        System.out.println("\n");
        Bird bird=new Bird();
        bird.eat();
        bird.makeSound();

    }
}

interface Animal{
    void eat();
    void makeSound();
}

