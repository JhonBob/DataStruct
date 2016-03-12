package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackOTriangleApp {
	static int theNumber;
	static int theAnswer;
	static StackO theStack;
	
	public static void run() throws IOException{
		System.out.print("ÊäÈë£º");
		theNumber=getInt();
		stackTriangle();
		System.out.println(theAnswer);
	}
	
	
	public static void stackTriangle(){
		theStack=new StackO(10000);
		theAnswer=0;
		while(theNumber>0){
			theStack.push(theNumber);
			theNumber--;
		}
		
		while(!theStack.isEmpty()){
			int newN=theStack.pop();
			theAnswer+=newN;
		}
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
