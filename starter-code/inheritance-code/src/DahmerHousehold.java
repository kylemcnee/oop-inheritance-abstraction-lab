/**
 * Created by Kyle McNee on 3/21/2016.
 */
public class DahmerHousehold extends Household {

    JarredRodent jarredRodent = new JarredRodent();


    @Override
    public void gainIncome() {
        System.out.println("The Dahmers rob local hitchhikers to gain income");
    }

    @Override
    public Pet getPet() {
        return jarredRodent;
    }


}
