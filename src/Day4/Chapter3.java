package Day4;

import Day4.chapter4.PaasageParams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Day4.chapter4.PaasageParams.*;

public class Chapter3 {
    public static void main(String[] args) {
//        ArrayList<Byte> myList = new ArrayList<>();
//        myList.add((byte) 0);
//        myList.add((byte) 47);
//        myList.add((byte) 7);
//        myList.add((byte) 6859);
//        System.out.println(myList);
        String note = "147.85";
        double not = Double.parseDouble(note);
        Double test = Double.valueOf(note);
        System.out.println(not);
        System.out.println(test);

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        System.out.println(myList); // Auto boxing
        int x = myList.get(0);      // Unboxing
        System.out.println(x);

//        List<String> list = new ArrayList<>();
//        list.add("rghrg");
//        list.add("rghrgef");
//        String[] objectArray = (String[]) list.toArray();
//        System.out.println(objectArray);


        // Conversion d'un tableau vers liste

        String[] array = {"hawk ", "srgr", String.valueOf(785)};
        List<String> names = Arrays.asList(array);
        System.out.println(names);
        names.set(0, "java");
        System.out.println(names);
        System.out.println(Arrays.toString(array));
        names.add("ocp");



        System.out.println(calcul(14,58));

    }
}
