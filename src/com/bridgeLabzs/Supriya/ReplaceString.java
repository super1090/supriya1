package com.bridgeLabzs.Supriya;

import java.util.Scanner;

public class ReplaceString 
{
	Scanner sc=new Scanner(System.in);
	String sm;
	public static void main(String[] args) 
	{
			String sm="Hello <<UserName>> , How are you ?";
			
	//	String m=" ";
	}
		public void printName()
		{
			System.out.println(">> Enter User Name");
			String Uname=sc.next();
				if(Uname.length()==3)
				{
					sm=sm.replace("<<UserName>>", Uname);
					System.out.println(sm);
				}
				else
				{
					System.out.println(">> Please Enter 3 Char Only : TRY AGAIN ");
				}
			
		}
		
}
