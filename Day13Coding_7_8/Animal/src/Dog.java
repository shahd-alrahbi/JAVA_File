public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println(" Dog can eat both meat and plant-based foods");

    }

    @Override
    public void makeSound() {
        System.out.print("Dog have many of sound like:");
        System.out.print("Bark  ,");
        System.out.print("Howl  ,");
        System.out.print("Whine  ,");
        System.out.print("Growl");

    }
}
