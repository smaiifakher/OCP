package Day5.AbstractClass;

public abstract class Animal {
    String spec;
    int age;

    public void eating() {
        System.out.println("I need to eat");
    }

    public abstract void moving();

}
