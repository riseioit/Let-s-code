/*
Given an array A[], of size N containing positive integers. You need to print the elements of array in increasing order.
Input:
First line of the input denotes the number of test cases 'T'. First line of the test case is the size of array and second line consists of array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^3
1 <= A[i] <= 10^3

Output
For each testcase print the sorted array in a new line.

Ex-
Input:
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1

Output:
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10
*/

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
