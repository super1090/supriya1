package com.bridgeLabzs.Supriya;

import java.util.Scanner;

import com.bridgeit.Utility.Utility;

public class Distance
{
	
	public static void main(String[] args) 
	{
		int x=0,y=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(">> Enter Any Two Numbers : ");
		int x2=sc.nextInt();
     	int y2=sc.nextInt();
     	Utility.distance(x2,y2);
	}
}
