// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����

import java.io.*;
import java.util.*;

class SingleItem extends AlcoholVendingMachine
{
	private int soju=1000;
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
	protected void alcoholReturn(int al)
	{

		Map<String,Integer> map = new HashMap<String,Integer>();


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
		
		System.out.println(resultName);
		
		map.put(resultName,300);
		//System.out.println(map);

	}
	
	
	@Override
	protected void list()
	{	
		System.out.println();
		
		if (soju<=100)
		{
			System.out.printf("1 %s(����)              (%d��)    ","����",7500);
		}
		else if (soju>100)
		{
			System.out.printf("1 %s                    (%d��)    ","����",7500);
		}
		if (beer<=100)
		{
			System.out.printf("2 %s(����)       (%d��)    ","����",9500);
		}
		else if (beer>100)
		{
			System.out.printf("2 %s             (%d��)    ","����",9500);
		}
		if (somac<=100)
		{
			System.out.printf("3 %s(����)      (%d��)\n","�Ҹ�",8500);
		}
		else if (somac>100)
		{
			System.out.printf("3 %s            (%d��)\n","�Ҹ�",8500);
		}
		if (cognac<=100)
		{
			System.out.printf("4 %s(����)              (%d��)   ","����",18500);
		}
		else if (cognac>100)
		{
			System.out.printf("4 %s                    (%d��)   ","����",18500);
		}
		if (valentine<=100)
		{
			System.out.printf("5 %s(����) (%d��)   ","�߷�Ÿ��12",11500);
		}
		else if (valentine>100)
		{
			System.out.printf("5 %s       (%d��)   ","�߷�Ÿ��12",11500);
		}
		if (tequila<=100)
		{
			System.out.printf("6 %s(����)    (%d��)\n","��ų��",10500);
		}
		else if (tequila > 100)
		{
			System.out.printf("6 %s          (%d��)\n","��ų��",10500);
		}
		if (johnny<=100)
		{
			System.out.printf("7 %s(����) (%d��)   ","���Ͽ�Ŀ ����", 14500);
		}
		else if (johnny>100)
		{
			System.out.printf("7 %s       (%d��)   ","���Ͽ�Ŀ ����", 14500);
		}
		if (chivas<=100)
		{
			System.out.printf("8 %s(����) (%d��)   ","�ùٽ�����",12500);
		}
		else if (chivas > 100)
		{
			System.out.printf("8 %s       (%d��)   ","�ùٽ�����",12500);
		}
		if (monkey <= 100)
		{
			System.out.printf("9 %s(����) (%d��)\n","��Ű ���",13500);
		}
		else  if (monkey>100)
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
	
	
	
	@Override
	protected int alcoholChoose()												// ���� �����ϴ� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("���� �����Ͻÿ� : ");
			al = sc.nextInt();
			
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
			
			if (result >= 100)
			{
				alcoholReturn(al);
				System.out.printf("���� �ܷ� : %d\n", soju);
				return al;
			}
			
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
		
		
		}
		
	
		//�׽�Ʈ(Ȯ��)
		//System.out.printf("�� �ܷ� : %d\n", soju);
		//System.out.printf("�� �ܷ� : %d", beer);
		//System.out.printf("�� �ܷ� : %d\n", somac);
		
	
	}
	
	
	@Override
	protected void enterStock(int al)
	{
		soju = 10000;
		beer = 10000;
		somac = 10000;
		cognac = 10000;
		valentine = 10000;
		tequila = 10000;
		johnny = 10000;
		chivas = 10000;
		monkey = 10000;

		switch (al)
		{
		case 1: resultName = "����"; break;
		case 2: resultName = "����"; break;
		case 3: resultName = "�Ҹ�"; break;
		case 4: resultName = "����"; break;
		case 5: resultName = "�߷�Ÿ�� 12";break;
		case 6: resultName = "��ų��"; break;
		case 7: resultName = "���Ͽ�Ŀ ����";break;
		case 8: resultName = "�ùٽ�����"; break;
		case 9: resultName = "��Ű ���"; break;
		}

	    System.out.printf("%s�� 10L ä�������ϴ�. " , resultName);
	}
	
	
	@Override
	protected int alcoholRun()
	{
		list();
		int result = alcoholChoose();

		//alcoholReturn(al);
	
		return result;
	
	}



}


