// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����

import java.io.*;
import java.util.*;

class SingleItem extends AlcoholVendingMachine
{

	private int soju=10000;
	private int beer=10000;
	private int somac=10000;
	private int cognac=10000;
	private int valentine=10000;
	private int tequila=10000;
	private int johnny=10000;
	private int chivas=10000;
	private int monkey=10000;
	
	
	@Override
	protected void alcoholReturn(int al)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();


		String result = "";
		
		switch (al)
		{
		case 1: result = "����"; break;
		case 2: result = "����"; break;
		case 3: result = "�Ҹ�"; break;
		case 4: result = "����"; break;
		case 5: result = "�߷�Ÿ�� 12"; break;
		case 6: result = "��ų��"; break;
		case 7: result = "���Ͽ�Ŀ ����"; break;
		case 8: result = "�ùٽ�����"; break;
		case 9: result = "��Ű ���"; break;

		}

		System.out.println(result);
		map.put(result,300);
		//System.out.println(map);
	}
	
	@Override
	protected void list()
	{	
      System.out.printf("1 %s              (%d��)    ","����",7500);
      System.out.printf("2 %s       (%d��)    ","����",9500);
      System.out.printf("3 %s      (%d��)\n","�Ҹ�",8500);
      System.out.printf("4 %s              (%d��)   ","����",18500);
      System.out.printf("5 %s (%d��)   ","�߷�Ÿ��12",11500);
      System.out.printf("6 %s    (%d��)\n","��ų��",10500);
      System.out.printf("7 %s (%d��)   ","���Ͽ�Ŀ ����",14500);
      System.out.printf("8 %s (%d��)   ","�ùٽ�����",12500);
      System.out.printf("9 %s (%d��)\n","��Ű ���",13500);
      
      System.out.println();
      		
	}

	@Override
	protected int change(int al)                         
	{
		
		int price = 0;
		
		switch (al)
		{
		case 1: price = 7500; break;
		case 2: price = 9500; break;
		case 3: price = 8500; break;
		case 4: price = 18500; break;
		case 5: price = 11500; break;
		case 6: price = 10500; break;
		case 7: price = 14500; break;
		case 8: price = 12500; break;
		case 9: price = 13500; break;
		}
		

		int changeMoney = getMoney() - price;

		while (changeMoney < 0)
		{
			System.out.println("�Է��� ���� �����մϴ�. �ٽ� �Է����ּ���.");
			System.out.println();

			changeMoney = getMoney() - price;
		}

		return changeMoney;


	}


	protected void stock(int al)						// ��� ������ �� ��� �������ִ� �޼ҵ�
	{
		int result = 0;
		
		switch (al)
		{
		case 1: result = soju-=300; break;
		case 2: result = beer-=300; break;
		case 3: result = somac-=300; break;
		case 4: result = cognac-=300; break;
		case 5: result = valentine-=300; break;
		case 6: result = tequila-=300; break;
		case 7: result = johnny-=300; break;
		case 8: result = chivas-=300; break;
		case 9: result = monkey-=300; break;
		}
		
		if (result==100)
		{
			System.out.println("������ ȣ�� �ٶ�(��� ����)");
		}
		System.out.println();
		
	}

	protected void alcoholRun()
	{
		Scanner sc = new Scanner(System.in);

		list();
		int al = alcoholChoose();
		alcoholReturn(al);
		stock(al);
		System.out.println("�ܵ� : " + change(al));
		
		System.out.println();
				
		System.out.print("���� �߰��� �����Ͻðڽ��ϱ�?(Y/N) : ");
		String add = sc.next();
		char check = add.charAt(0);

		if (check != 'y' && check != 'Y')
		{
			break;
		}
		
	}

}
