public class FlyingBird extends Bird {

    @Override
    public void feathers() {
        System.out.println("Flying bird has some flight feathers.");
    }

    @Override
    public void layEggs() {
        System.out.println("Flying bird is laying eggs.");
    }

    @Override
    public String toString() {
        return "This is a flying bird.";
    }
}
