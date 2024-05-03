// AlcoholVendingMachine 클래스 상속받는 클래스 설계

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
	protected int alcoholChoose()						// 술을 선택하는 메소드
	{

		Scanner sc = new Scanner(System.in);
		
		int shotTot = 0;
		
		while(shotTot != 10)
		{	
			System.out.print("술을 선택하시오 : ");
			al = sc.nextInt();
			alcoholReturn(al);
			System.out.print("추가할 Shot : ");
		    shot = sc.nextInt();
			shotTot += shot;

			if (shot < 1)
			{
				System.out.println("다른 수를 입력하시겠습니까? (총 10 Shot을 넣어야 술이 제조됩니다.)");
			}
			if (shotTot>10)
			{
				System.out.println("다른 수를 입력하시겠습니까? (shot이 총 10잔을 초과하였습니다. 다시 입력하세요.)");
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
				System.out.println("관리자 호출 바람(재고 부족)");
			}
			System.out.println();
		
		
		} // close while
		
		
		return price;

		
	
	
		// 테스트(확인)
		//System.out.println("보드카 남은 양 : " + vodka);
		//System.out.println("진 남은 양 : " + gin);
		//System.out.println("베르무트 남은 양 : " + vermouth);

	}
	
	@Override
	protected void alcoholReturn(int al)
	{
		String result = "";
		
		switch (al)
		{
		case 1: result = "보드카"; break;
		case 2: result = "진"; break;
		case 3: result = "베르무트"; break;
		case 4: result = "캄파리"; break;
		case 5: result = "아마레토"; break;
		case 6: result = "예거 마이스터"; break;
		case 7: result = "모히또"; break;
		case 8: result = "화이트 럼"; break;
		case 9: result = "블루 큐라소"; break;
		case 10: result = "오렌지주스"; break;
		case 11: result = "라임주스"; break;
		case 12: result = "파인애플주스"; break;
		case 13: result = "레몬 주스"; break;
		case 14: result = "탄산수"; break;
		case 15: result = "레드불"; break;
		case 16: result = "올리브"; break;
		}

		System.out.println(result);
	}
	
	@Override
	protected void list()
	{
		System.out.println("1. 보드카");
		System.out.println("2. 진");
		System.out.println("3. 베르무트");
		System.out.println("4. 캄파리");
		System.out.println("5. 아마레토");
		System.out.println("6. 예거 마이스터");
		System.out.println("7. 모히또");
		System.out.println("8. 화이트 럼");
		System.out.println("9. 블루 큐라소");
		System.out.println("10. 오렌지주스");
		System.out.println("11. 라임주스");
		System.out.println("12. 파인애플주스");
		System.out.println("13. 레몬주스");
		System.out.println("14. 탄산수");
		System.out.println("15. 레드불");
		
		System.out.println();
		
	}

	@Override
	protected int change(int price)
	{
		
		return getMoney() - price;
	}
	
	
	
	// 커스텀 클래스만 stock 메소드 없이 alcoholChoose 메소드 안 while문에 통합 
	
}