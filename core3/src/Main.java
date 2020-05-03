public class Main {
    public static void main(String[] args) {
        Student first = new Student();
        first.setName("Emma");
        first.setRating(13);

        Student second = new Student("Tyler", 100);

        Student third = new Student("Tyson", 56);

        averageRating(first, second, third);
        second.changeRating(1);
        averageRating(first, second, third);
    }

    public static void averageRating(Student... students) {
        int total = 0;
        for (Student s : students
        ) {
            total += s.getRating();
        }
        double average = (double) total / students.length;
        System.out.println("Average rating: " + average);
    }
}
