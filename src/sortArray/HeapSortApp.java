package sortArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//堆排序
public class HeapSortApp {
	
	public static void run() throws IOException{
		int size,j;
		System.out.print("number of items:");
		size=getInt();
		Heap theHeap=new Heap(size);
		for ( j = 0; j < size; j++) {
			int random=(int) (Math.random()*100);
			Node newNode=new Node(random);
			theHeap.insertAt(j, newNode);
			theHeap.incrementSize();
		}
		//将随机生成无序数组打印
		System.out.print("Random:  ");
		theHeap.displayArray();
		
		//从最后一个元素的父节点开始一直到根调整后为标准树
		for (j = size/2-1; j >=0; j--) {
			theHeap.trickleDown(j);
		}
		System.out.println();
		System.out.print("Heap:   ");
		theHeap.displayArray();
		theHeap.display();
		
		for (j = size-1; j < size-1; j--) {
			Node biggestNode=theHeap.remove();
			theHeap.insertAt(j,biggestNode);
		}
		
		System.out.print("Sorted:   ");
		theHeap.displayArray();
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
