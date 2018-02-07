import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author niveda
 *
 */
public class VowelsConsonants {

	/*vowels and consonants    
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String word="niveda iyer";
	int countv = 0,counts = 0;
	char[] c=word.toCharArray();
	char s1;
	List l1=new ArrayList();
	List l2=new ArrayList();
	for(int i=0;i<word.length();i++)
	{
		s1=word.charAt(i);
		if(s1=='a'||s1=='A'||s1=='e'||s1=='E'||s1=='I'||s1=='i'||s1=='o'||s1=='O' ||s1=='u'||s1=='U')
		{
			l1.add(s1);
			countv++;
		}
		else
		{
			l2.add(s1);
			counts++;
		}
	}
	System.out.println("vowels are "+countv+" consonants are "+counts);
	}

}
