/**
 * Created by Kyle McNee on 3/21/2016.
 */
public class MansonHousehold extends Household {

    Fido fido = new Fido();

    @Override
    public void gainIncome() {
        System.out.println("The Mansons burglarize homes in Laurel Canyon for income");
    }

    @Override
    public Pet getPet() {
        return fido;
    }


}
