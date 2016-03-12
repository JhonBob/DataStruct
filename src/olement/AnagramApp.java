package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//递归变位子
public class AnagramApp {
	//字符长度
	static int size;
	//变换种类
	static int count;
	static char[] arrChar=new char[100];
	
	public static void run() throws IOException{
		System.out.println("输入");
		String input=getString();
		size=input.length();
		count=0;
		for (int i = 0; i <size; i++) {
			arrChar[i]=input.charAt(i);
		}
		doAnagram(size);
	}
	
	//变位颠倒
	public static void doAnagram(int newSize){
		if(newSize==1)
			return;
		//for循环加深横纵向递归深度
		for (int i = 0; i < newSize; i++) {
			doAnagram(newSize-1);
			if(newSize==2)
				displayWord();
			rotate(newSize);
		}
	}
	
	
	public  static void displayWord() {
		// TODO Auto-generated method stub
		if(count<99)
			System.out.print(" ");
		if(count<9)
			System.out.print(" ");
		System.out.print(++count+" ");
		for (int i = 0; i < size; i++) {
			System.out.print(arrChar[i]);
		}
		System.out.print("   ");
		System.out.flush();
		if(count%6==0){
			System.out.println();
		}
	}

	//转动
	public static void rotate(int newSize) {
		// TODO Auto-generated method stub
		int j;
		int position=size-newSize;
		char temp=arrChar[position];
		//内层数据滚动
		for (j = position+1; j <size; j++) {
			arrChar[j-1]=arrChar[j];
		}
		//循环完后arrChar[j-1]在尾部
		arrChar[j-1]=temp;
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
