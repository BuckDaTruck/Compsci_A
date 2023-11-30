package Unit_5.Day_2;

public class Teacher {
        private String subject;
    private String grade;
    private boolean likesit;
    private boolean hasPHD;
}



    public Teacher(String name, int grade, int gradeLevel, boolean hasPHD) {
        this.name = name;
        this.grade = grade;
        this.gradeLevel = gradeLevel;
        this.hasPHD = hasPHD;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getGradeLevel() {
     
    }

    public boolean hasPHD() {
    
    }

    public String toString() {
        return "Name: " + name + ", Grade: " + grade + ", Grade Level: " + gradeLevel + ", Has taken CS: " + hasPHD;
    }
}
