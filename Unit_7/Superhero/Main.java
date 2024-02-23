import java.util.ArrayList;
import java.util.Arrays;
// note I might have had chat gpt generate me a story line
public class Main {
    public static void main(String[] args) {

        ArrayList<String> heroStrengths = new ArrayList<>(Arrays.asList("Super Strength", "Flight"));
        PoweredHero poweredHero = new PoweredHero("Mighty Eagle", heroStrengths, "Kryptonite", true, false,
                "Always Wins", 100);

        ArrayList<String> nonHeroStrengths = new ArrayList<>(Arrays.asList("Intelligence", "Martial Arts"));
        NonPoweredHero nonPoweredHero = new NonPoweredHero("The Strategist", nonHeroStrengths, "Pride", false, true,
                "Luck", 10, "Detective");

        ArrayList<String> villainStrengths = new ArrayList<>(Arrays.asList("Wealth", "Influence"));
        Villain villain = new Villain("Dark Baron", villainStrengths, "Overconfidence", false, false, "Plot Armor",
                1000000, false, 50000, 0);

        villain.commitCrime(10);
        System.out.println("Dark Baron has hatched a scheme to take over the city!");

        System.out.println("Mighty Eagle and The Strategist join forces to stop the Dark Baron.");

        poweredHero.usePower("Super Strength");
        nonPoweredHero.solveMystery("The location of the Dark Baron's lair");
        villain.escapeJail();
        System.out.println("A fierce battle ensues...");

        if (villain.isInJail()) {
            System.out.println("The heroes have triumphed! Peace is restored to the city.");
        } else {
            System.out.println("The Dark Baron escapes, vowing revenge...");
        }
    }
}
