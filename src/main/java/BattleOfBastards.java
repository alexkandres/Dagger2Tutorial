public class BattleOfBastards {
    public static void main(String[] args){
//        Old DI
//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//        War war = new War(starks, boltons);
//        war.prepare();
//        war.report();

//        New DI
        BattleComponent battleComponent = DaggerBattleComponent.create();
        War war = battleComponent.getWar();
        war.prepare();
        war.report();
    }
}
