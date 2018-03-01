package com.bridgeLabzs.Supriya;

import java.util.Scanner;

public class TwoDArray		// In complete
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(">> Enter the size of rowes & Columns :");
		int row=sc.nextInt();
		int column=sc.nextInt();
		System.out.println(">> Size of Rows = "+row);
		System.out.println(">> Size of Columns = "+column);
		int a[][]=new int[row][column];
		int c[][]=new int[row][column];
		int i,j;
		System.out.println("Enter the values for an Array : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(">> Matric A is : ");
		int b[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		//System.out.println(a[i][]);
		System.out.print(">> Enter the values for B array : ");
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix B is : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(" "+b[i][j]);
			}
			System.out.println();
		}
		System.out.println(">> Multiplication of given Array Is  : ");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
				System.out.println(c[i][j]);
			}
		}
		//System.out.println(" >> After Multiplication : ");
		
		
	}
}
