/**
 * Created by Kyle McNee on 3/21/2016.
 */
public class JarredRodent implements Pet{
    @Override
    public void feed() {
        System.out.println("Jeff unscrews the lid and feeds the jarred rodent");
    }

    @Override
    public void groom() {
        System.out.println("Most of the hair has decomposed");
    }

    @Override
    public void play() {
        System.out.println("Jeff rolls the jar around on the table");
    }
}
