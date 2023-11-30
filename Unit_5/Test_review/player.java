package Unit_5.Test_review;

public class Player {
    private String username;
    private int level;
    private boolean isOnline;
    private static int numOnline;
    private static int totalLevels;
    private static double averageUserLevel;

    public Player(String username, int level, boolean isOnline) {
        this.username = username;
        this.level = level;
        this.isOnline = isOnline;
        if (isOnline) {
            numOnline++;
        }
        totalLevels += level;
        calculateAverage();
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
        this.isOnline = false;
        totalLevels += level;
        calculateAverage();
    }

    public Player(String username) {
        this.username = username;
        this.level = 0;
        calculateAverage();
    }

    private static void calculateAverage() {
        if (numOnline > 0) {
            averageUserLevel = (double) totalLevels / numOnline;
        }
    }



    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public static int getNumOnline() {
        return numOnline;
    }

    public static int getTotalLeves() {
        return totalLevels;
    }

    public static double getAverageUserLevel() {
        return averageUserLevel;
    }

    public void levelUp(int level) {
        this.level += level;
        totalLevels += level;
        averageUserLevel = totalLevels / numOnline;
    }

    public void logOn() {
        if (!isOnline) {
            isOnline = true;
            numOnline++;
        }
    }

    public void logOff() {
        if (isOnline) {
            isOnline = false;
            numOnline--;
        }
    }
}