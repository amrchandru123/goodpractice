package ProPractice;

public class program04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reverse string using for looping
     String s1="chandru amareshwar";
     String s2=" ";
     for(int i=s1.length()-1;i>=0;i--)
     {
    	 s2=s2+s1.charAt(i);
     }
     System.out.println(s2);
	}

}
