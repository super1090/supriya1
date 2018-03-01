package com.bridgeLabzs.Supriya;

import java.util.Scanner;

public class HarmonicNumber
{
	public static void main(String[] args)
	{
		int i=1,num;
		Scanner sc=new Scanner(System.in);
		System.out.println(">> Enter a number : ");
		num=sc.nextInt();
		while(i<=num)
		{
			System.out.print("1/"+ i +" ");
			i++;
		}
	}
}
