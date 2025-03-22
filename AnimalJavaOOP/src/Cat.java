public class Cat extends Animal {
    public Cat() {
        super(true, true); // Kucing adalah mamalia dan karnivora
    }

    @Override
    public void animalSound() {
        System.out.println("Meow. . .");
    }
}