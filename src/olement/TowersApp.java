package olement;
//�ݹ麺ŵ��
public class TowersApp {
	static int nDisks=6;
	public static void run(){
		doTowers(nDisks, 'A', 'B', 'C');
	}
	
	public static void doTowers(int topN,char from,char inter,char to ){
		if(topN==1)
			System.out.println("Disk 1 "+from+" to "+to);
		else{
			//�Ϸ��������ƶ����м���
			doTowers(topN-1, from, to,inter);
			System.out.println("Disk "+topN+" "+from+" to "+to);
			doTowers(topN-1,inter, from, to);
		}
	}
}
