import java.util.ArrayList;

public abstract class Character {
    private String name;
    private boolean isAlive;
    private ArrayList<String> strengths;
    private String weakness;
    private boolean cape;
    private boolean tights;
    private Character nemesis;
    private String plotArmor;


    public Character(String name,ArrayList<String> strengths,String weakness,boolean cape, boolean tights, String plotArmor){
            this.name = name;
            isAlive = true;
            this.strengths = strengths;
            this.weakness = weakness;
            this.cape = cape;
            this.tights = tights;
            this.nemesis = null;
            this.plotArmor = plotArmor;

    }

    public void setNemesis(Character nemesis) {
        this.nemesis = nemesis;
    }

    public abstract void interact(Character character);

    public String getName() {
        return name;
    }

    public boolean isTights() {
        return tights;
    }

    public boolean isCape() {
        return cape;
    }
public void getJailed(){
    System.out.println(name + " was jailed.");
}

    public void passAway(){
        isAlive = false;
    }

    public String toString(){
        if(tights){
            return name + " wears tights.";
        }
        else{
            return name + " is boring.";
        }
    }
}
