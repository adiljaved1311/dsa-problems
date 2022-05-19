package companies.serviceNow;

import java.util.Arrays;

public class CheckSubstring {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "WORLD";
        System.out.println(isSubstring(s1,s2));
    }

    public static String isSubstring(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        boolean flag = false;
        boolean v[] = new boolean[26];
        Arrays.fill(v,false);

        // increment vector index for every
        // character of str1
        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'a'] = true;

        // checking common substring of str2 in str1
        for (int i = 0; i < s2.length(); i++){
            if (v[s2.charAt(i) - 'a'])
                return "YES";
        }
        return "NO";
    }
}
