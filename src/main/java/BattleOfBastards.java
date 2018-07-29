public class BattleOfBastards {
    public static void main(String[] args){
        IronBank bank = new IronBank();
        Allies allies = new Allies(bank);
        Starks starks = new Starks(allies, bank);
        Boltons boltons = new Boltons(allies, bank);

        War war = new War(starks, boltons);
        war.prepare();
        war.report();
    }
}
