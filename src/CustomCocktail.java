// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����

import java.io.*;
import java.util.*;

class CustomCocktail extends AlcoholVendingMachine
{
   
	private int vodka=10000;
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
	int count=0;
	int price=0;
	int priceAdd=0;
	int al;
	int b;
	int c;
   
   
	@Override
	protected int alcoholPrice(int al)
	{
	   return b;
	}
	
	@Override
	protected int stock(int al)
	{
		return c;	
	}
   
	@Override
	protected int alcoholChoose()						// CustomCocktail Ŭ������ �� �����ϴ� �޼ҵ� ���� Ŭ������ ���� ����
	{	
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int shot;
		int shotTot = 0;
		
		while(shotTot != 10)
		{   
			
			System.out.print("���� �����Ͻÿ� : ");
			al = sc.nextInt();
         
			System.out.print("�߰��� Shot : ");
			shot = sc.nextInt();
         
			shotTot += shot;

			if (shot < 1)
			{
				System.out.println("�� 10 Shot�� �־�� ���� �����˴ϴ�. ��� �Է��ϼ���.");
			}
         
			if (shotTot<=10)
			{
				switch (al)
				{
				case 1: price = 2250*shot;break;
				case 2: price = 2550*shot; break;
				case 3: price = 1650*shot; break;
				case 4: price = 2850*shot; break;
				case 5: price = 1650*shot; break;
				case 6: price = 2250*shot; break;
				case 7: price = 1650*shot; break;
				case 8: price = 2250*shot; break;
				case 9: price = 2250*shot; break;
				case 10: price = 750*shot; break;
				case 11: price = 1050*shot; break;
				case 12: price = 750*shot; break;
				case 13: price = 1050*shot; break;
				case 14: price = 750*shot; break;
				case 15: price = 750*shot; break;
				}
			
				priceAdd += price;

				
				
				switch (al)
				{
				case 1: result = vodka-=30*shot; break;
				case 2: result = gin-=30*shot; break;
				case 3: result = vermouth-=30*shot; break;
				case 4: result = campari-=30*shot; break;
				case 5: result = amaretto-=30*shot; break;
				case 6: result = jgermeister-=30*shot; break;
				case 7: result = mojito-=30*shot; break;
				case 8: result = whiterum-=30*shot; break;
				case 9: result = bluecuracao-=30*shot; break;
				case 10: result = orangejuice-=30*shot; break;
				case 11: result = limejuice-=30*shot; break;
				case 12: result = pinejuice-=30*shot; break;
				case 13: result = lemonjuice-=30*shot; break;
				case 14: result = sparklingwater-=30*shot; break;
				case 15: result = redbull-=30*shot; break;
				}
				
				//�׽�Ʈ(Ȯ��)
				//System.out.printf("�� �ܷ� : %d", result);

				if (result==100)
				{
					System.out.println("������ ȣ�� �ٶ�(��� ����)");
					return -1;
				}
				System.out.println();
				
				alcoholReturn(al);
				System.out.printf("�� �� : %d\n", shot);
				
					 
			} // close if
   
         
			if (shotTot>10)
			{
				System.out.println("shot�� �� 10���� �ʰ��Ͽ����ϴ�. �ٽ� �Է��ϼ���.");
				System.out.println();

				shotTot -= shot;
         
			}
         
   
		} // close while
      
      
		return priceAdd;

  
	}
	
	// CustomCocktail Ŭ������ ��������� stock�޼ҵ� ��� alcoholChoose�޼ҵ� �� while���� ���� 
   
   

	@Override
	protected void alcoholReturn(int al)
	{
		Map<String,Integer> map = new HashMap<String,Integer>();

		String result = "";
      
		switch (al)
		{
		case 1: result = "����ī";
						count++;
						break;
		case 2: result = "��";
						count++;
						break;
		case 3: result = "������Ʈ";
						count++;
						break;
		case 4: result = "į�ĸ�"; 
						count++;
						break;
		case 5: result = "�Ƹ�����";
						count++;
						break;
		case 6: result = "���� ���̽���";
						count++;
						break;
		case 7: result = "������";
						count++;
						break;
		case 8: result = "ȭ��Ʈ ��";
						count++;
						break;
		case 9: result = "��� ť���";
						count++;
						break;
		case 10: result = "�������ֽ�";
						count++;
						break;
		case 11: result = "�����ֽ�";
						count++;
						break;
		case 12: result = "���ξ����ֽ�";
						count++;
						break;
		case 13: result = "���� �ֽ�";
						count++;
						break;
		case 14: result = "ź���";
						count++;
						break;
		case 15: result = "�����";
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
		System.out.println("1shot (30ml)");
		System.out.println();
		System.out.printf("1 %s      (%d��) ","����ī",2250);
		System.out.printf("2 %s        (%d��)","��",2550);
		System.out.printf("  3 %s      (%d��) \n","������Ʈ",1650);
		System.out.printf("4 %s      (%d��) ","į�ĸ�",2850);
		System.out.printf("5 %s  (%d��) ","�Ƹ�����",1650);
		System.out.printf(" 6 %s (%d��) \n","���� ���̽���",2250);
		System.out.printf("7 %s      (%d��) ","������",1650);
		System.out.printf("8 %s (%d��) ","ȭ��Ʈ ��",2250);
		System.out.printf(" 9 %s   (%d��) \n","��� ť���",2250);
		System.out.printf("10 %s (%d��) ","�������ֽ�",750);
		System.out.printf(" 11 %s (%d��) ","�����ֽ�",1050);
		System.out.printf(" 12 %s (%d��) \n","���ξ����ֽ�",750);
		System.out.printf("13 %s   (%d��) ","�����ֽ�",750);
		System.out.printf(" 14 %s   (%d��) ","ź���",750);
		System.out.printf("  15 %s       (%d��)\n ","�����",2250);
      
		System.out.println();

	}


	@Override
	protected int change(int priceAdd)
	{
		int changeMoney = getMoney() - priceAdd;

		while (changeMoney < 0)
		{
			System.out.println("�Է��� ���� �����մϴ�. �ٽ� �Է����ּ���.");
			System.out.println();

			enterMoney();
			changeMoney = getMoney() - priceAdd;
		}

		return changeMoney;

	}


	@Override
	protected int alcoholRun()
	{
		list();
		int priceAdd3 = alcoholChoose();
		if (priceAdd3 == -1)
		{
			System.exit(-1);
		}
		
		return priceAdd3;
		
	}
	
	
	
	
	
	// Ŀ����Ĭ���� ���� �ȿ��� ������ �ַ�,���ַ��� �������� �̾� ���յǴ� ���� Ŀ����Ĭ����...... �����................
   

   
   
   
}