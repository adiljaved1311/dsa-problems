package tavant;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Adil"));
    }

    public static String reverse(String str) {
        if (str.length() == 0) {
            return "";
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
