import java.io.*; 
import java.util.*; 

class Palindrome{
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
    String str=s.next();
    StringBuffer br=new StringBuffer(str);
    br.reverse();
    String ans=br.toString();
    if(str.equals(ans))
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not palindrome");
    }
    }
}
