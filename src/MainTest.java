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
        //LoadObject lo = new LoadObject();
        //lo.loadObject();
		
		
		//���Ǳ� �ȳ� �� ���� ������ ���÷���
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		int a = print();
		pmd.showTotalPrize();
		

		
		//Alcohol Ŭ���� ����(Alcohol ���� �ٿ��ֱ�)
		SingleItem ob1 = new SingleItem();
		PresetCocktail ob2 = new PresetCocktail();
		CustomCocktail ob3 = new CustomCocktail();

		
		if(a==1)
		{
			int al = ob1.alcoholRun();
			// �ܵ� ��ȯ //�귿 Ŭ���� ����
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob1.change(al),pmd);
		}
		
		if(a==2)
		{	
			
			int al = ob2.alcoholRun();
			// �ܵ� ��ȯ //�귿 Ŭ���� ����
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob2.change(al),pmd);
		}
		
		if(a==3)
		{
			int al = ob3.alcoholRun();
			// �ܵ� ��ȯ //�귿 Ŭ���� ����
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob3.change(al),pmd);

		}
		
		//��÷�� ��ȯ
		
		
		
		//��ü �������� �� �̱���
		//SaveObject so = new SaveObject();
		
		//so.saveObject(ad,buy,alc);
		
	}
	

	private static int print()
	{
		System.out.println("=====================================");
		System.out.println(" ���� 500�귿 Ĭ���� ���Ǳ� ����");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
		System.out.print("3���� ���� �� �ϳ��� �����ϼ��� (�� ��ǰ / �� ������(Ĭ����) / �� Ŀ����(Ĭ����) : ");
		int a = sc.nextInt();

		return a;

		

	}
}