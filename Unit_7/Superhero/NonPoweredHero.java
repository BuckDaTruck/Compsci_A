import java.util.ArrayList;

public abstract class NonPoweredHero extends Hero {
    private String transport;
    private String job;
    private ArrayList<String> gadgets;

    public NonPoweredHero(String name, ArrayList<String> strengths, String weakness, boolean cape, boolean tights, String plotArmor, String transport, String job, ArrayList<String> gadgets) {
        super(name, strengths, weakness, cape, tights, plotArmor);
        this.transport = transport;
        this.job = job;
        this.gadgets = gadgets;
    }

    public void goOnPatrol() {
        System.out.println(this.getName() + " went on patrol.");
    }
}