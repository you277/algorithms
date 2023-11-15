public class ArrayAlgos {
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
        int n1 = min(nums1);
        int n2 = max(nums1);
        int n3 = min(nums2);
        int n4 = max(nums2);
        int diff1 = Math.abs(n4 - n1);
        int diff2 = Math.abs(n2 - n3);
        if (diff1 > diff2) return diff1;
        return diff2;
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
        for (int i = 0; i< halfLength; i++) {
            int a = nums[i];
            int otherIdx = length - i;
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
        for (int num: nums) {
            for (int otherNum: nums) {
                if (num == otherNum) return true;
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
        int[] nums = {1, 2, 3, 10, 23, 34252345, 656, 2147483, 23, 23, 23};
        int[] nums2 = {6456,5,7,657,345,7,34,573,46,2,573463,456,34,56,34,57,4765,657};
        System.out.println("1: max");
        System.out.print("| ");System.out.println(max(nums));
        System.out.print("| ");System.out.println(max(nums2));

        System.out.println("2: min");
        System.out.print("| ");System.out.println(min(nums));
        System.out.print("| ");System.out.println(min(nums2));

        String[] strs = {"hello", "everybody", "my", "name", "is", "markiplier"};
        String[] strs2 = {"and", "today", "we", "will", "be", "playing", "this", "fabulous", "motion", "picture", "game"};
        System.out.println("3: shortestString");
        System.out.print("| ");System.out.println(shortestString(strs));
        System.out.print("| ");System.out.println(shortestString(strs2));

        System.out.println("4: longestString");
        System.out.print("| ");System.out.println(longestString(strs));
        System.out.print("| ");System.out.println(longestString(strs2));

        int[] nums3 = {34,56,45,6345,7,658,6,7,87685};
        int[] nums4 = {1, 20, 3, 40, 5, 60, 7, 80, 9, 0};
        System.out.println("5: largestAbsoluteDiff");
        System.out.print("| ");System.out.println(largestAbsoluteDiff(nums, nums2));
        System.out.print("| ");System.out.println(largestAbsoluteDiff(nums3, nums4));

        double[] doubles1 = {1.2, 1.3, 235.5, 12.5, 12.3, 32.8, 42.6};
        double[] doubles2 = {6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1};
        System.out.println("6: mean");
        System.out.print("| ");System.out.println(mean(doubles1));
        System.out.print("| ");System.out.println(mean(doubles2));

        System.out.println("7: reverseInts");
        System.out.print("| ");System.out.println(reverseInts(nums));
        System.out.print("| ");System.out.println(reverseInts(nums2));

        System.out.println("8: containsConsecutiveEq");
        System.out.print("| ");System.out.println(containsConsecutiveEq(nums));
        System.out.print("| ");System.out.println(containsConsecutiveEq(nums2));

        System.out.println("1: contains");
        System.out.print("| ");System.out.println(contains("hello", "hell"));
        System.out.print("| ");System.out.println(contains("dfgsdfherg", "yes"));

        System.out.println("1: contains");
        System.out.print("| ");System.out.println(contains("hello", "hell"));
        System.out.print("| ");System.out.println(contains("dfgsdfherg", "yes"));

        System.out.println("1: contains");
        System.out.print("| ");System.out.println(contains("hello", "hell"));
        System.out.print("| ");System.out.println(contains("dfgsdfherg", "yes"));

        System.out.println("1: contains");
        System.out.print("| ");System.out.println(contains("hello", "hell"));
        System.out.print("| ");System.out.println(contains("dfgsdfherg", "yes"));

    }
}
