/*
@author: komal <komalsupekar>
Statement:Check whether String is palindrome or not.Palindromes are a numbers, phrases or words that reads same both the ways, backward as well as forward.
Ex.1331-Palindrome
123-Not Palindrome.

Note:-String Contains Characters from '0' to '9'.

Constraints:-
1<=|s|<=100000

Input:-String st

Output:-Palindrome /Not palindrome

*/
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
