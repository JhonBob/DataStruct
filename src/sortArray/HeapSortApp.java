package sortArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//������
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
		//������������������ӡ
		System.out.print("Random:  ");
		theHeap.displayArray();
		
		//�����һ��Ԫ�صĸ��ڵ㿪ʼһֱ����������Ϊ��׼��
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
