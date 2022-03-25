package Day5;

public class Bird extends Animal {
    String string = "Bird";

    public Bird() {
        System.out.println("construct of Bird");
    }

    public void info() {
        System.out.println(this.string + " " + super.string);
    }

    @Override
    protected void Affichage() {
        System.out.println("aff. of bird");
    }
}
