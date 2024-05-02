// AlcoholVendingMachine 클래스 상속받는 클래스 설계
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
		case 1: result = "스큐르 드라이버"; break;
		case 2: result = "네그로니"; break;
		case 3: result = "김렛"; break;
		case 4: result = "카타르시스"; break;
		case 5: result = "진 피즈"; break;
		case 6: result = "예거 밤"; break;
		case 7: result = "드라이 마티니"; break;
		case 8: result = "진토닉"; break;
		case 9: result = "모히또"; break;
		case 10: result = "블루하와이"; break;
		
		}
		
		System.out.println(result);

	}
	
	@Override
	protected void list()
	{	
		System.out.println("1. 스큐르 드라이버");
		System.out.println("2. 네그로니");
		System.out.println("3. 김렛");
		System.out.println("4. 카타르시스");
		System.out.println("5. 진 피즈");
		System.out.println("6. 예거 밤");
		System.out.println("7. 드라이 마티니");
		System.out.println("8. 진토닉");
		System.out.println("9. 모히또");
		System.out.println("10. 블루하와이");
		
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
			System.out.println("관리자 호출 바람(재고 부족)");
		}
		
		if (res2==100)
		{
			System.out.println("관리자 호출 바람(재고 부족)");
		}
		
		if (res3==100)
		{
			System.out.println("관리자 호출 바람(재고 부족)");
		}
		
		if (res4==100)
		{
			System.out.println("관리자 호출 바람(재고 부족)");
		}
		System.out.println();
		
		
		
		// 테스트(확인)
		//System.out.println("보드카, 오렌지 주스 남은 양 : "+ res1+res2+res3+res4);
		
	}	
}