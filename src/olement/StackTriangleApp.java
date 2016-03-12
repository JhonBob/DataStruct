package olement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackTriangleApp {
	static int theNumber;
	static int theAnswer;
	static StackZ theStack;
	static int codePart;
	
	static Parame theseParames;
	
	
	public static void run() throws IOException{
		System.out.print("输入：");
		theNumber=getInt();
		recTriangle();
		System.out.println(theAnswer);
	}
	
	public static void recTriangle(){
		theStack=new StackZ(10000);
		codePart=1;//开始计算
		while(step()==false);
		
	}
	
	public static boolean step(){
		switch (codePart) {
		case 1:
				theseParames=new Parame(theNumber,6);//6表示当前数值是栈中最底层一个
				theStack.push(theseParames);
				codePart=2;//读取下一列
			break;
		case 2:
			theseParames=theStack.peek();
			if(theseParames.n==1){//全部列都放入栈中
				theAnswer=1;
				codePart=5;//取栈中数据
			}else{
				codePart=3;//将当前数值放入栈中
			}
			break;
		case 3:
			Parame newParame=new Parame(theseParames.n-1,4);//4求和累加
			theStack.push(newParame);
			codePart=2;
			break;
		case 4:
			theseParames=theStack.peek();
			theAnswer=theAnswer+theseParames.n;
			codePart=5;//弹出下一个
			break;
		case 5:
			theseParames=theStack.peek();
			codePart=theseParames.returnAddress;
			theStack.pop();
			break;
		case 6:
			return true;

		default:
			break;
		}
		
		return false;
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
