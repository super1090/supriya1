package com.bridgeLabzs.Supriya;

import java.util.Random;
import java.util.Scanner;

import com.bridgeit.Utility.Utility;

public class HeadVsTails
{
	
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.print(">> Tose a Coin : ");
	int flips=sc.nextInt();
	Utility.headVsTail(flips);
	
}
}

