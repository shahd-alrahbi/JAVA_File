public class Bird implements Animal{
    @Override
    public void eat() {
        System.out.println(" Bird eat seeds, fruits, and vegetables");

    }

    @Override
    public void makeSound() {
        System.out.print("Bird have many of sound like:");
        System.out.print("Chirp or tweet  ,");
        System.out.print("Singing  ,");
        System.out.print("Squawk or screech  ,");
        System.out.print("Warble");

    }
}
