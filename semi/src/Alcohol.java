import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine					// ����Ŭ����
{
	

	protected abstract void alcoholReturn(int al);		// ���� ��ȯ�ϴ� �޼ҵ�
	
	protected abstract void list();						// �� ����Ʈ
		
	protected abstract int change(int al);				// �� ���� ���� ���� �Է¹��� ������ ���ִ� �޼ҵ�
	
	protected int alcoholChoose()						// ���� �����ϴ� �޼ҵ�
	{
		
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �����Ͻÿ� : ");
		al = sc.nextInt();
		return al;
	}
	
	
	protected int getMoney()							// �� �Է¹޴� �޼ҵ�
	{
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		money = sc.nextInt();
		return money;


	}

}



//-----------------------------------------------------------------------------------------
// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����
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
	}
	
	@Override
	protected void list()
	{	
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. �Ҹ�");
		System.out.println("4. ����");
		System.out.println("5. �߷�Ÿ��12");
		System.out.println("6. ��ų��");
		System.out.println("7. ���Ͽ�Ŀ ����");
		System.out.println("8. �ùٽ�����");
		System.out.println("9. ��Ű ���");
		
		System.out.println();
		
	}

	@Override
	protected int change(int al)                         // �� ���� ���� ���� �Է¹��� ������ ���ִ� �޼ҵ�
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

		return getMoney() - price;
	}

	protected void stock(int al)
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

}




//-----------------------------------------------------------------------------------------
// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����
class PresetCocktail extends AlcoholVendingMachine
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
	private int olive=10000;
	
	
	@Override
	protected void alcoholReturn(int al)
	{
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
		
		System.out.println(result);

	}
	
	@Override
	protected void list()
	{	
		System.out.println("1. ��ť�� ����̹�");
		System.out.println("2. �ױ׷δ�");
		System.out.println("3. �跿");
		System.out.println("4. īŸ���ý�");
		System.out.println("5. �� ����");
		System.out.println("6. ���� ��");
		System.out.println("7. ����� ��Ƽ��");
		System.out.println("8. �����");
		System.out.println("9. ������");
		System.out.println("10. ����Ͽ���");
		
		System.out.println();
		
	}
	
	@Override
	protected int change(int al)
	{
		int price = 0;
		
		switch (al)
		{
		case 1: price = 12500; break;
		case 2: price = 23500; break;
		case 3: price = 21500; break;
		case 4: price = 18500; break;
		case 5: price = 16500; break;
		case 6: price = 11500; break;
		case 7: price = 18500; break;
		case 8: price = 11500; break;
		case 9: price = 9500; break;
		case 10: price = 14500; break;
		}


		return getMoney()-price;
	}
	
	protected void stock(int al)
	{
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		
		switch(al) 
		{
	    case 1:
	        res1 = vodka -= 100;
	        res2 = orangejuice -= 200;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 2:
	        res1 = gin -= 100;
	        res2 = vermouth -= 100;
	        campari -= 100;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 3:
	        res1 = gin -= 225;
	        res2 = limejuice -= 75;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 4:
	        res1 = whiterum -= 180;
	        res2 = amaretto -= 60;
	        res3 = limejuice -= 60;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 5:
	        res1 = gin -= 130;
	        res2 = lemonjuice -= 85;
	        res3 = sparklingwater -= 85;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 6:
	        res1 = jgermeister -= 75;
	        res2 = redbull -= 225;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 7:
	        res1 = gin -= 75;
	        res2 = vermouth -= 225;
	        res3 = olive -= 1;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 8:
	        res1 = gin -= 75;
	        res2 = sparklingwater -= 225;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 9:
	        res1 = mojito -= 75;
	        res2 = sparklingwater -= 225;
			res3 = 10000;
			res4 = 10000;
	        break;
	    case 10:
	        res1 = whiterum -= 100;
	        res2 = bluecuracao -= 50;
	        res3 = pinejuice -= 100;
	        res4 = lemonjuice -= 50;
	        break;
	    }
		
		if (res1==100)
		{
			System.out.println("������ ȣ�� �ٶ�(��� ����)");
		}
		
		if (res2==100)
		{
			System.out.println("������ ȣ�� �ٶ�(��� ����)");
		}
		
		if (res3==100)
		{
			System.out.println("������ ȣ�� �ٶ�(��� ����)");
		}
		
		if (res4==100)
		{
			System.out.println("������ ȣ�� �ٶ�(��� ����)");
		}
		System.out.println();
		
		
		
		// �׽�Ʈ(Ȯ��)
		//System.out.println("����ī, ������ �ֽ� ���� �� : "+ res1+res2+res3+res4);
		
	}
	
	
	
}



//-----------------------------------------------------------------------------------------
// AlcoholVendingMachine Ŭ���� ��ӹ޴� Ŭ���� ����
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




// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Alcohol										
{
	public static void main(String[]args)
	{
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
		}
		
		if(a==2)
		{	
			ob2.list();
			int al = ob2.alcoholChoose();
			ob2.alcoholReturn(al);
			ob2.stock(al);
			System.out.println("�ܵ� : " + ob2.change(al));
		}
		
		if(a==3)
		{
			ob3.list();
			int price = ob3.alcoholChoose();
			System.out.println("�ܵ� : " + ob3.change(price));
		}
		
		
		
	}

}