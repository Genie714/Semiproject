class PrizeMoneyDisplay // �̰� ��� ��������ϴ� ����.
{
    final static int INIT_PRIZE = 100000;  // �ʱ�ȭ�� ���� 100,000 ��
    final static int STACK = 490;          // ������ 10���� ������ ���� ���� ���̴� 490 ��
    public static int totalPrizeMoney = 100000;    // ������ INIT_PRIZE��
	public static int countPlay = 0;

	public static void showTotalPrize()	// pmd.showTotalPrize();
    {
        System.out.printf("���� ��÷��: %d\n",totalPrizeMoney);
    }

    public static void setTotalPrizeMoney(String res)	// aaa bbb ccc ddd 777 abc acb ��� ����� �ް��� pmd ǥ�� �Ҷ� ���� �Լ�	// pmd.setTotalPrizeMoney(res);
    {
		switch (res) 
			{
            case "aaa":
                totalPrizeMoney -= 100000;break;
            case "bbb":
                totalPrizeMoney -= 15000;break;
            case "ccc":
                totalPrizeMoney -= 5000;break;
            case "ddd":
                totalPrizeMoney -= 1000;break;
            case "777":
				totalPrizeMoney = INIT_PRIZE;break;	// ���� ������ ������ 100,000�� 
            default:
				totalPrizeMoney +=0;break;
			}
		showTotalPrize();

        if (totalPrizeMoney<100000)        //
        {
            totalPrizeMoney = INIT_PRIZE;
            showTotalPrize();
        }
    }

    public static void stack()	//pmd.stack();
    {
        totalPrizeMoney += STACK;
        showTotalPrize();
		countPlay++;
    }
}