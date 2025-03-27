package B8;

public class Student {
    private String name;
    private String major;
    private double score;

    public Student( String name,String major, double score) {
        this.major = major;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }


}
