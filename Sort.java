import java.util.ArrayList;

public class Sort {
    public static String[] stringSelectionSort(String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            String me = strs[i];
            String min = me;
            int lowestIdx = i;
            for (int v = i + 1; v < strs.length; v++) {
                String maybeMin = strs[v];
                if (maybeMin.toLowerCase().compareTo(min.toLowerCase()) < 0) {
                    min = maybeMin;
                    lowestIdx = v;
                }
            }
            strs[i] = min;
            strs[lowestIdx] = me;
        }
        return strs;
    }

    public static ArrayList<String> stringSelectionSort(ArrayList<String> strs) {
        for (int i = 0; i < strs.size() - 1; i++) {
            String me = strs.get(i);
            String min = me;
            int lowestIdx = i;
            for (int v = i + 1; v < strs.size(); v++) {
                String maybeMin = strs.get(v);
                if (maybeMin.toLowerCase().compareTo(min.toLowerCase()) < 0) {
                    min = maybeMin;
                    lowestIdx = v;
                }
            }
            strs.set(i, min);
            strs.set(lowestIdx, me);
        }
        return strs;
    }

    public static String[] stringInsertionSort(String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            int v = i;
            while (v > 0) {
                String s1 = strs[v];
                String s2 = strs[v - 1];
                strs[v - 1] = s1;
                strs[v] = s2;
                v--;
                if (s1.toLowerCase().compareTo(s2.toLowerCase()) < 0) break;
            }
        }
        return strs;
    }

    public static ArrayList<String> stringInsertionSort(ArrayList<String> strs) {
        for (int i = 0; i < strs.size(); i++) {
            int v = i;
            while (v > 0) {
                String s1 = strs.get(v);
                String s2 = strs.get(v - 1);
                strs.set(v - 1, s1);
                strs.set(v, s2);
                v--;
                if (s2.toLowerCase().compareTo(s1.toLowerCase()) < 0) break;
            }
        }
        return strs;
    }

    public static int[] intSelectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int me = nums[i];
            int min = me;
            int lowestIdx = i;
            for (int v = i + 1; v < nums.length; v++) {
                int maybeMin = nums[v];
                if (maybeMin < min) {
                    min = maybeMin;
                    lowestIdx = v;
                }
            }
            nums[i] = min;
            nums[lowestIdx] = me;
        }
        return nums;
    }

    public static int[] intInsertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int v = i;
            while (v > 0) {
                int n1 = nums[v];
                int n2 = nums[v - 1];
                nums[v - 1] = n1;
                nums[v] = n2;
                v--;
                if (n2 < n1) break;
            }
        }
        return nums;
    }

    public Sort() {
        for (String s: stringSelectionSort(new String[] {"Zebra", "alpha"})) System.out.print(s + " ");
        System.out.println();
        for (String s: stringSelectionSort(new String[] {"among", "us", "sus"})) System.out.print(s + " ");
        System.out.println();
        for (String s: stringSelectionSort(new String[] {"A", "c", "D", "e", "f", "C", "B", "b"})) System.out.print(s + " ");
        System.out.println();
        System.out.println();

        for (String s: stringInsertionSort(new String[] {"Zebra", "alpha"})) System.out.print(s + " ");
        System.out.println();
        for (String s: stringInsertionSort(new String[] {"among", "us", "SUS"})) System.out.print(s + " ");
        System.out.println();
        for (String s: stringInsertionSort(new String[] {"A", "c", "D", "e", "f", "C", "B", "b"})) System.out.print(s + " ");
        System.out.println();
        System.out.println();

        ArrayList<String> strs1 = new ArrayList();
        strs1.add("Zebra");strs1.add("alpha");

        ArrayList<String> strs12 = new ArrayList();
        strs12.add("among");strs12.add("us");strs12.add("sus");

        ArrayList<String> strs13 = new ArrayList();
        strs13.add("A");strs13.add("c");strs13.add("D");strs13.add("e");strs13.add("f");strs13.add("C");strs13.add("B");strs13.add("b");

        for (String s: stringSelectionSort(strs1)) System.out.print(s + " ");
        System.out.println();
        for (String s: stringSelectionSort(strs12)) System.out.print(s + " ");
        System.out.println();
        for (String s: stringSelectionSort(strs13)) System.out.print(s + " ");
        System.out.println();
        System.out.println();

        ArrayList<String> strs2 = new ArrayList();
        strs2.add("Zebra");strs2.add("alpha");

        ArrayList<String> strs22 = new ArrayList();
        strs22.add("among");strs22.add("us");strs22.add("sus");

        ArrayList<String> strs23 = new ArrayList();
        strs23.add("A");strs23.add("c");strs23.add("D");strs23.add("e");strs23.add("f");strs23.add("C");strs23.add("B");strs23.add("b");

        for (String s: stringInsertionSort(strs2)) System.out.print(s + " ");
        System.out.println();
        for (String s: stringInsertionSort(strs22)) System.out.print(s + " ");
        System.out.println();
        for (String s: stringInsertionSort(strs23)) System.out.print(s + " ");
        System.out.println();
        System.out.println();

        for (int n: intSelectionSort(new int[] {1, 0, -1})) System.out.print(n + " ");
        System.out.println();
        for (int n: intSelectionSort(new int[] {9, 2, 45, 4, 5})) System.out.print(n + " ");
        System.out.println();
        for (int n: intSelectionSort(new int[] {2147483647, 256, 65535})) System.out.print(n + " ");
        System.out.println();
        System.out.println();

        for (int n: intInsertionSort(new int[] {1, 0, -1})) System.out.print(n + " ");
        System.out.println();
        for (int n: intInsertionSort(new int[] {9, 2, 45, 4, 5})) System.out.print(n + " ");
        System.out.println();
        for (int n: intInsertionSort(new int[] {2147483647, 256, 65535})) System.out.print(n + " ");
        System.out.println();
        System.out.println();
    }
}