package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import element.BracketChecker;
import element.Reverser;


public class BracletsTest {

	public static void check()throws IOException{
		String  input,output;
		while(true)
		{
			//A{B(C[D]E)F}
		System.out.println("输入：");
		System.out.flush();
		input=getString();
		if(input.equals(""))break;
		BracketChecker theChecker=new BracketChecker(input);
		theChecker.cheak();
	   }
	}
	
	
	
	
	  //获取输入
	public static String getString() throws IOException{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String s=br.readLine();
			return s;
		}
}
