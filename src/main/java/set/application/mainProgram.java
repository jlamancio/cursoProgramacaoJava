package set.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class mainProgram {
    public static void main(String[] args) {
     //   Set<String> set = new HashSet<>();
     //   Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");
      //  set.removeIf(x -> x.length() >= 3);
        set.removeIf((x -> x.charAt(0) == 'T'));
        System.out.println();

    //    System.out.println(set.remove("Notebook"));
        System.out.println(set.contains("Notebook"));
        System.out.println();
        for (String p : set) {
            System.out.println(p);
        }
    }
}
