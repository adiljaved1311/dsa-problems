package companies;

public class AppSuccessor {
    public static void main(String[] args) {
        System.out.println(isSubstring("onetwofourfive","twofour"));
        System.out.println(isWordPresent("Hello Yes sir","sir"));
        printPattern(8);
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
    public static boolean isWordPresent(String sentence, String word)
    {
        String temp = "";
        for(int i=0; i<sentence.length(); i++)
        {
            char c1 = sentence.charAt(i);
            if(c1 != ' ')
            {
                temp += c1;
            }else
            {
                if(temp.equals(word))
                    return true;
                temp = "";
            }
        }
        return temp.equals(word);
    }
    public static void printPattern(int n)
    {
        boolean left = true;
        for(int i=1; i<=n; i++)
        {
            int starCount = i <= n/2 ? i: (n-i+1);
            int hashCount = n-starCount;
            if(left)
            {
                for(int j=1; j<=starCount; j++)
                {
                    System.out.print("*");
                }
                for(int j=1; j<=hashCount; j++)
                {
                    System.out.print("#");
                }
            }else
            {
                for(int j=1; j<=hashCount; j++)
                {
                    System.out.print("#");
                }
                for(int j=1; j<=starCount; j++)
                {
                    System.out.print("*");
                }
            }
            left = !left;
            System.out.println();
        }
    }
}

