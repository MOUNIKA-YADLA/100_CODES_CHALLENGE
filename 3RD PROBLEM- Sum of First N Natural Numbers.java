//Program to Find the Sum of First N Natural Numbers using java

/*
Given an integer input the objective is to write a code to Find the Sum of N Natural Numbers in C++. To do so we simply keep adding the value of the iter variable using a for loop.

Example
Input : num = 5
Output : 15

Where first 8 number is 1, 2, 3, 4, 5
Sum of numbers = 1 + 2 + 3 + 4 + 5 = 15 */

public class Main
{
	public static void main(String[] args) {
		int num=5;
		int sum=0;
		for(int i=1;i<=num;i++){
		    sum +=i;
		}
		System.out.println(sum);
	}
}


/*
Formula to Find the Sum of N terms
Sum = ( Num * ( Num + 1 ) ) / 2


recursion
public class Main
{
  public static void main (String[]args)
  {

    int n = 10;
    int sum = getSum (n);

      System.out.println (sum);
  }

  static int getSum (int n)
  {
    if (n == 0)
      return n;

    return n + getSum (n - 1);
  }
}
*/
