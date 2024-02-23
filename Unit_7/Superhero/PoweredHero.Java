public abstract class PoweredHero extends Hero {
    private String power;
    private String origins;
    private int numTrauma;


    public PoweredHero(String name, ArrayList<String> strengths, String weakness, boolean cape, boolean tights, String plotArmor, String power, String origins, int numTrauma) {
        super(name, strengths, weakness, cape, tights, plotArmor);
        this.power = power;
        this.origins = origins;
        this.numTrauma = numTrauma;
 
    }

    public void haveTrauma() {
        this.numTrauma += 1;
    }
}
