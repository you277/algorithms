import java.util.ArrayList;

public class TwoDArrayAlgos {
    public int numAppearances(String[][] strs, String str) {
        int amount = 0;
        for (String[] row: strs)
            for (String str2: row)
                if (str2.indexOf(str) != -1) amount++;
        return amount;
    }

    public boolean contains(int[][] ints, int n) {
        for (int[] row: ints)
            for (int n2: row)
                if (n == n2) return true;
        return false;
    }

    public int[] getFirstAppearance(int[][] ints, int n) {
        for (int x = 0; x < ints.length; x++)
            for (int y = 0; y < ints[0].length; y++)
                if (ints[x][y] == n) return new int[] {x, y};
        return new int[] {-1, -1};
    }

    public int[] getDiagonal(int[][] ints) {
        int[] diagonal = new int[ints.length];
        for (int i = 0; i < ints.length; i++)
            diagonal[i] = ints[i][i];
        return diagonal;
    }

    public String getColumnString(String[][] strs, int column) {
        String s = strs[0][column];
        for (int i = 1; i < strs.length; i++)
            s += " " + strs[i][column];
        return s;
    }

    public int max(int[][] ints) {
        int maxValue = ints[0][0];
        for (int[] row: ints)
            for (int n: row)
                if (n > maxValue) maxValue = n;
        return maxValue;
    }

    public int min(int[][] ints) {
        int minValue = ints[0][0];
        for (int[] row: ints)
            for (int n: row)
                if (n < minValue) minValue = n;
        return minValue;
    }

    public String shortest(String[][] strs) {
        String minValue = strs[0][0];
        for (String[] row: strs)
            for (String str: row)
                if (str.length() < minValue.length()) minValue = str;
        return minValue;
    }

    public String longest(String[][] strs) {
        String maxValue = strs[0][0];
        for (String[] row: strs)
            for (String str: row)
                if (str.length() > maxValue.length()) maxValue = str;
        return maxValue;
    }

    public int largestCorrespondingAbsoluteDifference(int[][] ints1, int[][] ints2) {
        int maxDiff = Integer.MIN_VALUE;
        for (int x = 0; x < ints1.length; x++) {
            for (int y = 0; y < ints1[0].length; y++) {
                int diff = Math.abs(ints1[x][y] - ints2[x][y]);
                if (diff > maxDiff) maxDiff = diff;
            }
        }
        return maxDiff;
    }

    public double mean(double[][] nums) {
        double total = 0;
        int numElements = 0;
        for (double[] row: nums) {
            for (double n: row) {
                total += n;
                numElements++;
            }
        }
        return total/numElements;
    }

    public boolean containsEqValues(int[][] nums) {
        ArrayList<Integer> passedValues = new ArrayList<>();
        for (int[] row: nums) {
            for (int n: row) {
                if (passedValues.contains(n)) return true;
                passedValues.add(n);
            }
        }
        return false;
    }

    public String lastStr(String[][] strs) {
        String currentLast = strs[0][0];
        for (String[] row: strs) {
            for (String str: row) {
                if (str.compareTo(currentLast) > 0) currentLast = str;
            }
        }
        return currentLast;
    }

    // make the test cases look less horrible

    public String printArray() {
        return "hi";
    }

    public void pln() {System.out.println();}
    public void pln(String s) {System.out.println(s);}
    public void pln(int s) {System.out.println(s);}
    public void pln(double s) {System.out.println(s);}
    public void pln(boolean s) {System.out.println(s);}
    public void pln(int[] s) {
        System.out.print("[" + s[0]);
        for (int i = 1; i < s.length; i++)
            System.out.print(", " + s[i]);
        System.out.println("]");
    }

    public TwoDArrayAlgos() {
        // reused test cases
        String[][] stringArr = {{"Hello,", "world", "!"}, {"It's", "me", "Margaret"}};
        String[][] stringArr2 = {{"hi", "among"}, {"guys", "us"}, {"here", "wth"}};
        String[][] stringArr3 = {{"fghetfh", "sdfgsdf"}, {"yes", "yes"}, {"no", "yes"}};
        String[][] stringArr4 = {{"Hello,", "world", "!"}, {"It's", "me", "Genevieve"}};
        int[][] intArr = {{3, 2, 1}, {4, 5, 6}};
        int[][] intArr2 = {{1, 2}, {3, 4}};

        pln("1: numAppearances");
        pln(numAppearances(stringArr4, "e"));
        pln(numAppearances(stringArr2, "a"));
        pln(numAppearances(stringArr3, "d"));
        pln();

        pln("2: contains");
        pln(contains(intArr2, 5));
        pln(contains(intArr, 3));
        pln(contains(new int[][] {{2}, {1}}, 20));
        pln();

        pln("3: getFirstAppearance");
        pln(getFirstAppearance(intArr2, 5));
        pln(getFirstAppearance(intArr, 3));
        pln(getFirstAppearance(new int[][] {{2, 4, 5, 9}, {1, 6, 7, 8}}, 7));
        pln();

        pln("4: getDiagonal");
        pln(getDiagonal(intArr2));
        pln(getDiagonal(intArr));
        pln(getDiagonal(new int[][] {{2, 4, 5, 9}, {1, 6, 7, 8}, {1, 6, 7, 8}}));
        pln();

        pln("5: getColumnString");
        pln(getColumnString(stringArr, 1));
        pln(getColumnString(stringArr4, 2));
        pln(getColumnString(new String[][] {{"hello", "no"}, {"everybody", "ur"}, {"my", "not"}, {"name", "stop"}, {"is", "capping"}, {"markiplier", "already"}}, 0));
        pln();

        pln("6: max");
        pln(max(intArr));
        pln(max(intArr2));
        pln(max(new int[][] {{2, 5, 6, 8}, {5, 6, 7, 8}, {2, 5, 7, 9}, {6, 7, 8, 9}}));
        pln();

        pln("7: min");
        pln(min(intArr));
        pln(min(intArr2));
        pln(min(new int[][] {{2, 5, 6, 8}, {5, 6, 7, 8}, {2, 5, 7, 9}, {6, 7, 8, 9}}));
        pln();

        pln("8: longest");
        pln(longest(stringArr));
        pln(longest(stringArr2));
        pln(longest(stringArr3));
        pln();

        pln("9: shortest");
        pln(shortest(stringArr));
        pln(shortest(stringArr2));
        pln(shortest(stringArr3));
        pln();

        pln("10: largestCorrespondingAbsoluteDifference");
        pln(largestCorrespondingAbsoluteDifference(new int[][] {{1, 2}, {3, 4}}, new int[][] {{-1, -2}, {-3, -4}}));
        pln(largestCorrespondingAbsoluteDifference(new int[][] {{1, 2}, {3, 4}}, new int[][] {{0, 0}, {-3, 0}}));
        pln(largestCorrespondingAbsoluteDifference(new int[][] {{1, 2, 5, 6, 9, 10}, {3, 4, 7, 8, 11, 12}, {7, 5, 6, 7, 2, 5}}, new int[][] {{12, 11, 10, 9, 8, 7}, {6, 5, 4, 3, 2, 1}, {0, -1, -2, -3, -4, -5}}));
        pln();

        pln("11: mean");
        pln(mean(new double[][] {{1.0, 1.1, 1.2, 1.3, 1.4}, {2.1, 2.2, 2.3, 2.4, 2.5}}));
        pln(mean(new double[][] {{0.0, 0.0, 0.0, 0.0}, {1.0, 1.2, 1.3, 1.4}}));
        pln(mean(new double[][] {{1.0}, {3.0}}));
        pln();

        pln("12: containsEqValues");
        pln(containsEqValues(intArr));
        pln(containsEqValues(intArr2));
        pln(containsEqValues(new int[][] {{1, 2}, {3, 4}}));
        pln();

        pln("13: lastStr");
        pln(lastStr(stringArr));
        pln(lastStr(stringArr2));
        pln(lastStr(stringArr3));
        pln();
    }
}
