package tree234;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree234App {
	public static void run() throws IOException{
		long value;
    	Tree234 theTree=new Tree234();
    	theTree.insert(50);
    	theTree.insert(40);
    	theTree.insert(60);
    	theTree.insert(30);
    	theTree.insert(70);
//    	theTree.insert(43);
//    	theTree.insert(30);
//    	theTree.insert(33);
//    	theTree.insert(87);
//    	theTree.insert(93);
//    	theTree.insert(97);
//    	theTree.insert(100);
    	
    	while(true){
    		System.out.println(" Enter:");
    		char choice=getChar();
    		switch(choice){
    		case 's':
    			theTree.displayTree();
    			break;
    		case 'i':
    			System.out.println(" Enter value:");
    			value=getInt();
    			theTree.insert(value);
    			break;
    		case 'f':
    			System.out.println(" Enter key:");
    			value=getInt();
    			int found=theTree.find(value);
    			if(found!=-1){
    				System.out.println(" Found "+found);
    			}else{
    				System.out.println(" Not Found");
    			}
    			break;
    		default:
    			System.out.println(" Invalid enter");
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
