import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		String str="xheixhixhi";
		int x=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='x')
				x++;
		
			else
				sb.append(str.charAt(i));
		}
		for(int i=0;i<x;i++)
			sb.append('x');
		System.out.println(sb);
		
		String str1="xxxyyy";
		StringBuffer sb1=new StringBuffer(str1);
		System.out.println(sb1.toString());
		for(int i=0;i<(str1.length());i++)
		{
			if(sb1.charAt(i)==sb1.charAt(i+1))
			{
				System.out.println(i);
				sb1.insert(++i,'*');
			}
				
		}
		System.out.println(sb1.toString());
		
		//anagram
		String s1="niveda";
		String s2="Nivedas";
		String s4=s2.toLowerCase();
		char[] s3=s1.toCharArray();
		char[] s5=s4.toCharArray();
		Arrays.sort(s3);
		Arrays.sort(s5);
		boolean result=Arrays.equals(s3, s5);
		System.out.println("result is "+result);
		
		//check all digits
		String s="09779";
		if (s.isEmpty())
			System.out.println("empty");;

		for (int i = 0; i < s.length(); i++) {
		int temp =  s.charAt(i) - (int)'0';
		System.out.println(temp);
		if (temp < 0 || temp > 9)
			System.out.println("false");
		
		}

		System.out.println("true");

		//reverse a string
		String s6="niveda is";
		String sb4=new StringBuffer(s6).reverse().toString();
		System.out.println(sb4);
		
		StringBuilder s7=new StringBuilder();
		char[] c1=s6.toCharArray();
		for(int i=c1.length-1;i>=0;i--)
		{
			s7.append(c1[i]);
		}
		System.out.println(s7);
		
		//replace with space
		String str5="xxx yyy";
		StringBuilder sb6=new StringBuilder(str5);
		System.out.println(sb6.toString());
		for(int i=0;i<(str5.length());i++)
		{
			if(sb6.charAt(i)==32)
			{
				System.out.println(i);
				sb6.replace(i,i+1,"%20");
			}
				
		}
		System.out.println(sb6.toString());
		
		String sentence="my name is niveda";
		List< String> words = Arrays.asList(sentence.split("\\s")); 
		Collections.reverse(words); 
		
		System.out.println(words);
		StringBuilder sb8 = new StringBuilder(sentence.length()); 
		
		for (int i = 0; i <=words.size() - 1; i++)
		{ 
			sb8.append(words.get(i)); 
			
		sb8.append(' ');
		}
		System.out.println(sb8.toString().trim());
		
		StringBuffer sb9=new StringBuffer(sentence);
		String sb10=sb9.reverse().toString();
		System.out.println("old "+sb10.toString().trim());
		
		StringBuilder reverse = new StringBuilder(); 
		String[] sa = sentence.trim().split("\\s"); 
		String newest="";
		for (int i = sa.length - 1; i >= 0; i--) 
		{ 
			String newword=sa[i]; 
			//reverse.append(' '); 
			String newstring="";
			for(int n=newword.length()-1;n>=0;n--)
			{
				newstring=newstring+newword.charAt(n);
		
			}
			newest=newest+newstring+" ";
		} 
		System.out.println( reverse.toString().trim());
		System.out.println("newest "+newest);
		System.out.println("number of words in the string "+sa.length);

		
		//reverse chars in the word in place
		String s11="my name is niveda";
		String reversestring="";
		String[] c11=s11.trim().split("\\s");
		for(int k=0;k<c11.length;k++)
		{
			String word=c11[k];
			String reverseword="";
			for(int m=word.length()-1;m>=0;m--)
			{
				
			reverseword=reverseword+word.charAt(m);
			}
			reversestring=reversestring+reverseword+" ";
		}
		
		System.out.println( reversestring);
	}

}
