package HW6_22_11.Collection.Homework;

import java.util.*;

public class UnionIntersect {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();
        set1.add("Mama");
        set1.add("Mila");
        set1.add("Ramu");

        Set<String> set2 = new HashSet<String>();
        set2.add("Ivan");
        set2.add("Petro");
        set2.add("Ilya");

        Set<String> setUnite = mergeSet(set1, set2);
        System.out.println(setUnite);

        List<Set<String>> splitSets = split(setUnite, 2);
        Set<String> first = splitSets.get(0);
        System.out.println(splitSets);
    }
    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b) {

        return new HashSet<T>() {
            {
                addAll(a);
                addAll(b);
            }
        };
    }
    public static <T> List<Set<T>> split(Set<String> original, int count) {

        ArrayList<Set<T>> result = new ArrayList<Set<T>>(count);
        Iterator<String> it = original.iterator();
        int each = original.size() / count;

        for (int i = 0; i < count; i++) {
            HashSet<T> s = new HashSet<T>(original.size() / count + 1);
            result.add(s);
            for (int j = 0; j < each && it.hasNext(); j++) {
                s.add((T) it.next());
            }
        }
        return result;
    }
}


