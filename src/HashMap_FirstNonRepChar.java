import java.util.HashMap;

/*This program finds the first non repeated character using HashMap
 */

/**
 * @author is_2315
 *
 */
//first non repeated char
public class HashMap_FirstNonRepChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="aaabccdee";
		HashMap<Character,Integer> count=new HashMap<Character,Integer>();
		for(int i=0;i<word.length();i++)
		{
			char c=word.charAt(i);
			if(count.containsKey(c))
				count.put(c, count.get(c)+1);	//storing the char and corresponding count
				else
					count.put(c, 1);
		}
		for(int j=0;j<word.length();j++)
		{						
			char c=word.charAt(j);
			if(count.get(c)==1)
			{
				System.out.println("First non repeated character - "+c);
			break;
			}	
		}
		
		

	}

}
