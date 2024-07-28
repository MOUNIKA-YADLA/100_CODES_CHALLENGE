// Check if a Number is Positive or Negative in Java
/* DAY -1 
Check if a Given Number is Positive or Negative in Java
Given an integer num input the objective is to write a code to Check if a Given Number is Positive or Negative in Java Language.

Example
Input : num = 11
Output : Positive */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num = ");
		int num=sc.nextInt();
		if(num>0){
		    System.out.println("Positive");
		}
		else if(num<0){
		    System.out.println("Negative");
		}
		else{
		    System.out.println("Zero");
		}
	}
}
