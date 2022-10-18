package mirea.ru.lazarev_pavel.kvbo0121.pr10;

public class Student {

    private int finalScore;
    private String firstName;
    private String lastName;

    private int grade;
    private String group;

    public Student(int finalScore, String firstName, String lastName, int grade, String group) {
        this.finalScore = finalScore;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.group = group;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }
}
