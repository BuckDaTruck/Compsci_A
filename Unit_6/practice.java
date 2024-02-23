package Unit_6;
import java.util.ArrayList;

public class practice {
    public static void main(String[] args){
        ArrayList<String> NBAPlayers = new ArrayList<String>();    
        System.out.println(NBAPlayers.size() + " players in the list");
        NBAPlayers.add("Andrew Wiggins");
        NBAPlayers.add("Karl-Anthony Towns");
        System.out.println(NBAPlayers.size() + " players in the list");
        NBAPlayers.add(0,"D'Angelo Russell");
        System.out.println(NBAPlayers);
        NBAPlayers.remove(1);
        while(NBAPlayers.size() > 0){
            System.out.println(NBAPlayers.remove(0));
        }
        System.out.println(NBAPlayers.size() + " players in the list");
    }
}