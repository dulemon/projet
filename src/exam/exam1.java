package exam;

import java.util.Scanner;

import java.math.BigInteger;

public class exam1 {
	public static void main(String[] args)
	{
		System.out.println("请输入一个十六进制数：");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		try
		{
			
			BigInteger bigInt=new BigInteger(str,16);
			System.out.print("对应十进制数为:");
			System.err.print(bigInt.toString(10));
			
		}
		catch(Exception e)
		{
			
			System.err.println("数据输入有错");
	
		}
	}
	
}