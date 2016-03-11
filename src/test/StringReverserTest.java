package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import element.Reverser;


public class StringReverserTest {
	
	public static void reverser()throws IOException{
		String  input,output;
		while(true)
		{
		System.out.println("输入：");
		System.out.flush();
		input=getString();
		if(input.equals(""))break;
		Reverser theReverser=new Reverser(input);
		output=theReverser.doRev();
		System.out.println(output);
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
