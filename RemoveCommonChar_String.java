import java.util.*;
import java.io.*;

class RemoveCommonChar_String
{
  	public static void main (String[] args)
  	{
  		Scanner s= new Scanner(System.in);
  		// int test = s.nextInt();
	    //StringBuffer br=new stringBuffer();
	    String str=s.next();
	    String str2=s.next();
	    int a=str.length();
	    int b=str2.length();
	    int len=Math.max(a,b);
	    for(int i=0;i<str.length();i++)
	    {
	       char c=str.charAt(i);
	       String st=Character.toString(c);
	       if(str2.contains(st))
	       {
	          str=str.replaceFirst(st,"");
	          str2=str2.replaceFirst(st,"");
            i--;
	       }
	    }
      int x=str.length();
      int y=str2.length();
      // str=str.concat(str2);
	    System.out.print(x+y);
	   }
  }
