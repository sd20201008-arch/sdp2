package AbsFactory;
import AbsFactory.AbsProd.*;

public interface AbsFactory {
    Boss createBoss();
    Minion createMinion();
}