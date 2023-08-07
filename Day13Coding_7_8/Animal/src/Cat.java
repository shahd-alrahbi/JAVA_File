public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println(" Cat can eat both meat and plant-based foods");
    }

    @Override
    public void makeSound() {
        System.out.print("Cat have many of sound like:");
        System.out.print("Meow  ,");
        System.out.print("Purr  ,");
        System.out.print("Hiss  ,");
        System.out.print("Growl");

    }
}
