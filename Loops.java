public class Loops {
    public int numDigits(int num) {
        return String.valueOf(num).length();
    }

    public boolean isDivisible(int a, int b) {
        return a%b == 0;
    }
    public int sumOddBetween(int floor, int ceiling) {
        int result = 0;
        for (int i = floor; i <= ceiling; i++) {
            if (i%2 == 1) {
                result += i;
            }
        }
        return result;
    }

    public int sumMult10(int floor, int ceiling) {
        int result = 0;
        for (int i = floor; i < ceiling; i++) {
            if (i%10 == 0) {
                result += i;
            }
        }
        return result;
    }

    public int sumDigits(int num) {
        String str = String.valueOf(num);
        int length = str.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += Integer.parseInt(str.substring(i, i + 1));
        }
        return result;
    }

    public int max2PowerLess(int num) {
        int result = 2;
        while (true) {
            int nextResult = result*2;
            if (nextResult >= num) {
                return result;
            }
            result = nextResult;
        }
    }

    public int numOccurrences(String str, String pattern) {
        int occurrences = 0;
        int patternLength = pattern.length();
        while (true) {
            int location = str.indexOf(pattern);
            if (location == -1) {
                return occurrences;
            }
            occurrences++;
            str = str.substring(location + patternLength);
        }
    }

    public Loops() {
        System.out.println("1: numDigits");
        System.out.print("| ");System.out.println(numDigits(123));
        System.out.print("| ");System.out.println(numDigits(2147483647));
        System.out.println("2: isDivisible");
        System.out.print("| ");System.out.println(isDivisible(12, 3));
        System.out.print("| ");System.out.println(isDivisible(546357653, 7));
        System.out.print("| ");System.out.println(isDivisible(20, 3));
        System.out.println("3: sumOddBetween");
        System.out.print("| ");System.out.println(sumOddBetween(1, 10));
        System.out.print("| ");System.out.println(sumOddBetween(5, 10));
        System.out.print("| ");System.out.println(sumOddBetween(10, 20));
        System.out.println("4: sumMult10");
        System.out.print("| ");System.out.println(sumMult10(5, 25));
        System.out.print("| ");System.out.println(sumMult10(10, 30));
        System.out.println("5: sumDigits");
        System.out.print("| ");System.out.println(sumDigits(234));
        System.out.print("| ");System.out.println(sumDigits(2147483647));
        System.out.println("6: max2PowerLess");
        System.out.print("| ");System.out.println(max2PowerLess(100));
        System.out.print("| ");System.out.println(max2PowerLess(65535));
        System.out.println("7: numOccurrences");
        System.out.print("| ");System.out.println(numOccurrences("HELLO HELLO!!!", "HELL"));
        System.out.print("| ");System.out.println(numOccurrences("hello everybody my name is markiplier and today we will be playing", "e"));
    }
}
