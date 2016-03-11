package test;

import element.LLink;
import element.SortedList;

public class SortedListTest {
	
    private static SortedList theList;
	public static void run(){
		theList=new SortedList();
		theList.insert(77);
		theList.displayList();
		theList.insert(44);
		theList.insert(66);
		theList.insert(55);
		theList.displayList();
		theList.remove();
		theList.remove();
		theList.displayList();
		
	}
	
	public static void runner(){
		int size=10;
		LLink[] link=new LLink[size];
		//���
		for (int i = 0; i < size; i++) {
			int n=(int) (Math.random()*99);//0--100
			LLink newLink=new LLink(n);
			link[i]=newLink;
		}
		//��ӡ��δ����
		for (int j = 0; j < size; j++) {
			System.out.print(link[j].dData+" ");
		}
		System.out.println();
		//����
		theList=new SortedList(link);
		//��ӡ
		theList.displayList();
		
		//�ź�����û�����
		for (int j = 0; j < size; j++) {
			link[j]=theList.remove();
		}
		for (int j = 0; j < size; j++) {
			System.out.print(link[j].dData+" ");
		}
		
		
	}
}
