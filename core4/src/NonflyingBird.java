public class NonflyingBird extends Bird {
    @Override
    public void feathers() {
        System.out.println("Nonflying bird has no flight feathers.");
    }

    @Override
    public void layEggs() {
        System.out.println("Nonflying bird is laying eggs.");
    }

    @Override
    public String toString() {
        return "This is a nonflying bird.";
    }
}
