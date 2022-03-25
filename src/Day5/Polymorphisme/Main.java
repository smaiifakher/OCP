package Day5.Polymorphisme;

public class Main {
    public static void main(String[] args) {
        Animel animel = new Animel();
        Bird bird = new Bird();

        animel = bird;
        bird = (Bird) animel;
    }
}
