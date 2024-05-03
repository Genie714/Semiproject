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
