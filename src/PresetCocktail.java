// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����

import java.io.*;
import java.util.*;

class PresetCocktail extends AlcoholVendingMachine
{
	private int vodka=10;
	private int gin=10000;
	private int vermouth=10000;
    private int campari=10000;
	private int amaretto=10000;
	private int jgermeister=10000;
	private int mojito=10000;
	private int whiterum=10000;
	private int bluecuracao=10000;
	private int orangejuice=10000;
	private int limejuice=10000;
	private int pinejuice=10000;
	private int lemonjuice=10000;
	private int sparklingwater=10000;
	private int redbull=10000;
	private int olive=10000;
	int count=0;
	int price = 0;
	int al;
	String resultName = "";

	private static PresetCocktail instance;

	public static PresetCocktail getInstance()
	{
		if (instance == null)
		{
			instance = new PresetCocktail();
		}
		return instance;
	}
	

	@Override
	protected int alcoholChoose()
	{
		// ���� �����ϴ� �޼ҵ�
	
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �����Ͻÿ� : ");
		al = sc.nextInt();
		return al;
	

	}
	
	
	@Override
	protected int alcoholPrice(int al)						
	{
		
		switch (al)
		{
		case 1: price = 12500;
				count++;
				break;
		case 2: price = 23500;
				count++;
				break;
		case 3: price = 21500;
				count++;
				break;
		case 4: price = 18500;
				count++;
				break;
		case 5: price = 16500;
				count++;
				break;
		case 6: price = 11500;
				count++;
				break;
		case 7: price = 18500;
				count++;
				break;
		case 8: price = 11500;
				count++;
				break;
		case 9: price = 9500;
				count++;
				break;
		case 10: price = 14500;
				count++;
				break;
		}

		return price;
	
	}
	
	
	@Override
	protected String alcoholReturn(int al)
	{

		//Map<String,Integer> map = new HashMap<String,Integer>();

		String result = "";
		switch (al)
		{
		case 1: result = "��ť�� ����̹�"; break;
		case 2: result = "�ױ׷δ�"; break;
		case 3: result = "�跿"; break;
		case 4: result = "īŸ���ý�"; break;
		case 5: result = "�� ����"; break;
		case 6: result = "���� ��"; break;
		case 7: result = "����� ��Ƽ��"; break;
		case 8: result = "�����"; break;
		case 9: result = "������"; break;
		case 10: result = "����Ͽ���"; break;
		}
		
		//System.out.println(result);

		//map.put(result,300);
		//System.out.println(map);
		return result;
	}
	
	
	@Override
	protected void list()
	{	
		System.out.println();

		if (vodka < 100 || orangejuice < 200)
		{
			System.out.printf("1 %s(����) (%5d��)   ","��ť�� ����̹�",12500);
		}
		else if (vodka > 100 && orangejuice > 200)
		{
			System.out.printf("1 %s       (%5d��)   ","��ť�� ����̹�",12500);
		}
		if (gin < 100 || vermouth < 100 || campari < 100)
		{
			System.out.printf("2 %s(����)  (%5d��)   ","�ױ׷δ�",23500);
		}
		else if (gin > 100 && vermouth > 100 && campari > 100)
		{
			System.out.printf("2 %s        (%5d��)   ","�ױ׷δ�",23500);
		}
		if (gin < 225 || limejuice < 75)
		{
			System.out.printf("3 %s(����)    (%5d��) \n","�跿",21500);
		}
		else if (gin > 225 && limejuice > 75)
		{
			System.out.printf("3 %s          (%5d��) \n","�跿",21500);
		}
		if (whiterum < 180 || limejuice < 60 || amaretto < 60)
		{
			System.out.printf("4 %s(����)      (%5d��)   ","īŸ���ý�",18500);
		}
		else if (whiterum > 180 && limejuice > 60 && amaretto > 60)
		{
			System.out.printf("4 %s            (%5d��)   ","īŸ���ý�",18500);
		}
		if (gin < 130 || sparklingwater < 85 || lemonjuice < 85)
		{
			System.out.printf("5 %s(����)   (%5d��)   ","�� ����",16500);
		}
		else if (gin > 130 && sparklingwater > 85 && lemonjuice > 85)
		{
			System.out.printf("5 %s         (%5d��)   ","�� ����",16500);
		}
		if (jgermeister < 75 || redbull < 225)
		{
			System.out.printf("6 %s(����) (%5d��) \n","���� ��",11500);
		}
		else if (jgermeister > 75 && redbull > 225)
		{
			System.out.printf("6 %s       (%5d��) \n","���� ��",11500);
		}
		if (gin < 75 || vermouth < 225 || olive < 1)
		{
			System.out.printf("7 %s(����)   (%5d��)   ","����� ��Ƽ��",18500);
		}
		else if (gin > 75 && vermouth > 225 && olive > 1)
		{
			System.out.printf("7 %s         (%5d��)   ","����� ��Ƽ��",18500);
		}
		if (gin < 75 || sparklingwater < 225)
		{
			System.out.printf("8 %s(����)    (%5d��)   ","�����",11500);
		}
		else if (gin > 75 && sparklingwater > 225)
		{
			System.out.printf("8 %s          (%5d��)   ","�����",11500);
		}
		if (mojito < 75 || sparklingwater < 225)
		{
			System.out.printf("9 %s(����)  (%5d��) \n","������",9500);
		}
		else if (mojito > 75 && sparklingwater > 225)
		{
			System.out.printf("9 %s        (%5d��) \n","������",9500);
		}
		if (whiterum < 100 || bluecuracao < 50 || lemonjuice < 50 || pinejuice < 100)
		{
			System.out.printf("10 %s(����)     (%5d��)\n","����Ͽ���",14500);
		}
		else if (whiterum > 100 && bluecuracao > 50 && lemonjuice > 50 && pinejuice > 100)
		{
			System.out.printf("10 %s           (%5d��)\n","����Ͽ���",14500);
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
	protected void stock(int al)						// ��� ������ �� ��� �������ִ� �޼ҵ�
	{
	    switch(al) 
	    {
			case 1:
				vodka -= 100;
				orangejuice -= 200;
				break;
	       
		    case 2:
				gin -= 100;
				vermouth -= 100;
				campari -= 100;
				break;

			case 3:
				gin -= 225;
				limejuice -= 75;
				break;
			
			case 4:
				whiterum -= 180;
				limejuice -= 60;
				amaretto -= 60;
				break;
			
			case 5:
				gin -= 130;
				sparklingwater -= 85;
				lemonjuice -= 85;
				break;

			case 6:
				jgermeister -= 75;
				redbull -= 225;
				break;
	        
			case 7:
				gin -= 75;
				vermouth -= 225;
				olive -= 1;
				break;

			case 8:
				gin -= 75;
				sparklingwater -= 225;
				break;
				
			case 9:
				mojito -= 75;
				sparklingwater -= 225;
				break;
				
			case 10:
				whiterum -= 100;
				bluecuracao -= 50;
				lemonjuice -= 50;
				pinejuice -= 100;;
				break;
		}

		
		//�׽�Ʈ(Ȯ��)
		System.out.printf("�� �ܷ� : %d", vodka);
		System.out.printf("�� �ܷ� : %d", orangejuice);
		System.out.printf("�� �ܷ� : %d", gin);
		System.out.printf("�� �ܷ� : %d", vermouth);
		System.out.printf("�� �ܷ� : %d\n", campari);
	
      

	  	if (al==1)
		{
			if (vodka < 100 || orangejuice < 200)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
				
				//return -1;
			}
		}

		if (al==2)
		{
			if (gin < 100 || vermouth < 100 || campari < 100)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
		
		if (al==3)
		{
			if (gin < 225 || limejuice < 75)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
		
		if (al==4)
		{
			if (whiterum < 180 || limejuice < 60 || amaretto < 60)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
		
		if (al==5)
		{
			if (gin < 130 || sparklingwater < 85 || lemonjuice < 85)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
      
		if (al==6)
		{
			if (jgermeister < 75 || redbull < 225)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
      
		if (al==7)
		{
			if (gin < 75 || vermouth < 225 || olive < 1)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
      
		if (al==8)
		{
			if (gin < 75 || sparklingwater < 225)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
      
		if (al==9)
		{
			if (mojito < 75 || sparklingwater < 225)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
      
		if (al==10)
		{
			if (whiterum < 100 || bluecuracao < 50 || lemonjuice < 50 || pinejuice < 100)
			{
				System.out.println("����(��� ������ �׸� ���(3) �� �����ֽʽÿ�)");
			
				//return -1;
			}
		}
		
		//return -2;
  
	}

	@Override
	protected void enterStock()
	{	
		vodka=10000;
	    gin=10000;
	    vermouth=10000;
        campari=10000;
	    amaretto=10000;
	    jgermeister=10000;
	    mojito=10000;
	    whiterum=10000;
	    bluecuracao=10000;
	    orangejuice=10000;
	    limejuice=10000;
	    pinejuice=10000;
	    lemonjuice=10000;
	    sparklingwater=10000;
	    redbull=10000;
	    olive=10000;

		
    }

/*
	@Override
	protected int alcoholRun()
	{
		list();
		int al = alcoholChoose();

		alcoholReturn(al);
		
		return al;
	
	}

*/
}