package Day4.chapter4;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPrediction {
    public static void main(String[] args) {
        Prediction p = (String s) -> {
            return s.length() > 6;

        };

        Prediction prediction = string -> string.contains("anything");

        String ch = "fakher";
        System.out.println(p.test(ch));
        System.out.println(prediction.test(ch));

        Predicate<String> predicate = string -> string.contains("a");
        ArrayList<String> names = new ArrayList<>();
        names.add("rtjjjjjz");
        names.add("ehbjhgjhgf");
        names.add("ratddz");
        names.add("vfv");
        names.add("ede");
        names.add("efef");

        names.removeIf(predicate);
        System.out.println(names);
    }
}
