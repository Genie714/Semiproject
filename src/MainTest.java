/*����
 * ��ü�ҷ����� or ��ü �����ϱ�
 * ���Ǳ� �ȳ� �� ���̿����� ���÷���
 * Alcohol Ŭ���� ����
 * �귿 Ŭ���� ����
 * ��÷�� ��ȯ
 * ��ü �������� */

import java.util.Scanner;

public class MainTest
{
	public static void main(String[] args) throws Exception
	{
		// ��ü �ҷ����� �� �̱��� �ӽ� Ŭ���� �ν��Ͻ� ����
//		LoadObject lo = new LoadObject();
//		lo.loadObject();
		
		
		//���Ǳ� �ȳ� �� ���� ������ ���÷���
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		print();
		pmd.showTotalPrize();
		
		
		//Alcohol Ŭ���� ����(Alcohol ���� �ٿ��ֱ�)
		SingleItem ob1 = new SingleItem();
		PresetCocktail ob2 = new PresetCocktail();
		CustomCocktail ob3 = new CustomCocktail();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3���� ���� �� �ϳ��� �����ϼ��� (�� ��ǰ / �� ������(Ĭ����) / �� Ŀ����(Ĭ����) : ");
		int a = sc.nextInt();
		
		if(a==1)
		{
			ob1.list();
			int al = ob1.alcoholChoose();
			ob1.alcoholReturn(al);
			ob1.stock(al);
			System.out.println("�ܵ� : " + ob1.change(al));
			// �ܵ� ��ȯ //�귿 Ŭ���� ����
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob1.change(al));
		}
		
		if(a==2)
		{	
			ob2.list();
			int al = ob2.alcoholChoose();
			ob2.alcoholReturn(al);
			ob2.stock(al);
			System.out.println("�ܵ� : " + ob2.change(al));
			// �ܵ� ��ȯ //�귿 Ŭ���� ����
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob2.change(al));
		}
		
		if(a==3)
		{
			ob3.list();
			int price = ob3.alcoholChoose();
			System.out.println("�ܵ� : " + ob3.change(price));
			// �ܵ� ��ȯ //�귿 Ŭ���� ����
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob3.change(price));
		}
		
		//��÷�� ��ȯ
		
		
		
		//��ü �������� �� �̱���
		//SaveObject so = new SaveObject();
		
		//so.saveObject(ad,buy,alc);
		
	}
	
	private static void print()
	{
		System.out.println("=====================================");
		System.out.println(" ���� 500�귿 Ĭ���� ���Ǳ� ����");
		System.out.println("=====================================");
	}
}