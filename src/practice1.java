
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

//duplicate chars and first non repeated char
public class practice1 {

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
		//break;
		cha.add(ch);
		}
		}
		
			
			
		}
		System.out.println(cha.get(0));
		
	String s1="niveda";
	String s2="iyer";
	s1 = s1 + s2;
	System.out.println("s1 : "+s1);
    s2 = s1.substring(0, s1.length()-s2.length());
    System.out.println("s2 : "+s2);
    s1 = s1.substring(s2.length());
    System.out.println("s1 : "+s1);
    //Swapping ends
     
    System.out.println("After Swapping :");
     
    System.out.println("s1 : "+s1);
     
    System.out.println("s2 : "+s2);

	}

		
	}


