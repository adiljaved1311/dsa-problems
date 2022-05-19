package companies.serviceNow;

public class ReducedString {
    public static void main(String[] args) {
        String S = "abba";
        System.out.println(reducedString(S));
    }
    public static String reducedString(String S){
        boolean changed = false;
        do{
            changed = false;
            for (int i = 0; i < S.length(); i++){
                if (i == S.length() - 1) continue;
                if (S.charAt(i) == S.charAt(i+1)){
                    changed = true;
                    S = S.substring(0,i) + S.substring(i+2);
                }
            }
        }while(changed);
        if (S.equals(""))
            return "Empty String";
        else
            return S;
    }
}
