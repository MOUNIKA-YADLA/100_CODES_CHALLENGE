//Find the Greatest of the Three Numbers in Java
/*
Given three integers num1, num2 and num3 as inputs. The objective is to write a code to Find the Greatest of the Three Numbers in Java Language. To do so we’ll check the numbers with each other and print the largest of them all.
 
*/
public class Main
{
	public static void main(String[] args) {
		int n1=34,n2=78,n3=102;
		if(n1 > n2 && n1>n3){
		    System.out.println(n1 +" Is greatest");
		}
		else if(n2 > n1 && n2>n3){
		    System.out.println(n2 +" Is greatest");
	   }
	else{
	    System.out.println(n3 +" Is greatest");
	}
}
}

/*

Method 1: Using if-else Statements 2
Method 2: Using if-else Statements 2
Method 3: Using Ternary Operator

public class Main
{
  public static void main (String[]args)
  {

    int num1 = 10, num2 = 20, num3 = 30;

    //checking if num1 is greatest
    if (num1 >= num2 && num1 >= num3)
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

    //checking if num2 is greatest
    else if (num3 >= num1 && num3 >= num2)
        System.out.println (num3 + " is the greatest");
  }
}



public class Main
{
  public static void main (String[]args)
  {

    int num1 = 10, num2 = 20, num3 = 30;

     int temp, result;    
    
    // find the largest b/w num1 and num2 & store in temp
    temp = num1>num2 ? num1:num2;
    
    // find the largest b/w temp and num3 & finally printing it
    result = temp>num3 ? temp:num3;  
    System.out.println (result + " is the greatest");
  }
}



*/



