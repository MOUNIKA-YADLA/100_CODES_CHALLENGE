//to Find Greatest of Two Numbers
/*
Given two integer inputs N1 and N2, the objective is to write a code to Find the Greatest of the Two Numbers in Java. In order to do so we’ll compare the numbers using if-else statements.
 
Example
Input : num1 = 12 and num2 = 3
Output : 12
*/

public class Main
{
	public static void main(String[] args) {
		int n1=12,n2=3;
		if(n1 > n2){
		    System.out.println(n1 +" is greater");
		}
		else if(n1==n2){
		    System.out.println("Equal");
		    
		}
		else{
		    System.out.println(n2 +" is greater");
		}
	}
}

/*
Ternary Operator
int temp = n1>n2 ? n1: n2

//inbuilt function
System.out.println(Math.max(n1,n2)+ "is greater");


public class Main
{
  public static void main (String[]args)
  {
    int num1 = 50, num2 = 10, temp;

    if (num1 == num2)
      System.out.println ("Both are Equal\n");
    else
      {
	temp = num1 > num2 ? num1 : num2;
	System.out.println (temp + " is largest");
      }

  }
}



public class Main {
    public static void main(String args[])
    {
        int num1 = 12, num2 = 21;
        if (num1 == num2)
            System.out.println("both are equal");
        else
            // prints the maximum of two numbers
            System.out.println(Math.max(num1, num2) + " is greater");
    }
}



