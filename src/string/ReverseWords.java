package string;

public class ReverseWords {

	public static void main(String[] args) 
	{
		String input1 = "My Name is Khan";
		String output1 = reverseWords(input1);
		String output2 = reverseWords2(input1);
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(reverseWordsLeetcode("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String inputString)    // Time ->  O(n) 
	{                                                       // Space -> O(w)    w-> no of words present in String   
		String words[] = inputString.split(" ");
		String outputString = "";
		for(int i=words.length-1; i>=0; i--)
		{
			outputString = outputString + words[i]+ " ";
		}
		outputString = outputString.substring(0,outputString.length()-1);
		return outputString;
	}
	
	public static String reverseWords2(String inputString)     // Time  -> O(n)
	{                                                          // Space -> O(1)
		String outputString = "";
		String word = "";
		for(int i=inputString.length()-1; i >= 0 ; i--)
		{
			char c = inputString.charAt(i);
			if(c == ' ')
			{
				outputString += word+" ";
				word = "";
			}else
			{
				word = c + word;
			}
		}
		outputString += word;
		return outputString;
	}
	public static String reverseWordsLeetcode(String s) {
        String c[] = s.split(" ");
        String output = "";
        for(int i=0 ;i<c.length; i++){
            String s1 = c[i];
            for(int j = c[i].length()-1; j >= 0; j--){
                output +=  s1.charAt(j);
            }
            output += " ";
        }
        output = output.substring(0,output.length()-1);
        return output;
    }

}
