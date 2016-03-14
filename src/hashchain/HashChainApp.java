package hashchain;

import hashdouble.DataItem;
import hashdouble.HashDoubleTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashChainApp {
	public static void run() throws IOException{
		Link aDataItem;
		int aKey,size,n;
		System.out.println(" Enter size of table:");
		size=getInt();
		System.out.println(" Enter initial number of item:");
		n=getInt();
    	HashTable hashTable=new HashTable(size);
    	for (int j = 0; j < n; j++) {
			aKey=(int) (Math.random()*100*size);
			aDataItem=new Link(aKey);
			hashTable.insert(aDataItem);
		}

    	
    	while(true){
    		System.out.println(" Enter:");
    		char choice=getChar();
    		switch(choice){
    		case 's':
    			hashTable.displayTable();
    			break;
    		case 'i':
    			System.out.println(" Enter value:");
    			aKey=getInt();
    			aDataItem=new Link(aKey);
    			hashTable.insert(aDataItem);
    			break;
    		case 'd':
    			System.out.println(" Enter value to delete:");
    			aKey=getInt();
    			hashTable.delete(aKey);
    			break;
    		case 'f':
    			System.out.println(" Enter key to find:");
    			aKey=getInt();
    			aDataItem=hashTable.find(aKey);
    			if(aDataItem!=null){
    				System.out.println(" Found "+aKey);
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
