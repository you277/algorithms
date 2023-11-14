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
}
