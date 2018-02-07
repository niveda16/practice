
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/*This program finds duplicate chars and the first non repeated character
by iterations
*/
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aaaxbbcccbaaasssf";
		char ch;
		List cha=new ArrayList();
		int count1;
		char a1[]=a.toCharArray();
		for(int i=0;i<a1.length;i++)
		{
			count1=0;
			ch=a.charAt(i);

			if(!cha.contains(ch))
			{
				for(int j=0;j<a1.length;j++)
				{

					if(ch==a1[j])
					{
						count1++;

					}
				}
				if(count1==1)
				{
					System.out.println(ch+"--"+count1);
					cha.add(ch);
				}
			}
		}
		System.out.println("First non repeated character - "+cha.get(0));
	}//main
}//class
