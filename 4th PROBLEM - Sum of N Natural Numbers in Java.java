// Find the Sum of N Natural Numbers in Java
/*
Given an integer input “num” the objective is to sum up all the numbers that lay in the interval [0,num]. To do so we’ll write a code to Find the Sum of N Natural Numbers in Java.

Example
Input : 6
Output : 21
Explanation : 0 + 1 + 2 + 3 + 4 + 5 + 6 = 21.
*/

public class Main
{
	public static void main(String[] args) {
	    int n=6,sum=0;
		for(int i=0;i<n;i++){
		    sum += i;
		    
		}
		System.out.println(sum);
	}
}
