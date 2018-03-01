package com.bridgeit.Utility;

import java.util.Random;
import java.util.Scanner;

public class Utility
{
	static Scanner sc=new Scanner(System.in);
	
	public static void leapyear(int year)
	{
		if((year%400==0) || (year%4==0))
		{
			System.out.println("Given year is leap year");
		}
		else
		{
			System.out.println("Given year is not a Leap year");
		}
	}	

	public static void PowerOf(int base)
	{
		int exponant=1;
		while(exponant<=base)
		{
			System.out.println("2 ^ "+exponant + "=" +Math.pow(2, exponant));
			/*System.out.println("3 ^ "+exponant + "=" + Math.pow(3, exponant));*/
			exponant++;
		}
	
	}
	
	public static void powerWithout(int base)
	{
		int n=1;
		System.out.println(">> Enter a range : ");
		int exponant=sc.nextInt();
		for(int i=0;i<=exponant;i++)
		{										// wrong
			n=n*base;
			System.out.println("2 ^ "+i+n);
		}
	}
	
	public static void headVsTail(int flips)
	{
		Random r=new Random();
		
		double headcount=0.0;
		double tailcount=0.0;
		double perhead=0.0;
		double pertail=0.0;
		
		for(int i=0;i<=flips;i++)
		{
			if(r.nextInt(100)%2==0)
			{
				headcount++;
			}
			else
			{
				tailcount++;
			}
		}
		System.out.println("Percenatge of head count is  : "+headcount/100*100);
		System.out.println("Percenatge of Tail count is  : "+tailcount/100*100);
		
	}
	
	public static void primeFact(int num)
	{
	
	Scanner sc=new Scanner(System.in);
	System.out.println(">> Enter a Number : ");
	num=sc.nextInt();

		while(num%2==0)
		{
			System.out.println(2 + " ");
			num=num/2;
		}
		for (int i = 3; i <= Math.sqrt(num); i+= 2)
		{
			while (num%i == 0)
			{
				System.out.print(i + " ");
				num /= i;
			}
		}
		if (num > 2)
		{
			System.out.print(num);
		}
	}

public static void distance(int x2,int y2)
{
	int x=0;int y=0;
	double distance=Math.sqrt((x2-x)+(y2-y));
 	System.out.println("Equvalent Distance Is : "+distance);

}

public static void intArray()
{
	System.out.println(">> Enter the size of rowes & Columns :");
	int row=sc.nextInt();
	int column=sc.nextInt();
	System.out.println(">> Size of Rows = "+row);
	System.out.println(">> Size of Columns = "+column);
	System.out.println("Enter the values for an Array : ");
	int i,j;
	int a[][]=new int[row][column];
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println(">> Integer Matric A is : ");
	int b[][]=new int[row][column];
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}

}
	public static void doubleArray()
	{
		System.out.println(">> Enter the size of rowes & Columns :");
		int row2=sc.nextInt();
		int column2=sc.nextInt();
		System.out.println(">> Size of Rows = "+row2);
		System.out.println(">> Size of Columns = "+column2);
		
		System.out.println("Enter the values for an Array : ");
		int i,j;
		double b[][]=new double[row2][column2];
		for(i=0;i<row2;i++)
		{
			for(j=0;j<column2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println(">> Double Matric B is : ");
		//b[][]=new int[row2][column2];
		for(i=0;i<row2;i++)
		{
			for(j=0;j<column2;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}	
	}
	
	public static void booleanArray()
	{
		System.out.println(">> Enter the size of rowes & Columns :");
		int row2=sc.nextInt();
		int column2=sc.nextInt();
		System.out.println(">> Size of Rows = "+row2);
		System.out.println(">> Size of Columns = "+column2);
		
		System.out.println("Enter the values for an Array : ");
		int i,j;
		boolean c[][]=new boolean[row2][column2];
		for(i=0;i<row2;i++)
		{
			for(j=0;j<column2;j++)
			{
				c[i][j]=sc.nextBoolean();
			}
		}
		System.out.println(">> Boolean Matric C is : ");
		//b[][]=new int[row2][column2];
		for(i=0;i<row2;i++)
		{
			for(j=0;j<column2;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}	
	}
	
}
