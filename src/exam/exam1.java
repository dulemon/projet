package exam;

import java.util.Scanner;

import java.math.BigInteger;

public class exam1 {
	public static void main(String[] args)
	{
		System.out.println("������һ��ʮ����������");
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		try
		{
			
			BigInteger bigInt=new BigInteger(str,16);
			System.out.print("��Ӧʮ������Ϊ:");
			System.err.print(bigInt.toString(10));
			
		}
		catch(Exception e)
		{
			
			System.err.println("���������д�");
	
		}
	}
	
}