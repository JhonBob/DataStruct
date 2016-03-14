package heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapApp {
    public static void run() throws IOException{
    	int value,value2;
    	Heap theTree=new Heap(31);
    	boolean success;
    	theTree.insert(50);
    	theTree.insert(25);
    	theTree.insert(75);
    	theTree.insert(12);
    	theTree.insert(37);
    	theTree.insert(43);
    	theTree.insert(30);
    	theTree.insert(33);
    	theTree.insert(87);
    	theTree.insert(93);
    	theTree.insert(97);
    	theTree.insert(100);
    	
    	while(true){
    		System.out.println(" Enter:");
    		char choice=getChar();
    		switch(choice){
    		case 's':
    			theTree.display();
    			break;
    		case 'i':
    			System.out.println(" Enter value:");
    			value=getInt();
    			theTree.insert(value);
    			break;
    		case 'r':
    			if(!theTree.isEmpty()) theTree.remove();
    		    
    			break;
    		case 'c':
    			System.out.println(" Enter key");
    			value=getInt();
    			System.out.println(" Enter key");
    			value2=getInt();
    			success=theTree.change(value,value2);
    			if(success)System.out.println(" success");
    			else System.out.println(" Not success");
    			break;
    			default:
    				System.out.println(" Invalid entry");
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
