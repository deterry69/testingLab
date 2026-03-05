package testingLab;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MiddleEarthBattleTest {

    public MiddleEarthBattle battle;

    @BeforeEach
    void setUp() {
        // Initializes the framework before each test
        battle = new MiddleEarthBattle();
    }
    
    @Test
    void testHarfootVsOrc() {
        String result = battle.determineBattleResult(1, 2);
        assertEquals("The victors are the evil races :(", result);
    }

    @Test
    void testGoodSideWins() {
        String result = battle.determineBattleResult(15, 10);
        assertEquals("The victors are the good races :D", result);
    }

    @Test
    void testBattleTie() {
        String result = battle.determineBattleResult(20, 20);
        assertEquals("The battle ended in a tie", result);
    }

    @Test
    void testCalculateGoodScore() {
        int[] goodQuantities = {1, 1, 1, 1, 1};
        int totalCalculated = battle.calculateGoodScore(goodQuantities);
        assertEquals(15, totalCalculated);
    }

    @Test
    void testCalculateEvilScore() {
        int[] evilQuantities = {1, 1, 1, 1, 1};
        int totalCalculated = battle.calculateEvilScore(evilQuantities);
        assertEquals(14, totalCalculated);
    }
    
    @Test
    void testZeroLimitValues() {
        // Black Box Testing: Boundary Values
        String result = battle.determineBattleResult(0, 0);
        assertEquals("The battle ended in a tie", result);
        assertNotNull(result); 
    }
}