package Application;

import hashchain.HashChainApp;
import heap.HeapApp;

import java.io.IOException;

import sortArray.HeapSortApp;

//�������ͣ��κ�һ���඼��һ���������ͣ���һ�����ݴ洢�ṹ����Ϊһ����ʱ����һ����������
//������˼���ǲ�����ϸ�ڵ�������ʵ��
//ջ�Ͷ��о��ǳ����������ͣ�ADT��
//���ȼ����� ����������ʵ�֣�ɾ�������O(1)��������
//��ʵ�����ȼ����У�����ɾ�����죨O(logN)��
//�ѣ���һ����������Ķ�����
	//1.��ȫ�Ķ�����,���������һ��ڵ㲻��Ҫ�����ģ�����ÿһ��������Ҷ�����������
	//2.��������������ʵ��
	//3.���е�ÿһ���ڵ㶼����ѵ����������ڵ�Ĺؼ��ִ��������ӽڵ�
//���������


//�������飺����ɾ�����������
//�������飺���룬ɾ���������ҿ�
//����:�����ɾ������������

//��������ÿ���ڵ�����������ӽڵ�(��ƽ����)
//�����б����Žڵ㹹��
//���ڵ㣺ÿ���ڵ㣨���˸�����ǡ����һ��������һ�ڵ��ϣ���һ�ڵ��Ϊ����ڵ�ĸ��ڵ�
//�ӽڵ㣺ÿ���ڵ㶼������һ��������������ӵ������ڵ㣬�������Щ�ڵ��Ϊ�����ӽڵ�
//Ҷ�ڵ㣺û���ӽڵ�Ľڵ�
//������ÿ���ڵ㶼������Ϊһ���Ӹ������������е�����ڵ㶼����������
public class App {

	public static void main(String[] args)throws IOException{
		//�������飬���Բ��ң����ֲ���
		//OrdArrayTest.run();
		//ð������
		//ArrayBubTest.run();
		//ѡ������
		//ArraySelTest.run();
		//��������
		//ArrayInsTest.run();
		//ջ
		//StackXTest.run();
		//��ת
		//StringReverserTest.reverser();
		//���ż��
		//BracletsTest.check();
		//����
		//QueueTest.run();
		//���ȼ�����
		//PriorityQueueTest.run();
		//����
		//LinkListTest.run();
		//˫������
		//FirstLastLinkTest.run();
		//����ջ
		//LinkStackTest.run();
		//����˫�˶���
		//LinkQueueTest.run();
		//��������
		//SortedListTest.run();
		//SortedListTest.runner();
		//˫������
		//DoubleLinkListTest.run();
		//���������
		//IteratorLinkListTest.run();
		//�ݹ���������
		//TriangleApp.run();
		//�ݹ�׳�
		//FactorialApp.run();
		//�ݹ��λ��
		//AnagramApp.run();
		//�ݹ���ֲ���
		//OrdArrayAppTest.run();
		//�ݹ麺ŵ��
		//TowersApp.run();
		//�鲢����
		//MergeSortApp.run();
		//ȡ���ݹ�
		//StackTriangleApp.run();
		//ջ�����ݹ�
		//StackOTriangleApp.run();
		//ϣ�����򣨻��ڲ�������
		//ShellSortApp.run();
		//��������
		//ArrayQuickApp.run();
		//��������2������������ȡ�м䣬С����ʹ�ò�������
		//ArrayQuickApp2.run();
		//������
		//TreeApp.run();
		//������������������ ƽ���� ����ƽ�⣺�ڵ㶼����ɫ������ɾ����ѭ������ɫ���й���
		//���ڵ�����Ǻ�ɫ
		//�ڵ��Ǻ�ɫ���ӽڵ�����Ǻ�ɫ�ģ���֮���Ǳ����
		//�Ӹ��ڵ����ӽڵ��ÿ��·�������������ͬ�����ĺڽڵ�    ��ɫ�߶�
		//��δʵ��
		
		//2-3-4�� ƽ���� �����
		//ÿ���ڵ������Դ��������������ڿս��
		//��Ҷ�ڵ� 1-2 2-3 3-4 ������������û���ӽڵ�
		//L:��ʾ�ӽڵ���� D�����������
		//��Ҷ�ڵ㣺L=D+1  
		//�����������ǲ���Ҷ�ڵ�
		//Tree234App.run();
		
		//��ϣ��O(1),�ײ����ݽṹΪ���飬����������������Ҳ����ٶȿ죬������С
		//ͨ��������ֵ
		//��ͻ����ͬ�ؼ��־�����ϣ���õ��������±�����ظ�
		//�����ͻ�����ŵ�ַ�� ������̽��  ����̽��  �ٹ�ϣ��        ����ַ��
		//����̽��
		 //HashTableApp.run();
		//�ٹ�ϣ
		//HashDoubleTableApp.run();
		//����ַ��
		//HashChainApp.run();
		//��
		//HeapApp.run();
		//������
		HeapSortApp.run();
	}
}
