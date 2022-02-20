package com.bl;

import java.util.Scanner;

public class PerfectNumber 
{
	    public static void main(String[] args) 
	    {
	        int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any number:");
	        n = s.nextInt();
	        for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println(" number is Perfect");
	        }
	        else
	        {
	            System.out.println(" number is not Perfect");
	        }    
	    }
}