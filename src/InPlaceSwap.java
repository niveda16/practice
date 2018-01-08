
public class InPlaceSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
