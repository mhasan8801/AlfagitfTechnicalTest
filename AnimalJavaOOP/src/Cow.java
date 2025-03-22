public class Cow extends Animal {
    public Cow() {
        super(true, true); // Sapi adalah mamalia tetapi herbivora (dalam konteks ini true sesuai permintaan output)
    }

    @Override
    public void animalSound() {
        System.out.println("Moooo. . .");
    }
}