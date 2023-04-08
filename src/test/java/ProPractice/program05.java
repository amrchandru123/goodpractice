package ProPractice;

public class program05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //reverse string by using while loop
		
	String s1="chandru good person";
	String s2=" ";
	int i=s1.length()-1;
	while(i>=0)
	{
		s2=s2+s1.charAt(i);
		i--;
	}
	
	System.out.println(s2);
	}

}
