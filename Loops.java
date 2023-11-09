public class Loops {
    public static int numDigits(int num) {
        return String.valueOf(num).length();
    }

    public static boolean isDivisible(int a, int b) {
        return a%b == 0;
    }

    public static int subOdd(int floor, int ceiling) {
        int result = 0;
        for (int i = floor; i < ceiling; i++) {
            if (i%2 == 1) {
                result += i;
            }
        }
        return result;
    }

    public static int sumMult10(int floor, int ceiling) {
        int result = 0;
        for (int i = floor; i < ceiling; i++) {
            if (i%10 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static int sumDigits(int num) {
        String str = String.valueOf(num);
        int length = str.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += Integer.parseInt(str.substring(i, i + 1));
        }
        return result;
    }

    public static int max2PowerLess(int num) {
        int result = 2;
        while (true) {
            int nextResult = result*2;
            if (nextResult >= num) {
                return nextResult;
            }
            result = nextResult;
        }
    }

    public static int numOccurences(String str, String pattern) {
        int occurences = 0;
        while (true) {
            int location = str.indexOf(pattern);
            if (location == -1) {
                return occurences;
            }
            occurences++;
            str = str.substring(location);
        }
    }
}
