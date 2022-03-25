package Day5.AbstractClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4]; /// structure polymorphe
        animals[0] = new Bird();
        animals[1] = new Fish();
        animals[2] = new Sneak();
        animals[3] = new Cat();

        System.out.println(Arrays.toString(animals));

        for (Animal a : animals) {
            a.moving();
            Test(a);
        }

    }

    public static void Test(Animal animal) {    // methode polymorphe
        animal.moving();
    }
}
