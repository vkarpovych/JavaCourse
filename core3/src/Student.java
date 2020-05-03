import java.sql.Struct;

public class Student {
    private String name;
    private int rating;

    String getName() {
        return name;
    }

    void setName(String name) {
        name = this.name;
    }

    Integer getRating() {
        return rating;
    }

    void setRating(Integer rating) {
        rating = this.rating;
    }

    public Student() {
        name = "";
        rating = 0;
    }

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public boolean betterStudent(Student s) {
        return this.getRating() > s.getRating();
    }

    public String toString() {
        System.out.println("Name: " + name + ". Rating: " + rating);
        return null;
    }

    public void changeRating(int newRating) {
        rating = newRating;
    }
}
