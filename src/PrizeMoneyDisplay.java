class PrizeMoneyDisplay // 이건 계속 보여줘야하는 거임.
{
	/*
    final static int INIT_PRIZE = 100000;  // 초기화때 쓰는 100,000 원
    final static int STACK = 490;          // 수수료 10원을 제외한 유저 눈에 보이는 490 원
    public static int totalPrizeMoney = 100000;    // 시작은 INIT_PRIZE로
	public static int countPlay = 0;
	*/
	
	// 생성자 싱글톤 패턴 적용 - 문대진
	private static PrizeMoneyDisplay instance;
	
	final int INIT_PRIZE = 100000;  // 초기화때 쓰는 100,000 원
    final int STACK = 400;          // 수수료 10원을 제외한 유저 눈에 보이는 490 원
    public int totalPrizeMoney = 100000;    // 시작은 INIT_PRIZE로
	public int countPlay = 0;

	public int outRealMoney = 0;	//========test
	public int aaa = 0;				//========test
	public int bbb = 0;
	public int ccc = 0;
	public int ddd = 0;
	public int seven3 = 0;
	public int fail = 0;
	
	//싱글톤 패턴 객체생성 메소드 - 문대진
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
		System.out.println("☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ ★");
		System.out.println("★                         ☆");
        System.out.printf("☆ 누적 당첨금: %10d ★\n",totalPrizeMoney);
		System.out.println("★                         ☆");
		System.out.println("☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ ★ ☆ ★");
	
		
    }

    //public static void setTotalPrizeMoney(String res)	// aaa bbb ccc ddd 777 abc acb 등등 결과를 받고나서 pmd 표시 할때 쓰는 함수	// pmd.setTotalPrizeMoney(res);
    public void setTotalPrizeMoney(String res)	// aaa bbb ccc ddd 777 abc acb 등등 결과를 받고나서 pmd 표시 할때 쓰는 함수	// pmd.setTotalPrizeMoney(res);
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
				break;	// 잭팟 터지면 어차피 100,000원 
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