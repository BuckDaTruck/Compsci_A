package Unit_5.Day_3;

public class cssstudentdata {
    private String name;
    private String test;
    private int score;
    private boolean takenPrinciples;
    private boolean participates;

    public cssstudentdata(String name, String test, int score, boolean takenPrinciples, boolean participates) {
        this.name = name;
        this.test = test;
        this.score = score;
        this.takenPrinciples = takenPrinciples;
        this.participates = participates;
    }

    public String getName() {
        return name;
    }

    public String getTest() {
        return test;
    }

    public int getScore() {
        return score;
    }

    public boolean hasTakenPrinciples() {
        return takenPrinciples;
    }

    public boolean isParticipating() {
        return participates;
    }

    public void Extrapractice() {
        score = score + (100 - score) / 2;
    }

    public void illness() {
        participates = false;
    }

    public String toString() {
        if (participates) {
            return "Name: " + name + " got a " + score + "on the test and they are trying Has taken Principles: "
                    + takenPrinciples + ", Is participating: " + participates;
        } else
            return "Name: " + name + ", Test: " + test + ", Score: " + score + ", Has taken Principles: "
                    + takenPrinciples + ", Is participating: " + participates;
    }
}
