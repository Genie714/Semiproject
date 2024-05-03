// AlcoholVendingMachine 클래스 상속받는 클래스 설계
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
		case 1: result = "소주"; break;
		case 2: result = "맥주"; break;
		case 3: result = "소맥"; break;
		case 4: result = "꼬냑"; break;
		case 5: result = "발렌타인 12"; break;
		case 6: result = "데킬라"; break;
		case 7: result = "조니워커 블랙라벨"; break;
		case 8: result = "시바스리갈"; break;
		case 9: result = "몽키 숄더"; break;
		
		}

		System.out.println(result);
	}
	
	@Override
	protected void list()
	{	
		System.out.println("1. 소주");
		System.out.println("2. 맥주");
		System.out.println("3. 소맥");
		System.out.println("4. 꼬냑");
		System.out.println("5. 발렌타인12");
		System.out.println("6. 데킬라");
		System.out.println("7. 조니워커 블랙라벨");
		System.out.println("8. 시바스리갈");
		System.out.println("9. 몽키 숄더");
		
		System.out.println();
		
	}

	@Override
	protected int change(int al)                         // 고른 술에 대한 값을 입력받은 값에서 빼주는 메소드
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
			System.out.println("관리자 호출 바람(재고 부족)");
		}
		System.out.println();
		
	}

}
