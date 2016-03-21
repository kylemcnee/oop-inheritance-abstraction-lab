/**
 * Created by Kyle McNee on 3/21/2016.
 */
public abstract class Household {

    public void payTaxes(double income){
        System.out.println("Pay 20% of "+income);
    }

    public abstract void gainIncome();
    public abstract Pet getPet();

}
