// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����

import java.util.Scanner;

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
	private int orangejuice=10000;
	private int limejuice=10000;
	private int pinejuice=10000;
	private int lemonjuice=10000;
	private int sparklingwater=10000;
	private int redbull=10000;
	private int bluecuracao=10000;
	int price=0;
	int al;
	int shot;
	
	
	@Override
	protected int alcoholChoose()						// ���� �����ϴ� �޼ҵ�
	{

		Scanner sc = new Scanner(System.in);
		
		int shotTot = 0;
		
		while(shotTot != 10)
		{	
			System.out.print("���� �����Ͻÿ� : ");
			al = sc.nextInt();
			alcoholReturn(al);
			System.out.print("�߰��� Shot : ");
		    shot = sc.nextInt();
			shotTot += shot;

			if (shot < 1)
			{
				System.out.println("�ٸ� ���� �Է��Ͻðڽ��ϱ�? (�� 10 Shot�� �־�� ���� �����˴ϴ�.)");
			}
			if (shotTot>10)
			{
				System.out.println("�ٸ� ���� �Է��Ͻðڽ��ϱ�? (shot�� �� 10���� �ʰ��Ͽ����ϴ�. �ٽ� �Է��ϼ���.)");
				shotTot -= shot;
			}

			
			switch (al)
			{
			case 1: price += 2250*shot;break;
			case 2: price += 2550*shot; break;
			case 3: price += 1650*shot; break;
			case 4: price += 2850*shot; break;
			case 5: price += 1650*shot; break;
			case 6: price += 2250*shot; break;
			case 7: price += 1650*shot; break;
			case 8: price += 2250*shot; break;
			case 9: price += 2250*shot; break;
			case 10: price += 750*shot; break;
			case 11: price += 1050*shot; break;
			case 12: price += 750*shot; break;
			case 13: price += 1050*shot; break;
			case 14: price += 750*shot; break;
			case 15: price += 750*shot; break;
			}
		
		
			int result = 0;
		
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
	
		
			if (result==100)
			{
				System.out.println("������ ȣ�� �ٶ�(��� ����)");
			}
			System.out.println();
		
		
		} // close while
		
		
		return price;

		
	
	
		// �׽�Ʈ(Ȯ��)
		//System.out.println("����ī ���� �� : " + vodka);
		//System.out.println("�� ���� �� : " + gin);
		//System.out.println("������Ʈ ���� �� : " + vermouth);

	}
	
	@Override
	protected void alcoholReturn(int al)
	{
		String result = "";
		
		switch (al)
		{
		case 1: result = "����ī"; break;
		case 2: result = "��"; break;
		case 3: result = "������Ʈ"; break;
		case 4: result = "į�ĸ�"; break;
		case 5: result = "�Ƹ�����"; break;
		case 6: result = "���� ���̽���"; break;
		case 7: result = "������"; break;
		case 8: result = "ȭ��Ʈ ��"; break;
		case 9: result = "��� ť���"; break;
		case 10: result = "�������ֽ�"; break;
		case 11: result = "�����ֽ�"; break;
		case 12: result = "���ξ����ֽ�"; break;
		case 13: result = "���� �ֽ�"; break;
		case 14: result = "ź���"; break;
		case 15: result = "�����"; break;
		case 16: result = "�ø���"; break;
		}

		System.out.println(result);
	}
	
	@Override
	protected void list()
	{
		System.out.println("1. ����ī");
		System.out.println("2. ��");
		System.out.println("3. ������Ʈ");
		System.out.println("4. į�ĸ�");
		System.out.println("5. �Ƹ�����");
		System.out.println("6. ���� ���̽���");
		System.out.println("7. ������");
		System.out.println("8. ȭ��Ʈ ��");
		System.out.println("9. ��� ť���");
		System.out.println("10. �������ֽ�");
		System.out.println("11. �����ֽ�");
		System.out.println("12. ���ξ����ֽ�");
		System.out.println("13. �����ֽ�");
		System.out.println("14. ź���");
		System.out.println("15. �����");
		
		System.out.println();
		
	}

	@Override
	protected int change(int price)
	{
		
		return getMoney() - price;
	}
	
	
	
	// Ŀ���� Ŭ������ stock �޼ҵ� ���� alcoholChoose �޼ҵ� �� while���� ���� 
	
}