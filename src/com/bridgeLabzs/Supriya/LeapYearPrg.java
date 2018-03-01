package com.bridgeLabzs.Supriya;

import java.util.Scanner;

import com.bridgeit.Utility.Utility;



public class LeapYearPrg  	//Q.3
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
		System.out.println(">> Enter Any 4 digit Year");
		int year=sc.nextInt();
		Utility.leapyear(year);
	}
}
