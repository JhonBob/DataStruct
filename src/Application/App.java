package Application;

import java.io.IOException;

import olement.AnagramApp;
import olement.FactorialApp;
import olement.IteratorLinkListTest;
import olement.LinkQueue;
import olement.OrdArrayApp;
import olement.OrdArrayAppTest;
import olement.StackOTriangleApp;
import olement.StackTriangleApp;
import olement.TowersApp;
import olement.TriangleApp;

import element.DArray;
import element.DoubleLinkList;
import element.FirstLastLink;
import element.PriorityQueue;

import test.ArrayQuickApp;
import test.ArrayQuickApp2;
import test.DoubleLinkListTest;
import test.FirstLastLinkTest;
import test.LinkListTest;
import test.LinkQueueTest;
import test.LinkStackTest;
import test.MergeSortApp;
import test.PriorityQueueTest;
import test.QueueTest;
import test.ShellSortApp;
import test.SortedListTest;
import tree.TreeApp;
import tree234.Tree234App;

//数据类型：任何一个类都是一种数据类型，当一个数据存储结构表现为一个类时就是一种数据类型
//抽象：意思就是不考虑细节的描述和实现
//栈和队列就是抽象数据类型（ADT）

//无序数组：查找删除慢，插入快
//有序数组：插入，删除慢，查找快
//链表:插入和删除慢，查找慢

//二叉树：每个节点最多有两个子节点(非平衡树)
//树：有边连着节点构成
//父节点：每个节点（除了根）都恰好又一边连到另一节点上，上一节点成为下面节点的父节点
//子节点：每个节点都可能有一条或多条向下连接到其他节点，下面的这些节点成为它的子节点
//叶节点：没有子节点的节点
//子树：每个节点都可以作为一个子根，它和它所有的子孙节点都含在子树中
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
		//FirstLastLinkTest.run();
		//链表栈
		//LinkStackTest.run();
		//链表双端队列
		//LinkQueueTest.run();
		//有序链表
		//SortedListTest.run();
		//SortedListTest.runner();
		//双向链表
		//DoubleLinkListTest.run();
		//链表迭代器
		//IteratorLinkListTest.run();
		//递归三角数字
		//TriangleApp.run();
		//递归阶乘
		//FactorialApp.run();
		//递归变位字
		//AnagramApp.run();
		//递归二分查找
		//OrdArrayAppTest.run();
		//递归汉诺塔
		//TowersApp.run();
		//归并排序
		//MergeSortApp.run();
		//取消递归
		//StackTriangleApp.run();
		//栈消除递归
		//StackOTriangleApp.run();
		//希尔排序（基于插入排序）
		//ShellSortApp.run();
		//快速排序
		//ArrayQuickApp.run();
		//快速排序2，（三项数据取中间，小划分使用插入排序）
		//ArrayQuickApp2.run();
		//二叉树
		//TreeApp.run();
		//红黑树特殊二叉搜索树 平衡树 纠正平衡：节点都有颜色，插入删除遵循保持颜色排列规则
		//根节点必须是黑色
		//节点是红色，子节点必须是黑色的，反之不是必须的
		//从根节点或空子节点的每条路径，必须包含相同数量的黑节点    黑色高度
		//还未实现
		
		//2-3-4树 平衡树 多叉树
		//每个节点最多可以存三个数，不存在空结点
		//非叶节点 1-2 2-3 3-4 可以有数据项没有子节点
		//L:表示子节点个数 D：数据项个数
		//非叶节点：L=D+1  
		//插入数据总是插在叶节点
		//Tree234App.run();
		//哈希表：O(1),底层数据结构为数组，不能有序遍历，查找插入速度快，可扩大小
		//通过键来找值
		//冲突：不同关键字经过哈希化得到的数组下标出现重复
		//解决冲突：开放地址法 （线性探测 二次探测  在哈希）        链地址法
	}
}
