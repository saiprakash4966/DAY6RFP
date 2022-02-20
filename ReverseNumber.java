package com.bl;

public class ReverseNumber
{
		  public static void main(String[] args) 
		  {

			    int num = 567, r= 0;
			    
			    System.out.println(" Number: " + num);

			    // run loop until num becomes 0
			    while(num != 0) 
			    {
			    
			      // get last digit from num
			      int n= num % 10;
			      r = r * 10 + n;

			      // remove the last digit from num
			      num /= 10;
			    }

			    System.out.println("Reversed Number: " + r);
			  }
}

