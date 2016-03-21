/**
 * Created by Kyle McNee on 3/21/2016.
 */
public class Fido implements Pet {
    @Override
    public void feed() {
        System.out.println("Charlie feeds Fido");
    }

    @Override
    public void groom() {
        System.out.println("Tex brushes Fido's soft fur");
    }

    @Override
    public void play() {
        System.out.println("Squeaky plays fetch with Fido");
    }
}
