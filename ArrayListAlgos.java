import java.util.ArrayList;
public class ArrayListAlgos {
    public ArrayList<Integer> removeDupes(ArrayList<Integer> nums) {
        ArrayList<Integer> existing = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if (existing.contains(n)) {
                nums.remove(i);
                i--;
            } else {
                existing.add(n);
            }
        }
        return nums;
    }

    public ArrayList<Integer> removeInt(ArrayList<Integer> nums, int num) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == num) {
                nums.remove(i);
                i--;
            }
        }
        return nums;
    }

    public ArrayList<Integer> orderedAdd(ArrayList<Integer> nums, int num) {
        int i = 0;
        while (i < nums.size() && nums.get(i) < num) i++;
        nums.add(i, num);
        return nums;
    }

    public boolean arraysAreReverse(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size() != b.size()) return false;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (a.get(i) != b.get(size - i - 1)) return false;
        }
        return true;
    }

    public int max(ArrayList<Integer> nums) {
        int maximum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int n = nums.get(i);
            if (n > maximum) maximum = n;
        }
        return maximum;
    }

    public int min(ArrayList<Integer> nums) {
        int minimum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int n = nums.get(i);
            if (n < minimum) minimum = n;
        }
        return minimum;
    }

    public String shortestString(ArrayList<String> strings) {
        String shortest = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            String n = strings.get(i);
            if (n.length() < shortest.length()) shortest = n;
        }
        return shortest;
    }

    public String longestString(ArrayList<String> strings) {
        String longest = strings.get(0);
        for (int i = 1; i < strings.size(); i++) {
            String n = strings.get(i);
            if (n.length() > longest.length()) longest = n;
        }
        return longest;
    }

    public int largestAbsoluteDiff(ArrayList<Integer> a, ArrayList<Integer> b) {
        int maxDiff = 0;
        for (int i = 0; i < a.size(); i++) {
            int diff = Math.abs(a.get(i) - b.get(i));
            if (diff > maxDiff) maxDiff = diff;
        }
        return maxDiff;
    }

    public double getMean(ArrayList<Double> nums) {
        double total = 0;
        for (double n: nums) total += n;
        return total/nums.size();
    }

    public ArrayList<Integer> reverse(ArrayList<Integer> nums) {
        ArrayList<Integer> reversed = new ArrayList();
        for (int n: nums)reversed.add(0, n);
        return reversed;
    }

    public boolean containsConsecutiveEqValues(ArrayList<Integer> nums) {
        int prevValue = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            int n = nums.get(i);
            if (n == prevValue) return true;
            prevValue = n;
        }
        return false;
    }

    public int firstNegIdx(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) if (nums.get(i) < 0) return i;
        return -1;
    }

    public boolean containsEqValues(ArrayList<Integer> nums) {
        ArrayList<Integer> existing = new ArrayList();
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if (existing.indexOf(n) != -1) return true;
            existing.add(n);
        }
        return false;
    }

    public ArrayList<Integer> createArrayList(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int n: nums) list.add(n);
        return list;
    }

    public ArrayList<Double> createArrayList(double[] nums) {
        ArrayList<Double> list = new ArrayList<>();
        for (double n: nums) list.add(n);
        return list;
    }

    public ArrayList<String> createArrayList(String[] strs) {
        ArrayList<String> list = new ArrayList<>();
        for (String s: strs) list.add(s);
        return list;
    }

    public ArrayListAlgos() {
        System.out.println("1: removeDupes: ");

        System.out.print("input: [1, 2, 2, 3, 3]; expected: [1, 2, 3]; result: ");
        System.out.println(
                removeDupes(createArrayList(new int[] {1, 2, 2, 3, 3}))
        );

        System.out.print("input: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]; expected: [1, 2, 3, 4, 5]; result: ");
        System.out.println(
                removeDupes(createArrayList(new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4, 5}))
        );

        System.out.print("input: [7, 7, 7]; expected: [7]; result: ");
        System.out.println(
                removeDupes(createArrayList(new int[] {7, 7, 7}))
        );


        System.out.println("2: remoteInt: ");

        System.out.print("input: [1, 2, 2, 3, 3], 2; expected: [1, 3, 3]; result: ");
        System.out.println(
                removeInt(createArrayList(new int[] {1, 2, 2, 3, 3}), 2)
        );

        System.out.print("input: [1, 2, 2, 3, 3], 3; expected: [1, 2, 2]; result: ");
        System.out.println(
                removeInt(createArrayList(new int[] {1, 2, 2, 3, 3}), 3)
        );

        System.out.print("input: [1, 2, 2, 3, 3], 1; expected: [1]; result: ");
        System.out.println(
                removeInt(createArrayList(new int[] {1, 2, 2, 3, 3}), 1)
        );



        System.out.println("3: orderedAdd: ");

        System.out.print("input: [1, 2, 2, 3, 3], 4; expected: [1, 2, 2, 3, 3, 4]; result: ");
        System.out.println(
                orderedAdd(createArrayList(new int[] {1, 2, 2, 3, 3}), 4)
        );

        System.out.print("input: [1, 2, 2, 3, 3], 2; expected: [1, 2, 2, 2, 3, 3]; result: ");
        System.out.println(
                orderedAdd(createArrayList(new int[] {1, 2, 2, 3, 3}), 2)
        );

        System.out.print("input: [1, 2, 2, 3, 3], 1; expected: [1, 1, 2, 2, 3, 3]; result: ");
        System.out.println(orderedAdd(
                createArrayList(new int[] {1, 2, 2, 3, 3}), 1)
        );



        System.out.println("4: arraysAreReverse: ");

        System.out.print("input: [1, 2, 3], [3, 2, 1]; expected: true; result: ");
        System.out.println(
                arraysAreReverse(createArrayList(new int[] {1, 2, 3}), createArrayList(new int[] {3, 2, 1}))
        );

        System.out.print("input: [1, 2, 3], [1, 2, 3]; expected: false; result: ");
        System.out.println(
                arraysAreReverse(createArrayList(new int[] {1, 2, 3}), createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: [1, 2, 3], [3, 2, 1, 1]; expected: false; result: ");
        System.out.println(
                arraysAreReverse(createArrayList(new int[] {1, 2, 3}), createArrayList(new int[] {3, 2, 1, 1}))
        );



        System.out.println("5: max: ");

        System.out.print("input: [1, 2, 3]; expected: 3; result: ");
        System.out.println(
                max(createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: [3, 2, 1]; expected: 3; result: ");
        System.out.println(
                max(createArrayList(new int[] {3, 2, 1}))
        );

        System.out.print("input: [123125435, 5234, 523, 45, 2345]; expected: 123125435; result: ");
        System.out.println(
                max(createArrayList(new int[] {123125435, 5234, 523, 45, 2345}))
        );



        System.out.println("6: min: ");

        System.out.print("input: [1, 2, 3]; expected: 1; result: ");
        System.out.println(
                min(createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: [3, 2, 1]; expected: 1; result: ");
        System.out.println(
                min(createArrayList(new int[] {3, 2, 1}))
        );

        System.out.print("input: [123125435, 5234, 523, 45, 2345]; expected: 45; result: ");
        System.out.println(
                min(createArrayList(new int[] {123125435, 5234, 523, 45, 2345}))
        );



        System.out.println("7: shortestString: ");

        System.out.print("input: [\"Hello\", \"World\", \"!\"]; expected: \"!\"; result: ");
        System.out.println(
                shortestString(createArrayList(new String[] {"Hello", "World", "!"}))
        );

        System.out.print("input: [\"Hello\", \"bro ...\"]; expected: \"Hello\"; result: ");
        System.out.println(
                shortestString(createArrayList(new String[] {"Hello", "bro ..."}))
        );

        System.out.print("input: [\"free\", \"r\"]; expected: \"r\"; result: ");
        System.out.println(
                shortestString(createArrayList(new String[] {"free", "r"}))
        );



        System.out.println("8: longestString: ");

        System.out.print("input: [\"Hello\", \"World\", \"!\"]; expected: \"Hello\"; result: ");
        System.out.println(
                longestString(createArrayList(new String[] {"Hello", "World", "!"}))
        );

        System.out.print("input: [\"Hello\", \"bro ...\"]; expected: \"bro ...\"; result: ");
        System.out.println(
                longestString(createArrayList(new String[] {"Hello", "bro ..."}))
        );

        System.out.print("input: [\"free\", \"r\"]; expected: \"free\"; result: ");
        System.out.println(
                longestString(createArrayList(new String[] {"free", "r"}))
        );



        System.out.println("9: largestAbsoluteDiff: ");

        System.out.print("input: [2, 3, 4], [-1, -2, -3]; expected: 7; result: ");
        System.out.println(
                largestAbsoluteDiff(createArrayList(new int[] {2, 3, 4}), createArrayList(new int[] {-1, -2, -3}))
        );

        System.out.print("input: [2, 3, 4], [1, 2, 3]; expected: 1; result: ");
        System.out.println(
                largestAbsoluteDiff(createArrayList(new int[] {2, 3, 4}), createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: [2, 3, 4], [0, 0, 0]; expected: 3; result: ");
        System.out.println(
                largestAbsoluteDiff(createArrayList(new int[] {2, 3, 4}), createArrayList(new int[] {0, 0, 0}))
        );



        System.out.println("10: getMean: ");

        System.out.print("input: [1.5, 3.5, 5.5]; expected: 3.5; result: ");
        System.out.println(
                getMean(createArrayList(new double[] {1.5, 3.5, 5.5}))
        );

        System.out.print("input: [2.5, 4.5, 6.5]; expected: 4.5; result: ");
        System.out.println(
                getMean(createArrayList(new double[] {2.5, 4.5, 6.5}))
        );

        System.out.print("input: [1, 2, 3, 5, 6, 7, 9, 10, 11]; expected: 6.0; result: ");
        System.out.println(
                getMean(createArrayList(new double[] {1, 2, 3, 5, 6, 7, 9, 10, 11}))
        );



        System.out.println("11: reverse: ");

        System.out.print("input: [1, 2, 3]; expected: [3, 2, 1]; result: ");
        System.out.println(
                reverse(createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: [3, 2, 1]; expected: [1, 2, 3]; result: ");
        System.out.println(
                reverse(createArrayList(new int[] {3, 2, 1}))
        );

        System.out.print("input: [500; expected: [500]; result: ");
        System.out.println(
                reverse(createArrayList(new int[] {500}))
        );


        System.out.println("12: containsConsecutiveEqValues: ");

        System.out.print("input: [1, 2, 3, 3, 4]; expected: true; result: ");
        System.out.println(
                containsConsecutiveEqValues(createArrayList(new int[] {1, 2, 3, 3, 4}))
        );

        System.out.print("input: [1, 2, 3]; expected: false; result: ");
        System.out.println(
                containsConsecutiveEqValues(createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: [1, 1]; expected: true; result: ");
        System.out.println(
                containsConsecutiveEqValues(createArrayList(new int[] {1, 1}))
        );



        System.out.println("13: firstNegIdx: ");

        System.out.print("input: [1, 0, -1]; expected: 2; result: ");
        System.out.println(
                firstNegIdx(createArrayList(new int[] {1, 0, -1}))
        );

        System.out.print("input: [0, -1, 1]; expected: 1; result: ");
        System.out.println(
                firstNegIdx(createArrayList(new int[] {0, -1, 1}))
        );

        System.out.print("input: []; expected: -1; result: ");
        System.out.println(
                firstNegIdx(createArrayList(new int[] {}))
        );



        System.out.println("14: containsEqValues: ");

        System.out.print("input: [1, 2, 3, 2]; expected: true; result: ");
        System.out.println(
                containsEqValues(createArrayList(new int[] {1, 2, 3, 2}))
        );

        System.out.print("input: [1, 2, 3]; expected: false; result: ");
        System.out.println(
                containsEqValues(createArrayList(new int[] {1, 2, 3}))
        );

        System.out.print("input: []; expected: false; result: ");
        System.out.println(
                containsEqValues(createArrayList(new int[] {}))
        );
    }
}
