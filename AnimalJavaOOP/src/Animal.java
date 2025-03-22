public class Animal {
    private boolean isMammal;
    private boolean isCarnivore;

    public Animal(boolean isMammal, boolean isCarnivore) {
        this.isMammal = isMammal;
        this.isCarnivore = isCarnivore;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isCarnivore() {
        return isCarnivore;
    }

    public void animalSound() {
        System.out.println("----------------------");
    }
}