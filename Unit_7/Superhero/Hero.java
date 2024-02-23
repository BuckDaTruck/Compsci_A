import java.util.ArrayList;

public abstract class Hero extends Character {
    private String colorScheme;
    private int numJailed;
    private ArrayList<Character> conquered;

    public Hero(String colorScheme, String name, ArrayList<String> strengths, String weakness, boolean cape,
            boolean tights, String plotArmor) {
        super(name, strengths, weakness, cape, tights, plotArmor);
        this.colorScheme = colorScheme;
        numJailed = 0;
        conquered = new ArrayList<Character>();
    }

    public void interact(Character character) {
        if (character instanceof Hero) {
            System.out.println(this.getName() + " high fived " + character.getName());
        } else {
            if (this.isTights()) {
                this.conquered.add(character);
                if (character.isCape()) {
                    character.passAway();
                } else {
                    character.getJailed();
                    this.numJailed++;
                }
            }
        }

    }
}
