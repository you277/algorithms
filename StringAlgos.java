public class StringAlgos {
    public boolean contains(String a, String b) {
        return a.indexOf(b) != -1;
    }

    public String reverse(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public StringAlgos() {
        System.out.println("1: contains");
        System.out.print("| ");System.out.println(contains("hello", "hell"));
        System.out.print("| ");System.out.println(contains("dfgsdfherg", "yes"));
        System.out.println("2: reverse");
        System.out.print("| ");System.out.println(reverse("hello"));
        System.out.print("| ");System.out.println(reverse("among us"));
        System.out.println("3: isPalindrome");
        System.out.print("| ");System.out.println(isPalindrome("racecar"));
        System.out.print("| ");System.out.println(isPalindrome("not"));
    }
}
