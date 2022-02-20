package com.bl;

public class FibonacciSeries 
{
	 	public static void main(String[] args)
		{
             int n = 10, X1 = 0, Y1 = 1;
			 System.out.println("Fibonacci Series " + n + " terms:");

			 for (int i = 1; i <= n; i++)
			 {
			      System.out.print(X1 + ", ");

			      int nextterm = X1 + Y1;
			      X1 = Y1;
			      Y1= nextterm;
			}


		}
}
