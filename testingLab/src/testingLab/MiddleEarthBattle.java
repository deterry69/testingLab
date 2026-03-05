package testingLab;
import java.util.HashMap;
import java.util.Map;

public class MiddleEarthBattle {
    public static final Map<String, Integer> goodRaces = new HashMap<>();
    public static final Map<String, Integer> evilRaces = new HashMap<>();

    static {
        goodRaces.put("Harfoots", 1);
        goodRaces.put("Good Southrons", 2);
        goodRaces.put("Dwarves", 3);
        goodRaces.put("Numenoreans", 4);
        goodRaces.put("Elves", 5);
        
        evilRaces.put("Evil Southrons", 2);
        evilRaces.put("Orcs", 2);
        evilRaces.put("Goblins", 2);
        evilRaces.put("Wargs", 3);
        evilRaces.put("Trolls", 5);
    }

    public int calculateGoodScore(int[] quantities) {
        int goodTotalValue = 0;
        int i = 0;
        for (String race : goodRaces.keySet()) {
            goodTotalValue += quantities[i++] * goodRaces.get(race);
        }
        return goodTotalValue;
    }

    public int calculateEvilScore(int[] quantities) {
        int evilTotalValue = 0;
        int i = 0;
        for (String race : evilRaces.keySet()) {
            evilTotalValue += quantities[i++] * evilRaces.get(race);
        }
        return evilTotalValue;
    }

    public String determineBattleResult(int goodScore, int evilScore) {
        if (goodScore > evilScore) {
            return "The victors are the good races :D";
        } else if (evilScore > goodScore) {
            return "The victors are the evil races :(";
        } else {
            return "The battle ended in a tie";
        }
    }
}