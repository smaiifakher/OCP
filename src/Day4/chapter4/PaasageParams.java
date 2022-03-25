package Day4.chapter4;

import java.util.ArrayList;

import static java.util.Collections.sort;

public class PaasageParams {
    public static void permut(Integer a, Integer b) {
        int aux;
        aux = a;
        a = b;
        b = aux;
    }

    public static void main(String[] args) {
        Integer x = 10;
        Integer b = 9;
        permut(x, b);
        System.out.println(x);
        System.out.println(b);

        StringBuilder stringBuilder = new StringBuilder("oca");
        modifSB(stringBuilder);
        System.out.println(stringBuilder);


        System.out.println(Student.res + " ");
        System.out.println(Student.res + " ");
        new Student();
        new Student();
        System.out.println(Student.res + " ");
    }


    public static final int modifSB(StringBuilder stringBuilder) {
        stringBuilder.append("-ocp");
        return 0;

    }

    public  static double PI = 3.14;

    public static double calcul(double a, double b) {
        return a + b;
    }

    public void method(ArrayList<String> list) {
        sort(list);
    }


}
