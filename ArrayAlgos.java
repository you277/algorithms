public class ArrayAlgos {
    public void printIntArray(int[] ints) {
        for (int i: ints) {
            System.out.print(i + " ");
        }
    }

    public int[] swapIndexes(int[] ints, int i, int v) {
        int old = ints[i];
        ints[i] = ints[v];
        ints[v] = old;
        return ints;
    }

    public int max(int[] nums) {
        int maxNum = nums[0];
        for (int num: nums) {
            if (num > maxNum) maxNum = num;
        }
        return maxNum;
    }

    public int min(int[] nums) {
        int minNum = nums[0];
        for (int num: nums) {
            if (num < minNum) minNum = num;
        }
        return minNum;
    }

    public String shortestString(String[] strs) {
        String shortest = strs[0];
        for (String str: strs) {
            if (str.length() < shortest.length()) shortest = str;
        }
        return shortest;
    }

    public String longestString(String[] strs) {
        String longest = strs[0];
        for (String str: strs) {
            if (str.length() > longest.length()) longest = str;
        }
        return longest;
    }

    public int largestAbsoluteDiff(int[] nums1, int[] nums2) {
        int diff = 0;
        for (int i = 0; i < nums1.length; i++) {
            diff = Math.max(diff, Math.abs(nums1[i] - nums2[i]));
        }
        return diff;
    }

    public int correspondingLargestAbsoluteDiff(int[] nums1, int[] nums2) {
        int diff = 0;
        for (int i = 0; i < nums1.length; i++) {
            diff = Math.max(diff, Math.abs(nums1[i] - nums2[i]));
        }
        return diff;
    }

    public double mean(double[] nums) {
        double sum = 0;
        for (double num: nums) {
            sum += num;
        }
        return sum/nums.length;
    }

    public int[] reverseInts(int[] nums) {
        int length = nums.length;
        int halfLength = length/2;
        for (int i = 0; i < halfLength; i++) {
            int a = nums[i];
            int otherIdx = length - i - 1;
            nums[i] = nums[otherIdx];
            nums[otherIdx] = a;
        }
        return nums;
    }

    public boolean containsConsecutiveEq(int[] nums) {
        int searchLength = nums.length - 1;
        for (int i = 0; i < searchLength; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public int firstNegIdx(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] < 0) return i;
        }
        return -1;
    }

    public boolean containsEqValues(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int v = 0; v < nums.length; v++) {
                if (i != v && nums[i] == nums[v]) return true;
            }
        }
        return false;
    }

    public int longestConsecutiveLength(int[] nums, int targetNum) {
        int longest = 0;
        for (int num: nums) {
            if (num == targetNum) longest++;
            else longest = 0;
        }
        return longest;
    }

    public String lastStr(String[] strs) {
        String last = strs[0];
        for (String str: strs) {
            if (str.compareTo(last) > 0) {
                last = str;
            }
        }
        return last;
    }

    public ArrayAlgos() {
        System.out.println("1: printIntArray");
        System.out.print("> [expected] 1 2 3 [result] ");printIntArray(new int[] {1, 2, 3});System.out.println();
        System.out.print("> [expected] 500 1 2 [result] ");printIntArray(new int[] {500, 1, 2});System.out.println();
        System.out.print("> [expected] [result] ");printIntArray(new int[] {});System.out.println();

        System.out.println("2: swapIndexes");
        System.out.print("> [expected] 1 2 3 4 -> 1 3 2 4 [result] ");printIntArray(swapIndexes(new int[] {1, 2, 3, 4}, 1, 2));System.out.println();
        System.out.print("> [expected] 1 2 3 -> 3 2 1 [result] ");printIntArray(swapIndexes(new int[] {1, 2, 3}, 0, 2));System.out.println();
        System.out.print("> [expected] 9 18 27 36 45 -> 9 36 27 18 45 [result] ");printIntArray(swapIndexes(new int[] {9, 18, 27, 36, 45}, 1, 3));System.out.println();

        System.out.println("3: max");
        System.out.print("> [expected] 3 [result] ");System.out.print(max(new int[] {3, 2, 1}));System.out.println();
        System.out.print("> [expected] 3 [result] ");System.out.print(max(new int[] {1, 3, 2}));System.out.println();
        System.out.print("> [expected] 34 [result] ");System.out.print(max(new int[] {6, 5, 34, 5, 6}));System.out.println();

        System.out.println("4: min");
        System.out.print("> [expected] 1 [result] ");System.out.print(min(new int[] {3, 2, 1}));System.out.println();
        System.out.print("> [expected] 1 [result] ");System.out.print(min(new int[] {1, 3, 2}));System.out.println();
        System.out.print("> [expected] 5 [result] ");System.out.print(min(new int[] {6, 5, 34, 5, 6}));System.out.println();

        System.out.println("5: shortestString");
        System.out.print("> [expected] ! [result] ");System.out.print(shortestString(new String[] {"Hello,", "world", "!"}));System.out.println();
        System.out.print("> [expected] aa [result] ");System.out.print(shortestString(new String[] {"aa", "bb", "cc"}));System.out.println();
        System.out.print("> [expected] no [result] ");System.out.print(shortestString(new String[] {"yes", "no", "ewtgfdhwery"}));System.out.println();

        System.out.println("6: longestString");
        System.out.print("> [expected] Hello, [result] ");System.out.print(longestString(new String[] {"Hello,", "world", "!"}));System.out.println();
        System.out.print("> [expected] aa [result] ");System.out.print(longestString(new String[] {"aa", "bb", "cc"}));System.out.println();
        System.out.print("> [expected] ewtgfdhwery [result] ");System.out.print(longestString(new String[] {"yes", "no", "ewtgfdhwery"}));System.out.println();

        System.out.println("7: correspondingLargestAbsoluteDiff");
        System.out.print("> [expected] 7 [result] ");System.out.print(correspondingLargestAbsoluteDiff(new int[] {2, 3, 4}, new int[] {-1, -2, -3}));System.out.println();
        System.out.print("> [expected] 3 [result] ");System.out.print(correspondingLargestAbsoluteDiff(new int[] {1, 1, 1}, new int[] {1, -2, 3}));System.out.println();
        System.out.print("> [expected] 900 [result] ");System.out.print(correspondingLargestAbsoluteDiff(new int[] {100, 1000, 200}, new int[] {300, 600, -700}));System.out.println();

        System.out.println("8: mean");
        System.out.print("> [expected] 3.5 [expected] ");System.out.print(mean(new double[] {2.0, 3.0, 4.0, 5.0}));System.out.println();
        System.out.print("> [expected] 1.0 [expected] ");System.out.print(mean(new double[] {1, 1, 1}));System.out.println();
        System.out.print("> [expected] 2.0 [expected] ");System.out.print(mean(new double[] {1, 2, 3}));System.out.println();

        System.out.println("9: reverseInts");
        System.out.print("> [expected] 1 2 3 -> 3 2 1 [result] ");printIntArray(reverseInts(new int[] {1, 2, 3}));System.out.println();
        System.out.print("> [expected] 5 -> 5 [result] ");printIntArray(reverseInts(new int[] {5}));System.out.println();
        System.out.print("> [expected] 100 500 234 534 -> 534 234 500 100 [result] ");printIntArray(reverseInts(new int[] {100, 500, 234, 534}));System.out.println();

        System.out.println("10: containsConsecutiveEq");
        System.out.print("> [expected] true [result] ");System.out.print(containsConsecutiveEq(new int[] {1, 2, 3, 3, 4}));System.out.println();
        System.out.print("> [expected] true [result] ");System.out.print(containsConsecutiveEq(new int[] {1, 1, 2, 2, 3, 3}));System.out.println();
        System.out.print("> [expected] false [result] ");System.out.print(containsConsecutiveEq(new int[] {1, 2, 3, 4, 5}));System.out.println();

        System.out.println("11: firstNegIdx");
        System.out.print("> [expected] 2 [result] ");System.out.print(firstNegIdx(new int[] {1, 0, -1}));System.out.println();
        System.out.print("> [expected] 0 [result] ");System.out.print(firstNegIdx(new int[] {-1, 0, -1}));System.out.println();
        System.out.print("> [expected] 6 [result] ");System.out.print(firstNegIdx(new int[] {0, 0, 0, 0, 0, 0, -1, 0, 0, 0}));System.out.println();

        System.out.println("12: containsEqValues");
        System.out.print("> [expected] true [result] ");System.out.print(containsEqValues(new int[] {1, 2, 3, 2}));System.out.println();
        System.out.print("> [expected] true [result] ");System.out.print(containsEqValues(new int[] {-1, 0, -1}));System.out.println();
        System.out.print("> [expected] false [result] ");System.out.print(containsEqValues(new int[] {1, 2, 3, 4, 5}));System.out.println();

        System.out.println("13: longestConsecutiveLength");
        System.out.print("> [expected] 3 [result] ");System.out.print(longestConsecutiveLength(new int[] {1, 2, 1, 1, 1}, 1));System.out.println();
        System.out.print("> [expected] 1 [result] ");System.out.print(longestConsecutiveLength(new int[] {-1, 0, 1}, 1));System.out.println();
        System.out.print("> [expected] 0 [result] ");System.out.print(longestConsecutiveLength(new int[] {1, 2, 3, 1, 5}, 0));System.out.println();

        System.out.println("14: lastStr");
        System.out.print("> [expected] zebra [result] ");System.out.print(lastStr(new String[] {"zebra", "alpha"}));System.out.println();
        System.out.print("> [expected] hi [result] ");System.out.print(lastStr(new String[] {"hi", "guys"}));System.out.println();
        System.out.print("> [expected] us [result] ");System.out.print(lastStr(new String[] {"free", "among", "us"}));System.out.println();
    }
}
