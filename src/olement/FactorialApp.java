package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//µÝ¹é½×³Ë
public class FactorialApp {
	static int theNumber;
	public static void run() throws IOException{
		System.out.println("ÊäÈëÊý¾Ý");
		theNumber=getInt();
		int theAnswer=factorial(theNumber);
		System.out.println("½×³Ë£º"+theAnswer);
	}
	
	public static int factorial(int n){
		if(n==0)
			return 1;
		else 
			return (n*factorial(n-1));
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
