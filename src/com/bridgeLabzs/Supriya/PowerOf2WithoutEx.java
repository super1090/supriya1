package com.bridgeLabzs.Supriya;

import java.util.Scanner;

import com.bridgeit.Utility.Utility;

public class PowerOf2WithoutEx 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(">> Enter the base number : ");
		int base=sc.nextInt();
		
		Utility.powerWithout(base);
		
	}
}
