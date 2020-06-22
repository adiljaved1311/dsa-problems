package string;

public class WordPresent {

	public static void main(String[] args) {
		System.out.println(isWordPresent("Hello Yes sir","sir"));
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

}
