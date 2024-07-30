//Find the Sum of the Numbers in a Given Range in Java

/*
Given two integer inputs number1 and number2, the objective is to find the sum of all Number that lay in the given interval by writing a code to Find the Sum of the Numbers in a Given Range in Java Language.

Example
Input : Number1 = 12 , Number2 = 15
Output : 54
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n1=12,n2=15,sum=0;

		for(int i=n1;i<=n2;i++){
		    sum += i;
		}
		System.out.println(sum);
	}
}

/*
sum = b*(b+1)/2 – a*(a+1)/2 + a.

recursion

public class Main
{
  public static void main (String[]args)
  {
    int a = 5;
    int b = 10;

    int sum = getSum (0, a, b);
      System.out.println ("The sum is " + sum);
  }


  static int getSum (int sum, int i, int b)
  {

    // stop when any recursion call tries to go over b (larger number)
    if (i > b)
      return sum;

    return i + getSum (sum, i + 1, b);
  }
}
*/