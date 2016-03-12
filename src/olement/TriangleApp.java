package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//递归三角数字   递归的效率不比循环高  递归简化了问题
public class TriangleApp {
	static int theNumber;
	
	public static void run() throws IOException{
		System.out.println("输入一个数字：");
		theNumber=getInt();
		int theAnswer=triangle(theNumber);
		System.out.println("三角个数："+theAnswer);
		
	}
	
	public static int triangle(int n){
		if(n==1)//基值  终止递归的条件
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
