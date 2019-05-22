import java.util.*;

class MysterySort {
    public static void main(String[] args) {
        MysterySort m = new MysterySort();
        Integer[] arr = { 2, 4, 1, 5, 3, 7, 6 };
        List<Integer> unsorted = Arrays.asList(arr);
        List<Integer> sorted = m.mysteryAlgorithmOne(unsorted);
        System.out.println(Arrays.toString(sorted.toArray()));
    }

    private List<Integer> mysteryAlgorithmOne(List<Integer> a) {
        List<Integer> b = Arrays.asList(new Integer[a.size()]);
        for (Integer x : a) {
            for (int i = 0; i < b.size(); i++) {
                if (b.get(i) == null || b.get(i) > x) {
                    int j = b.size() - 1;
                    while (j > i) {
                        b.set(j, b.get(j - 1));
                        j -= 1;
                    }
                    b.set(i, x);
                    break;
                }
            }
        }
        return b;
    }
}