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
	private int count=0;
	private int price=0;
	private int al;
	
	
	
	@Override
	protected int alcoholPrice(int al)					
	{
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
			
		return price;
		  	
	}


	@Override
	protected void alcoholReturn(int al)
	{

		Map<String,Integer> map = new HashMap<String,Integer>();


		String result = "";
		
		switch (al)
		{
		case 1: result = "����";
						count++;
	                    break;
		case 2: result = "����";
		                count++;
	                    break;
		case 3: result = "�Ҹ�";
		                count++;
	                    break;
		case 4: result = "����";
		                count++;
	                    break;
		case 5: result = "�߷�Ÿ�� 12";
		                count++;
	                    break;
		case 6: result = "��ų��";
		                count++;
	                    break;
		case 7: result = "���Ͽ�Ŀ ����";
		                count++;
	                    break;
		case 8: result = "�ùٽ�����"; 
		                count++;
	                    break;
		case 9: result = "��Ű ���";
		                count++;
	                    break;
		}
		
		System.out.println(result);
		
		map.put(result,300);
		//System.out.println(map);

	}
	
	
	@Override
	protected void list()
	{	
		System.out.println();
		
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
	protected int change(int price)                         
	{
		int changeMoney = getMoney() - price;

		while (changeMoney < 0)
		{
			System.out.println("�Է��� ���� �����մϴ�. �ٽ� �Է����ּ���.");
			System.out.println();

			enterMoney();
			changeMoney = getMoney() - price;
		}

		return changeMoney;

	}


	@Override
	protected int stock(int al)						
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
		
		//�׽�Ʈ(Ȯ��)
		//System.out.printf("�� �ܷ� : %d", result);
		
		
		if (result==100)
		{
			System.out.println("����");
			
			return -1;
		}
		
		return -2;
		
	}
	
	
	@Override
	protected int alcoholRun()
	{
		list();
		int al = alcoholChoose();
		int ex = stock(al);
		if (ex == -1)
		{
			System.exit(-1);
		}
		alcoholReturn(al);
		
		return al;
	}



}
