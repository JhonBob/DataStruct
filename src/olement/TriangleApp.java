package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ݹ���������   �ݹ��Ч�ʲ���ѭ����  �ݹ��������
public class TriangleApp {
	static int theNumber;
	
	public static void run() throws IOException{
		System.out.println("����һ�����֣�");
		theNumber=getInt();
		int theAnswer=triangle(theNumber);
		System.out.println("���Ǹ�����"+theAnswer);
		
	}
	
	public static int triangle(int n){
		if(n==1)//��ֵ  ��ֹ�ݹ������
			return 1;
		else
			return (n+triangle(n-1));
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String s=br.readLine();
		return s;
	}
	
	public static char getChar()throws IOException{
		String s=getString();
		return s.charAt(0);
	}
	
	public static int getInt()throws IOException{
		String s=getString();
		return Integer.parseInt(s);
	}
}
