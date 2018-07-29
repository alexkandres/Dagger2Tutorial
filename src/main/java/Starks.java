import javax.inject.Inject;

public class Starks implements House {

    @Inject
    public Starks(){

    }

//    public Starks(Allies allies, IronBank bank) {
//        this.allies = allies;
//        this.bank = bank;
//    }

    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
