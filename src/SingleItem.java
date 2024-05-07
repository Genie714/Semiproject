// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����

import java.io.*;
import java.util.*;

class SingleItem extends AlcoholVendingMachine
{

	//Map<String,Integer> price = new HashMap<String,Integer>();

	
	//private int soju=1000;
	//private int beer=10000;
	//private int somac=10000;
	//private int cognac=10000;
	//private int valentine=10000;
	//private int tequila=10000;
	//private int johnny=10000;
	//private int chivas=10000;
	//private int monkey=10000;
	static int[] stock = {1000,10000,10000,10000,10000,10000,10000,10000,10000}; //1�� ���� 2�� ���� 3�� �Ҹ� 4�� ���� 5�� �߷�Ÿ�� 6�� ��ų��
	private int count=0;
	private int price=0;
	private int result=0;
	private int al;
	private String resultName;
	
	
	private static SingleItem instance;

	public static SingleItem getInstance()
	{
		if (instance == null)
		{
			instance = new SingleItem();
		}
		return instance;
	}
	
	
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
	protected String alcoholReturn(int al)
	{
		switch (al)
		{
		case 1: resultName = "����";
						count++;
	                    break;
		case 2: resultName = "����";
		                count++;
	                    break;
		case 3: resultName = "�Ҹ�";
		                count++;
	                    break;
		case 4: resultName = "����";
		                count++;
	                    break;
		case 5: resultName = "�߷�Ÿ�� 12";
		                count++;
	                    break;
		case 6: resultName = "��ų��";
		                count++;
	                    break;
		case 7: resultName = "���Ͽ�Ŀ ����";
		                count++;
	                    break;
		case 8: resultName = "�ùٽ�����"; 
		                count++;
	                    break;
		case 9: resultName = "��Ű ���";
		                count++;
	                    break;
		}
		
		return resultName;
		//System.out.println(resultName);
		
		//map.put(resultName,300);
		//System.out.println(map);

	}
	
	
	@Override
	protected void list()
	{	
		//Map<String,Integer> price = new HashMap<String,Integer>();

		//Map<String,Integer> price = new HashMap<String,Integer>();

		

		//map.put()
		
		System.out.println();
		
		if (stock[0]<=100)
		{
			System.out.printf("1 %s(����)              (%d��)    ","����",7500);
		}
		else if (stock[0]>100)
		{
			System.out.printf("1 %s                    (%d��)    ","����",7500);
		}
		if (stock[1]<=100)
		{
			System.out.printf("2 %s(����)       (%d��)    ","����",9500);
		}
		else if (stock[1]>100)
		{
			System.out.printf("2 %s             (%d��)    ","����",9500);
		}
		if (stock[2]<=100)
		{
			System.out.printf("3 %s(����)      (%d��)\n","�Ҹ�",8500);
		}
		else if (stock[2]>100)
		{
			System.out.printf("3 %s            (%d��)\n","�Ҹ�",8500);
		}
		if (stock[3]<=100)
		{
			System.out.printf("4 %s(����)              (%d��)   ","����",18500);
		}
		else if (stock[3]>100)
		{
			System.out.printf("4 %s                    (%d��)   ","����",18500);
		}
		if (stock[4]<=100)
		{
			System.out.printf("5 %s(����) (%d��)   ","�߷�Ÿ��12",11500);
		}
		else if (stock[4]>100)
		{
			System.out.printf("5 %s       (%d��)   ","�߷�Ÿ��12",11500);
		}
		if (stock[5]<=100)
		{
			System.out.printf("6 %s(����)    (%d��)\n","��ų��",10500);
		}
		else if (stock[5] > 100)
		{
			System.out.printf("6 %s          (%d��)\n","��ų��",10500);
		}
		if (stock[6]<=100)
		{
			System.out.printf("7 %s(����) (%d��)   ","���Ͽ�Ŀ ����", 14500);
		}
		else if (stock[6]>100)
		{
			System.out.printf("7 %s       (%d��)   ","���Ͽ�Ŀ ����", 14500);
		}
		if (stock[7]<=100)
		{
			System.out.printf("8 %s(����) (%d��)   ","�ùٽ�����",12500);
		}
		else if (stock[7] > 100)
		{
			System.out.printf("8 %s       (%d��)   ","�ùٽ�����",12500);
		}
		if (stock[8] <= 100)
		{
			System.out.printf("9 %s(����) (%d��)\n","��Ű ���",13500);
		}
		else  if (stock[8]>100)
		{
			System.out.printf("9 %s       (%d��)\n","��Ű ���",13500);
		}
		
		
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


	
	/*
	@Override
	protected int stock(int al)						
	{
		Scanner sc = new Scanner(System.in);
		
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


		if (result < 100)								
		{                                                                                      
			return result;                                                                      
		}
		
		//�׽�Ʈ(Ȯ��)
		System.out.printf("�� �ܷ� : %d\n", soju);
		//System.out.printf("�� �ܷ� : %d", beer);
		//System.out.printf("�� �ܷ� : %d\n", somac);
		
		
		
		return result;
		
	}
	*/
	
	
	
	@Override
	protected void stock(int al)												// ���� �����ϴ� �޼ҵ�
	{
		if(stock[al-1]<100)
		{
			System.out.print("������ ��ǰ�� �Դϴ�.");
			return;
		}
		/*
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
		*/
		// ����
		stock[al-1] -= 300;
		//alcoholReturn(al);
		System.out.printf("���� �ܷ� : %d\n", stock[al-1]);
		//return ���;
		
		/*
		if (result < 100)
		{	
			switch (al)
			{
			case 1: result = soju+=300; break;
			case 2: result = beer+=300; break;
			case 3: result = somac+=300; break;
			case 4: result = cognac+=300; break;
			case 5: result = valentine+=300; break;
			case 6: result = tequila+=300; break;
			case 7: result = johnny+=300; break;
			case 8: result = chivas+=300; break;
			case 9: result = monkey+=300; break;
			}
		
			System.out.printf("�� �ܷ� : %d\n", soju);
			System.out.println("�����Դϴ�. �ٸ� ���� �����ϼ���.");
			return -1;
		}
		*/
		
		
		
		
	
		//�׽�Ʈ(Ȯ��)
		//System.out.printf("�� �ܷ� : %d\n", soju);
		//System.out.printf("�� �ܷ� : %d", beer);
		//System.out.printf("�� �ܷ� : %d\n", somac);
		
	
	}
	
	
	@Override
	protected void enterStock()
	{
		System.out.printf("���� %d�� ä�����ϴ�. ", 10000-stock[0]);
		System.out.printf("���� %d�� ä�����ϴ�. ", 10000-stock[1]);
		System.out.printf("�Ҹ� %d�� ä�����ϴ�. ", 10000-stock[2]);
		System.out.printf("���� %d�� ä�����ϴ�. ", 10000-stock[3]);
		System.out.printf("�߷�Ÿ��12 %d�� ä�����ϴ�. ", 10000-stock[4]);
		System.out.printf("��ų�� %d�� ä�����ϴ�. ", 10000-stock[5]);
		System.out.printf("���Ͽ�Ŀ ���� %d�� ä�����ϴ�. ", 10000-stock[6]);
		System.out.printf("�ùٽ����� %d�� ä�����ϴ�. ", 10000-stock[7]);
		System.out.printf("��Ű��� %d�� ä�����ϴ�. ", 10000-stock[8]);
		stock[0] = 10000;
		stock[1] = 10000;
		stock[2] = 10000;
		stock[3] = 10000;
		stock[4] = 10000;
		stock[5] = 10000;
		stock[6] = 10000;
		stock[7] = 10000;
		stock[8] = 10000;

	}
	
	
	


}


