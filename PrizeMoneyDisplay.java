class PrizeMoneyDisplay // 이건 계속 보여줘야하는 거임.
{
    final static int INIT_PRIZE = 100000;  // 초기화때 쓰는 100,000 원
    final static int STACK = 490;          // 수수료 10원을 제외한 유저 눈에 보이는 490 원
    public static int totalPrizeMoney = 100000;    // 시작은 INIT_PRIZE로
	public static int countPlay = 0;

	public static void showTotalPrize()	// pmd.showTotalPrize();
    {
        System.out.printf("누적 당첨금: %d\n",totalPrizeMoney);
    }

    public static void setTotalPrizeMoney(String res)	// aaa bbb ccc ddd 777 abc acb 등등 결과를 받고나서 pmd 표시 할때 쓰는 함수	// pmd.setTotalPrizeMoney(res);
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
				totalPrizeMoney = INIT_PRIZE;break;	// 잭팟 터지면 어차피 100,000원 
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