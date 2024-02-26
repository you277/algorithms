import java.util.ArrayList;

public class SearchAlgos {
    public int numLessThanZero(ArrayList<Integer> nums) {
        int amount = 0;
        for (int n: nums)
            if (n < 0) amount++;
        return amount;
    }

    public boolean stringIsInList(ArrayList<String> strs, String str) {
        for (String str2: strs)
            if (str.equals(str2)) return true;
        return false;
    }

    public boolean listsHaveSameValues(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int n1: list1)
            for (int n2: list2)
                if (n1 == n2) return true;
        return false;
    }

    public int index(ArrayList<Integer> nums, int num) {
        for (int i = 0; i < nums.size(); i++)
            if (nums.get(i) == num) return i;
        return -1;
    }

    public int index(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == num) return i;
        return -1;
    }

    private ArrayList<Integer> createArrayList(int[] nums) {
        ArrayList<Integer> yes = new ArrayList<>();
        for (int n: nums) yes.add(n);
        return  yes;
    }

    private ArrayList<String> createArrayList(String[] strs) {
        ArrayList<String> yes = new ArrayList<>();
        for (String str: strs) yes.add(str);
        return  yes;
    }

    public SearchAlgos() {
        System.out.println("1: numLessThanZero");
        System.out.print("input: [-1, 0, 1]; expected: 1; result: ");System.out.println(numLessThanZero(createArrayList(new int[] {-1, 0, 0})));
        System.out.print("input: [-1, -2, 1]; expected: 2; result: ");System.out.println(numLessThanZero(createArrayList(new int[] {-1, -2, 0})));
        System.out.print("input: [2, 0, 1]; expected: 0; result: ");System.out.println(numLessThanZero(createArrayList(new int[] {-1, 0, 0})));

        System.out.println("2: stringIsInList");
        System.out.print("input: [\"String\"], \"string\"; expected: false; result: ");System.out.println(stringIsInList(createArrayList(new String[] {"String"}), "string"));
        System.out.print("input: [\"string\"], \"string\"; expected: true; result: ");System.out.println(stringIsInList(createArrayList(new String[] {"string"}), "string"));
        System.out.print("input: [\"among\", \"us\", \"sus\"], \"sus\"; expected: true; result: ");System.out.println(stringIsInList(createArrayList(new String[] {"among", "us", "sus"}), "sus"));

        System.out.println("3: listsHaveSameValues");
        System.out.print("input: [1, 2], [2, 3]; expected: true; result: ");System.out.println(
                listsHaveSameValues(createArrayList(new int[] {1, 2}), createArrayList(new int[] {2, 3}))
        );
        System.out.print("input: [1, 2], [3, 4]; expected: false; result: ");System.out.println(
                listsHaveSameValues(createArrayList(new int[] {1, 2}), createArrayList(new int[] {3, 4}))
        );
        System.out.print("input: [], []; expected: false; result: ");System.out.println(
                listsHaveSameValues(createArrayList(new int[] {}), createArrayList(new int[] {}))
        );

        System.out.println("4: index (ArrayList ver)");
        System.out.print("input: [1, 2, 3], 2; expected: 1; result: ");System.out.println(
                index(createArrayList(new int[] {1, 2, 3}), 2)
        );
        System.out.print("input: [3, 1, 2], 2; expected: 2; result: ");System.out.println(
                index(createArrayList(new int[] {3, 1, 2}), 2)
        );
        System.out.print("input: [1, 2, 3], 5; expected: -1; result: ");System.out.println(
                index(createArrayList(new int[] {1, 2, 3}), 5)
        );

        System.out.println("4: index (array ver)");
        System.out.print("input: [1, 2, 3], 2; expected: 1; result: ");System.out.println(
                index(new int[] {1, 2, 3}, 2)
        );
        System.out.print("input: [3, 1, 2], 2; expected: 2; result: ");System.out.println(
                index(new int[] {3, 1, 2}, 2)
        );
        System.out.print("input: [1, 2, 3], 5; expected: -1; result: ");System.out.println(
                index(new int[] {1, 2, 3}, 5)
        );
    }
}
