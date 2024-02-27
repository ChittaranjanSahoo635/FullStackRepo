package com.nt.main;

import com.nt.service.ArithmeticOperation;

public class AppTest 
{
	public static void main(String[] args) 
	{
		ArithmeticOperation ar=new ArithmeticOperation();
		System.out.println("sum:"+ar.sum(100, 200));
		System.out.println("sub:"+ar.sub(100, 200));
		
		System.out.println("------------------------");
		System.out.println("mul:"+ar.mul(100, 300));
		
	}
}
