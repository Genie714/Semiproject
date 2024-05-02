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