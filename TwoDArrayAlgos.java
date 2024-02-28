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

    public void p(String s) {System.out.print(s);}
    public void p(int s) {System.out.print(s);}
    public void p(boolean s) {System.out.print(s);}
    public void p(int[] s) {
        System.out.print("[" + s[0]);
        for (int i = 1; i < s.length; i++)
            System.out.print(", " + s[i]);
        System.out.print("]");
    }
    public void pln(String s) {System.out.println(s);}
    public void pln(int s) {System.out.println(s);}
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
        p("| [[Hello, world, !], [It's, me, Genevieve]], e -> 3 | result: ");pln(numAppearances(stringArr4, "e"));
        p("| [[hi, among], [guys, us], [here, wth]], e -> 1 | result: ");pln(numAppearances(stringArr2, "a"));
        p("| [[fghetfh, sdfgsdf], [yes, yes], [no, yes]], e -> 1 | result: ");pln(numAppearances(stringArr3, "d"));

        pln("2: contains");
        p("| [[1, 2], [3, 4]], 5 -> false | result: ");pln(contains(intArr2, 5));
        p("| [[3, 2, 1], [4, 5, 6]], 3 -> true | result: ");pln(contains(intArr, 3));
        p("| [[2], [1]], 20 -> false | result: ");pln(contains(new int[][] {{2}, {1}}, 20));

        pln("3: getFirstAppearance");
        p("| [[1, 2], [3, 4]], 5 -> [-1, -1] | result: ");pln(getFirstAppearance(intArr2, 5));
        p("| [[3, 2, 1], [4, 5, 6]], 3 -> [0, 0] | result: ");pln(getFirstAppearance(intArr, 3));
        p("| [[2, 4, 5, 9], [1, 6, 7, 8]], 7 -> [1, 2] | result: ");pln(getFirstAppearance(new int[][] {{2, 4, 5, 9}, {1, 6, 7, 8}}, 7));

        pln("4: getDiagonal");
        p("| [[1, 2], [3, 4]] -> [1, 4] | result: ");pln(getDiagonal(intArr2));
        p("| [[3, 2, 1], [4, 5, 6]] -> [3, 5] | result: ");pln(getDiagonal(intArr));
        p("| [[2, 4, 5, 9], [1, 6, 7, 8], [1, 6, 7, 8]] -> [2, 6, 7] | result: ");pln(getDiagonal(new int[][] {{2, 4, 5, 9}, {1, 6, 7, 8}, {1, 6, 7, 8}}));

        pln("5: getColumnString");
        p("| [[Hello, world, !], [It's, me, Margaret]] -> world me | result: ");pln(getColumnString(stringArr, 1));
        p("| [[Hello, world, !], [It's, me, Genevieve]] -> ! Genevieve | result: ");pln(getColumnString(stringArr4, 2));
        p("| [[hello, no], [everybody, ur], [my, not], [name, stop], [is, capping], [markiplier, already]] -> hello everybody my name is markiplier | result: ");pln(getColumnString(new String[][] {{"hello", "no"}, {"everybody", "ur"}, {"my", "not"}, {"name", "stop"}, {"is", "capping"}, {"markiplier", "already"}}, 0));
    }
}
