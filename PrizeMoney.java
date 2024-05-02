public class PrizeMoney
{
	protected int won50kEa = 20;
	protected int won10kEa = 100;
	protected int won5kEa = 200;
	protected int won1kEa = 2000;

	int defaultPrize = 5000000;		// 당첨금통 금액 (500만) --> 실제 룰렛 디스플레이에서는 (10만+490n) 만큼 표시중


	public void prizeMoney(String res)
	{
		Admin ad = Admin.getInstance();
		Buyer by = Buyer.getInstance();
		String result = res;
		
		int prize=0;
		
		/*
		if (result == "aaa")
		{
			System.out.println("십만원에 당첨되셨습니다");	// 임의 문구(나중에 바꿀것)
			prize = 100000;	// 임시로 값 설정
			won50kEa = won50kEa - 2;
		}
		else if (result == "bbb")
		{
			System.out.println("만오천원에 당첨되셨습니다");
			prize = 15000;
			won5kEa = won5kEa - 1;
			won10kEa = won10kEa - 1;
		}
		else if (result == "ccc")
		{
			System.out.println("오천원에 당첨되셨습니다.");
			prize = 5000;
			won5kEa --;
		}
		else if (result == "ddd")
		{
			System.out.println("천원에 당첨되셨습니다.");
			prize = 1000;
			won1kEa --;
		}
		else if (result == "777")
		{
			System.out.println("잭팟 ㅊㅊ 당첨금 관리자 찾아가셈");
		}
		else
		{
			System.out.println("실패 ㅋㅋ ");
		}
		*/

		switch (result) {
            case "aaa":
                System.out.println("100,000￦ 당첨");
                prize = 100000;
				won50kEa = won50kEa - 2;
				break;
                
            case "bbb":
                System.out.println("15,000￦ 당첨");
                prize = 15000;
				won5kEa = won5kEa - 1;
				won10kEa = won10kEa - 1;
				break;
                
            case "ccc":
                System.out.println("5,000￦ 당첨");
                prize = 5000;
				won5kEa --;
				break;
                
            case "ddd":
                System.out.println("1,000￦ 당첨");
                prize = 1000;
				won1kEa --;
				break;
                
            case "777":
                System.out.println("!!!JACKPOT!!!");
                System.out.println("당첨금은 관리자에게 받아가세요");	// 관리자 호출 추가
				break;
                
            default:
                System.out.println("실패!");
                
        }

		by.buyerAddMoney(prize);	// 구매자에게 돈 줌
		defaultPrize = defaultPrize - prize; // 현재 당첨금 돈통에서 당첨 금액만큼 차감
		
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
			defaultPrize = 5000000;

			won50kEa = 100;
			won10kEa = 100;
			won10kEa = 200;	
			won1kEa = 2000;

			ad.subAdminMoney(5000000 - defaultPrize);
			
			
		} // 다시 채워넣기
		
		//System.out.printf("현재 오만원권은 %d, 만원권은 %d가 남아있습니다.\n", won50kEa, won10kEa); // 테스트 문구( 나중에 지울것 )
		
	}
	
}