package Day3;

import java.util.Arrays;
import java.util.Comparator;

public class Chapter3 {
    public static void main(String[] args) {
//        int tab[] = {84, 47, 69, 32, 41, 58, 96};
//
//        for (int tab1 : tab) {
//            System.out.print(tab1 + "\t");
//        }
//        System.out.println();
//        Arrays.sort(tab);
//
//        for (int tab1 : tab) {
//            System.out.print(tab1 + "\t");
//        }
//        System.out.println("*****************************");
        Student s1 = new Student("fakher", 78);

        Student s2 = new Student("omar", 20);
        Student s3 = new Student("smaii", 15);

        Student[] students = new Student[3];

        for (Student student : students) {
            student = s1;
            System.out.print(student + "\t");
        }

///////////////////////////////////////////////////////////////

//        Comparator<Student> cmp = (Student a, Student b) -> {
//            return b.nom.compareTo(a.nom);
//        };
//
//        Arrays.sort(students, cmp);
//        System.out.print(Arrays.toString(students));


        int tab[] = {84, 47, 69, 32, 41, 58, 96};
        int tab2[] = new int[4];
        tab = tab2;
        for (int x : tab2) {
            System.out.println(x + ":");

        }


    }
}
