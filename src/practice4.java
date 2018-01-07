import java.util.HashMap;

/**
 * 
 */

/**
 * @author is_2315
 *
 */
//first non repeated char
public class practice4 {

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
				count.put(c, count.get(c)+1);
				else
					count.put(c, 1);
		}
		for(int j=0;j<word.length();j++)
		{
			char c=word.charAt(j);
			if(count.get(c)==1)
			{
				System.out.println(c);
			break;
			}	
		}
		
		

	}

}
