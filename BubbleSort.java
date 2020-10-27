import java.io.*; 
import java.util.*; 

class Main {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	while(t-- >0)
	{
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
		
		for(int j=0;j<n;j++)
			{
			for(int i=0;i<n-1;i++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	for(int i=0;i<n;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	}
}
