class PrizeMoneyDisplay // �̰� ��� ��������ϴ� ����.
{
	/*
    final static int INIT_PRIZE = 100000;  // �ʱ�ȭ�� ���� 100,000 ��
    final static int STACK = 490;          // ������ 10���� ������ ���� ���� ���̴� 490 ��
    public static int totalPrizeMoney = 100000;    // ������ INIT_PRIZE��
	public static int countPlay = 0;
	*/
	
	// ������ �̱��� ���� ���� - ������
	private static PrizeMoneyDisplay instance;
	
	final int INIT_PRIZE = 100000;  // �ʱ�ȭ�� ���� 100,000 ��
    final int STACK = 400;          // ������ 10���� ������ ���� ���� ���̴� 490 ��
    public int totalPrizeMoney = 100000;    // ������ INIT_PRIZE��
	public int countPlay = 0;

	public int outRealMoney = 0;	//========test
	public int aaa = 0;				//========test
	public int bbb = 0;
	public int ccc = 0;
	public int ddd = 0;
	public int seven3 = 0;
	public int fail = 0;
	
	//�̱��� ���� ��ü���� �޼ҵ� - ������
	public static PrizeMoneyDisplay getInstance()
	{
		if(instance == null)
		{
			instance = new PrizeMoneyDisplay();
		}
		return instance;
	}
	
	
	//public static void showTotalPrize()	// pmd.showTotalPrize();
	public void showTotalPrize()	// pmd.showTotalPrize();
    {
		System.out.println("\n");
		System.out.println("�� �� �� �� �� �� �� �� �� �� �� �� �� ��");
		System.out.println("��                         ��");
        System.out.printf("�� ���� ��÷��: %10d ��\n",totalPrizeMoney);
		System.out.println("��                         ��");
		System.out.println("�� �� �� �� �� �� �� �� �� �� �� �� �� ��");
	
		
    }

    //public static void setTotalPrizeMoney(String res)	// aaa bbb ccc ddd 777 abc acb ��� ����� �ް��� pmd ǥ�� �Ҷ� ���� �Լ�	// pmd.setTotalPrizeMoney(res);
    public void setTotalPrizeMoney(String res)	// aaa bbb ccc ddd 777 abc acb ��� ����� �ް��� pmd ǥ�� �Ҷ� ���� �Լ�	// pmd.setTotalPrizeMoney(res);
    {
		switch (res) 
			{
            case "aaa":
                totalPrizeMoney -= 100000;
				aaa++;
				break;
            case "bbb":
                totalPrizeMoney -= 15000;
				bbb++;
				break;
            case "ccc":
                totalPrizeMoney -= 5000;
				ccc++;
				break;
            case "ddd":
                totalPrizeMoney -= 1000;
				ddd++;
				break;
            case "777":
				totalPrizeMoney = INIT_PRIZE;
				seven3++;
				break;	// ���� ������ ������ 100,000�� 
            default:
				totalPrizeMoney +=0;
				fail++;
				break;
			}
		//showTotalPrize();

        if (totalPrizeMoney<100000)        //
        {
			outRealMoney += (100000 - totalPrizeMoney);//==========test
            totalPrizeMoney = INIT_PRIZE;
            showTotalPrize();
        }
    }

    //public static void stack()	//pmd.stack();
    public void stack()	//pmd.stack();
    {
        totalPrizeMoney += STACK;
        showTotalPrize();
		countPlay++;
    }
}