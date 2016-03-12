package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import element.Reverser;

public class IteratorLinkListTest {
	public static void run() throws IOException{
		IteratorLinkList theLink=new IteratorLinkList();
		ListIterator  iter1=theLink.getIterator();
		long value;
		iter1.insertAfter(20);
		iter1.insertAfter(40);
		iter1.insertAfter(60);
		iter1.insertAfter(80);
		
		String  input,output;
		while(true)
		{
		System.out.println(" ‰»Î÷∏¡Ó£∫");
		System.out.flush();
		int choice=getChar();
		switch (choice) {
		case 's':
			if(!theLink.isEmpty()) theLink.displayList();
			else System.out.println("empty");
			break;
		case 'r':
			iter1.reset();
			break;
		case 'n':
			if(!theLink.isEmpty() && !iter1.atEnd())
			iter1.nextLink();
			else System.out.println("no next");
			break;
		case 'g':
			if(!theLink.isEmpty()){
				value=iter1.getCurrent().dData;
				System.out.println(value);
			}else{
				System.out.println("empty");
			}
			break;
		case 'b':
			System.out.println("enter int");
			System.out.flush();
			value=getInt();
			iter1.insertBefore(value);
			break;
		case 'a':
			System.out.println("enter int");
			System.out.flush();
			value=getInt();
			iter1.insertAfter(value);
			break;
		case 'd':
			if(!theLink.isEmpty()){
				value=iter1.deleteCurrent();
				System.out.println(value);
			}else{
				System.out.println("can not delete");
			}
			break;

		default:
			System.out.println("unuseful char");
			break;
		}
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
