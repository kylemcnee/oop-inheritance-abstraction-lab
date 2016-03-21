

public class Driver {
    public static void main(String[] args) {
        //Create households and add to list or array
        MansonHousehold mansonHousehold = new MansonHousehold();
        DahmerHousehold dahmerHousehold = new DahmerHousehold();

        Household[] households = new Household[2];
        households[0] = mansonHousehold;
        households[1] = dahmerHousehold;
        //iterate through list or array and perform required actions
        for (int i = 0; i<households.length; i++){
            households[i].gainIncome();
            households[i].payTaxes(666.66);
            households[i].getPet().feed();
            households[i].getPet().groom();
            households[i].getPet().play();
        }
    }

}