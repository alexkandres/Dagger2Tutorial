import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();
    Starks getStarks();
    Boltons getBoltons();
}
