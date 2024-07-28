//Java Program to Check Whether a Number is Even or Odd
/* Given an integer input num, the objective is to write a code to Check Whether a Number is Even or Odd in Java Language. To do so we check if the number is divisible by 2 or not, it’s Even if it’s divisible otherwise Odd.

Example 
Input : num = 11
Output : Odd */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num = ");
		int num=sc.nextInt();
		if(num%2==0){
		    System.out.println("Even");
		}
		else{
		    System.out.println("Odd");
		}
		
	}
}

/*
>>>METHODS: BRUTE FORCE ,TERNARY OPERATOR,BIT otherwise

->TERNARY OPERATOR

public class Main
 {
   public static void main (String[]args)
   {
     int number = 29;

     //Checking if the number is divisible by 2
     String status = number % 2 == 0 ? " is Even" : " is Odd";
       System.out.println (number + status);
   }
 }
 
 ->Bitwise Operator
If we have any number ‘n‘ doing bitwise ‘&‘ operation will give resultant as
1: If n is odd
0: if n is even

public class Main{
    public static void main(String[] args){
        int num=34;
        if(isEven(number)){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
        static bool isEven(int num){
            return (!(num & 1));
        }
    }
}
 
 