public class Villain extends Character {
    private double netWorth;
    private boolean inJail;
    private double bounty;
    private int numTimesJailed; 


    public Villain(String name, ArrayList<String> strengths, String weakness, boolean cape, boolean tights,String plotArmor, double netWorth, boolean inJail, double bounty, int numTimesJailed) {
        super(name, strengths, weakness, cape, tights,plotArmor);
        this.netWorth = netWorth;
        this.inJail = inJail;
        this.bounty = bounty;
        this.numTimesJailed = numTimesJailed;
    }
    public void commitCrime(int scale) {
        System.out.println(this.getName() + " committed a crime of scale " + scale);
    }
    public void escapeJail() {
        if (this.inJail) {
            this.inJail = false;
            this.numTimesJailed += 1;
        }
    }
}
