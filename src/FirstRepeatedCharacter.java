package tavant;

import java.util.HashMap;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String s = "asdgasathu";
        System.out.println(firstRepeatedCharacter(s));
    }
    private static char firstRepeatedCharacter(String s){
        HashMap map = new HashMap();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                return c;
            }else{
                map.put(c,1);
            }
        }
        return '-';
    }
}
