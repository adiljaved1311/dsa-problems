package tavant;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Adilqwd";
        String s2 = "iAdlwdq";
        System.out.println(isAnagram(s1,s2));
        System.out.println(isAnagram2(s1,s2));
    }
    private static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap map1 = new HashMap();
        HashMap map2 = new HashMap();
        for(int i = 0 ;i <s1.length() ; i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i),map1.get(s1.charAt(i)+1));
            }else{
                map1.put(s1.charAt(i),1);
            }
        }
        for(int i = 0 ;i <s2.length() ; i++){
            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i),map2.get(s2.charAt(i)+1));
            }else{
                map2.put(s2.charAt(i),1);
            }
        }
        for(int i = 0 ; i < s1.length() ; i++){
            char c  = s1.charAt(i);
            if(map1.get(c) != map2.get(c)){
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagram2(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] a1 = new int[26];
        for(int i = 0 ;i <s1.length(); i++){
            int c1 = s1.charAt(i);
            int c2 = s2.charAt(i);
            a1[c1-97]++;
            a1[c2-97]--;
        }
        for(int i=0;i< a1.length;i++){
            if(a1[i] != 0){
                return false;
            }
        }
        return true;
    }
}
