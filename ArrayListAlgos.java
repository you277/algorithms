import java.util.ArrayList;
public class ArrayListAlgos {
    public ArrayList<Integer> removeDupes(ArrayList<Integer> nums) {
        ArrayList<Integer> existing = new ArrayList();
        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);
            if (existing.indexOf(n) != -1) {
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

    public ArrayList<Integer> add(ArrayList<Integer> nums, int num) {
        nums.add(num);
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
        int total = 0;
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


    public ArrayListAlgos() {
        ArrayList<Integer> arr1 = new ArrayList();
        arr1.add(1);arr1.add(2);arr1.add(2);arr1.add(3);arr1.add(3);

        ArrayList<Integer> arr2 = new ArrayList();
        arr1.add(1);arr1.add(2);arr1.add(3);arr1.add(4);arr1.add(5);arr1.add(1);arr1.add(2);arr1.add(3);arr1.add(4);arr1.add(5);

        ArrayList<Integer> arr3 = new ArrayList();
        arr1.add(7);arr1.add(7);arr1.add(7);

        System.out.println("removeDupes: ");
        System.out.print("input: [1, 2, 2, 3, 3]; expected: [1, 2, 3]; result: ");System.out.println(removeDupes(arr1));
        System.out.print("input: [1, 2, 3, 4, 5, 1, 2, 3, 4, 5]; expected: [1, 2, 3, 4, 5]; result: ");System.out.println(removeDupes(arr2));
        System.out.print("input: [7, 7, 7]; expected: []; result: ");System.out.println(removeDupes(arr3));
    }
}
