package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void run() throws IOException{
    	int value;
    	Tree theTree=new Tree();
    	theTree.insert(50, 1.2);
    	theTree.insert(25, 1.2);
    	theTree.insert(75, 1.2);
    	theTree.insert(12, 1.2);
    	theTree.insert(37, 1.2);
    	theTree.insert(43, 1.2);
    	theTree.insert(30, 1.2);
    	theTree.insert(33, 1.2);
    	theTree.insert(87, 1.2);
    	theTree.insert(93, 1.2);
    	theTree.insert(97, 1.2);
    	theTree.insert(100, 1.2);
    	
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
    			theTree.insert(value, 2);
    			break;
    		case 'f':
    			System.out.println(" Enter key:");
    			value=getInt();
    			Node found=theTree.find(value);
    			if(found!=null){
    				System.out.println(" Found "+found);
    				found.display();
    				System.out.println();
    			}else{
    				System.out.println(" Not Found");
    			}
    			break;
    		case 'd':
    			System.out.println(" Enter key");
    			value=getInt();
    			boolean diDelete=theTree.delete(value);
    			if(diDelete)System.out.println(" Delete");
    			else System.out.println(" Not delete");
    			break;
    		case 't':
    			System.out.println(" type 1,2,3");
    			value=getInt();
    			theTree.traverse(value);
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
