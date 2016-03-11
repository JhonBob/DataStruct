package Application;

import java.io.IOException;

import element.FirstLastLink;
import element.PriorityQueue;

import test.FirstLastLinkTest;
import test.LinkListTest;
import test.PriorityQueueTest;
import test.QueueTest;

//数据类型：任何一个类都是一种数据类型，当一个数据存储结构表现为一个类时就是一种数据类型
//抽象：意思就是不考虑细节的描述和实现
//栈和队列就是抽象数据类型（ADT）
public class App {

	public static void main(String[] args)throws IOException{
		//有序数组，线性查找，二分查找
		//OrdArrayTest.run();
		//冒泡排序
		//ArrayBubTest.run();
		//选择排序
		//ArraySelTest.run();
		//插入排序
		//ArrayInsTest.run();
		//栈
		//StackXTest.run();
		//反转
		//StringReverserTest.reverser();
		//括号检查
		//BracletsTest.check();
		//队列
		//QueueTest.run();
		//优先级队列
		//PriorityQueueTest.run();
		//链表
		//LinkListTest.run();
		//双端链表
		FirstLastLinkTest.run();
	}
}
