public class Main {

    public static void main(String[] args) {
        Cat garfield = new Cat();
        Cow sapii = new Cow();
        Duck donald = new Duck();
        Animal animal = new Animal(false, false);

        System.out.println("Are Cats mammals? " + garfield.isMammal());
        System.out.println("Are Cats carnivores? " + garfield.isCarnivore());

        System.out.println("Are Cow mammals? " + sapii.isMammal());
        System.out.println("Are Cow carnivores? " + sapii.isCarnivore());

        System.out.println("Are Duck mammals? " + donald.isMammal());
        System.out.println("Are Duck carnivores? " + donald.isCarnivore());

        animal.animalSound();
        garfield.animalSound();
        sapii.animalSound();
        donald.animalSound();
    }
}