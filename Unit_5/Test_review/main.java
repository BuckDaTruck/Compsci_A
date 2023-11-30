package Unit_5.Test_review;

public class main {
    public static void main(String[] args) {
  
        Player player1 = new Player("Alice", 10, true);
        Player player2 = new Player("Bob", 20);
        Player player3 = new Player("Charlie");

        System.out.println(player1.getUsername());
        System.out.println(player2.getUsername());
        System.out.println(player3.getUsername());
        System.out.println("Number of online players: " + Player.getNumOnline());
        System.out.println("Average user level: " + Player.getAverageUserLevel());
    }
}