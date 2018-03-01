package com.bridgeLabzs.Supriya;

import java.util.Scanner;

import com.bridgeit.Utility.Utility;

public class TwoDArray2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice : \n 1. IntegerArray \n 2.DoubleArray \n 3.BooleanArray");System.out.println();
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1 : Utility.intArray();
					 break;
					 
			case 2 : Utility.doubleArray();
					 break;
			case 3 : Utility.booleanArray();
					 break;
			default : System.out.println("Invalidm choice : ");
					 System.exit(0);
		}
	
	}
}
