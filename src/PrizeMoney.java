public class PrizeMoney
{
	protected int won50kEa = 20;
	protected int won10kEa = 100;
	protected int won5kEa = 200;
	protected int won1kEa = 2000;

	int defaultPrize = 5000000;		// 당첨금통 금액 (500만) --> 실제 룰렛 디스플레이에서는 (10만+490n) 만큼 표시중
	private static PrizeMoney instance;
	

	public static PrizeMoney getInstance()
	{
		if (instance == null)
		{
			instance = new PrizeMoney();
		}
		return instance;
	}


	public void prizeMoney(String res,PrizeMoneyDisplay pmd)
	{
		
		Admin ad = Admin.getInstance();
		Buyer by = Buyer.getInstance(); 

		String result = res;
		
		int prize=0;

		switch (result) {
            case "aaa":
                System.out.println("50,000￦ 당첨");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				// pmd.stack();
				// pmd.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 50000;
				
				won50kEa = won50kEa - 1;

						///////
				defaultPrize = defaultPrize - prize;
				System.out.printf("현재 돈통에 남아있는 돈은 %d원입니다.\n",defaultPrize);		///////(테스트문구)
				break;
                
            case "bbb":
                System.out.println("15,000￦ 당첨");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 15000;
				won5kEa = won5kEa - 1; 
				won10kEa = won10kEa - 1;

					///////
				defaultPrize = defaultPrize - prize;
				System.out.printf("현재 돈통에 남아있는 돈은 %d원입니다.\n",defaultPrize);		///////(테스트문구)
				break;
                
            case "ccc":
                System.out.println("5,000￦ 당첨");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 5000;
				won5kEa --;

						///////
				defaultPrize = defaultPrize - prize;
				System.out.printf("현재 돈통에 남아있는 돈은 %d원입니다.\n",defaultPrize);		///////(테스트문구)
				break;
                
            case "ddd":
                System.out.println("1,000￦ 당첨");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 1000;
				won1kEa --;
				
				
				defaultPrize = defaultPrize - prize;		///////
				System.out.printf("현재 돈통에 남아있는 돈은 %d원입니다.\n",defaultPrize);		///////(테스트문구)
				break;
                
            case "777":
                System.out.println("!!!JACKPOT!!!");
                System.out.println("당첨금은 관리자에게 받아가세요");	// 관리자 호출 추가
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
				break;
                
            default:
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                System.out.println("실패!");
				System.out.printf("현재 돈통에 남아있는 돈은 %d원입니다.\n",defaultPrize);
                
        }

		by.buyerAddMoney(prize);	// 구매자에게 돈 줌
		//defaultPrize = defaultPrize - prize; // 현재 당첨금 돈통에서 당첨 금액만큼 차감
		
		//System.out.printf("현재 %d만큼의 돈이 남아있습니다.\n", defaultPrize); // 테스트 문구( 나중에 지울것 )

		if (defaultPrize <= 100000)			// 돈통이 10만원 이하가 되면
		{
			ad.subAdminMoney(5000000 - defaultPrize);		// 관리자한테서 500까지 필요한 금액만큼 빠짐
			defaultPrize = 5000000;							// 다시 500으로 채워넣고
			

			won50kEa = 100;
			won10kEa = 100;
			won5kEa = 200;	
			won1kEa = 2000;					// 지폐들도 싹 다시 채우기
		}
		else if (won50kEa <= 1 || won10kEa <= 1 || won5kEa <= 1 || won1kEa <= 1) // 특정 지폐가 1장밖에 안남으면
		{
			ad.subAdminMoney(5000000 - defaultPrize);

			defaultPrize = 5000000;

			won50kEa = 100;
			won10kEa = 100;
			won5kEa = 200;	
			won1kEa = 2000;
			
		} // 다시 채워넣기
		
		//System.out.printf("현재 오만원권은 %d, 만원권은 %d가 남아있습니다.\n", won50kEa, won10kEa); // 테스트 문구( 나중에 지울것 )
		
	}
	
}