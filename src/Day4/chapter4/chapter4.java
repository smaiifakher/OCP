package Day4.chapter4;

import java.util.Arrays;

public class chapter4 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.prenom = "fakher";
//        student.info();
//        String nom = student.nom;

    }

    public static void somme(int x, int y) {
        System.out.println(x + y);
    }

    public static void somme(short x, short y) {
        System.out.println(x + y);
    }

    public static void somme(double x, double y) {
        System.out.println(x + y);
    }

    public static void somme(Integer x, Integer y) {
        System.out.println(x + y);
    }

    public static void somme(int... x) {
        System.out.println(Arrays.toString(x));
    }
}
