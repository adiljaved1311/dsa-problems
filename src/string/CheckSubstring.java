package string;

public class CheckSubstring {

	public static void main(String[] args) {
		System.out.println(isSubstring("onetwofourfive","twofour"));
	}
	
	public static boolean isSubstring(String str, String sb)
    {
        int j = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(j == sb.length())
            {
                return true;
            }
            char c1 = str.charAt(i);
            char c2 = sb.charAt(j);
            if(c1 == c2) {
                j++;
            }else{
                j = 0;
            }
        }
        return false;
    }

}
