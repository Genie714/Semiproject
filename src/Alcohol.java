import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine					// 상위클래스
{
	

	protected abstract void alcoholReturn(int al);		// 술을 반환하는 메소드
	
	protected abstract void list();						// 술 리스트
		
	protected abstract int change(int al);				// 고른 술에 대한 값을 입력받은 값에서 빼주는 메소드
	
	protected int alcoholChoose()						// 술을 선택하는 메소드
	{
		
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("술을 선택하시오 : ");
		al = sc.nextInt();
		return al;
	}
	
	
	protected int getMoney()							// 돈 입력받는 메소드
	{
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.print("돈을 입력하시오 : ");
		money = sc.nextInt();
		return money;


	}

}



//-----------------------------------------------------------------------------------------
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




//-----------------------------------------------------------------------------------------
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



//-----------------------------------------------------------------------------------------
// AlcoholVendingMachine 클래스 상속받는 클래스 설계
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




// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Alcohol										
{
	public static void main(String[]args)
	{
		SingleItem ob1 = new SingleItem();
		PresetCocktail ob2 = new PresetCocktail();
		CustomCocktail ob3 = new CustomCocktail();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3가지 유형 중 하나를 선택하세요 (① 단품 / ② 프리셋(칵테일) / ③ 커스텀(칵테일) : ");
		int a = sc.nextInt();
		
		if(a==1)
		{
			ob1.list();
			int al = ob1.alcoholChoose();
			ob1.alcoholReturn(al);
			ob1.stock(al);
			System.out.println("잔돈 : " + ob1.change(al));
		}
		
		if(a==2)
		{	
			ob2.list();
			int al = ob2.alcoholChoose();
			ob2.alcoholReturn(al);
			ob2.stock(al);
			System.out.println("잔돈 : " + ob2.change(al));
		}
		
		if(a==3)
		{
			ob3.list();
			int price = ob3.alcoholChoose();
			System.out.println("잔돈 : " + ob3.change(price));
		}
		
		
		
	}

}