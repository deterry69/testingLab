package testingLab;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiddleEarthBattle battle = new MiddleEarthBattle();

        System.out.println("Enter the number of units for good races:");
        int[] goodQuantities = new int[5];
        int i = 0;
        for (String race : MiddleEarthBattle.goodRaces.keySet()) {
            System.out.print(race + ": ");
            goodQuantities[i++] = sc.nextInt();
        }

        System.out.println("Enter the number of units for evil races:");
        int[] evilQuantities = new int[5];
        i = 0;
        for (String race : MiddleEarthBattle.evilRaces.keySet()) {
            System.out.print(race + ": ");
            evilQuantities[i++] = sc.nextInt();
        }

        int goodScore = battle.calculateGoodScore(goodQuantities);
        int evilScore = battle.calculateEvilScore(evilQuantities);

        System.out.println("\nBattle Results:");
        System.out.println(battle.determineBattleResult(goodScore, evilScore));

        sc.close();
    }
}