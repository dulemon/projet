package exam;

import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *@ClassName:Exception2
 *@Description:
 *@author 
 *@date:2017��11��18��
 */
public class exam2 {

	public Date change(String date) throws ParseException   //����yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ���
	{
		DateFormat format=new SimpleDateFormat("yyyy/mm/dd");
		try
		{
			return new Date(format.parse(date).getTime());
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam2 exam=new exam2();
		System.out.println("���������ڣ����磺2011/11/18):");
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		try
		{
			System.out.println(exam.change(string));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			System.out.println("���������ʽ����");
		}	
	}
}
