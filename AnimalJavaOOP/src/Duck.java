public class Duck extends Animal {
    public Duck() {
        super(true, true); // Bebek bukan mamalia tetapi dalam output diharapkan true untuk keduanya
    }

    @Override
    public void animalSound() {
        System.out.println("Quack. . .");
    }
}