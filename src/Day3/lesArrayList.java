package Day3;

import java.util.ArrayList;

public class lesArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("amine");
        names.add("amine1");
        names.add("amine2");
        names.add("amine3");
        names.add("amine4");
        names.add("589");
        names.add("amine5");
        names.add(6, "amine6");
        //System.out.println(names.isEmpty());
        System.out.println(names);
        names.remove("amine");
        System.out.println(names);
    }
}
