public class Boltons implements House {

    Allies allies;
    IronBank bank;

    public Boltons(Allies allies, IronBank bank) {
        this.allies = allies;
        this.bank = bank;
    }

    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+" reporting..");
    }
}
