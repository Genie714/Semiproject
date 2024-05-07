// AlcoholVendingMachine 클래스 상속받는 클래스 설계

import java.io.*;
import java.util.*;

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
	private int bluecuracao=10000;
	private int orangejuice=10000;
	private int limejuice=10000;
	private int pinejuice=10000;
	private int lemonjuice=10000;
	private int sparklingwater=10000;
	private int redbull=10000;
	int count=0;
	int price=0;
	int al;
	int b;
	int c;

	private static CustomCocktail instance;

	public static CustomCocktail getInstance()
	{
		if (instance == null)
		{
			instance = new CustomCocktail();
		}
		return instance;
	}
   
   
   
	@Override
	protected int alcoholPrice(int al)
	{
	   return b;
	}
	
	@Override
	protected void stock(int al)
	{
		
	}
   
   
	@Override
	protected int alcoholChoose()						// CustomCocktail 클래스만 술 선택하는 메소드 하위 클래스에 따로 정의
	{	
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int shotTot = 0;
		int shot;
		
		
		System.out.println("※종류 제한Ｘ, 총 10 Shot을 넣어야 술이 제조됩니다.※");
		
		while(shotTot != 10)
		{   
			System.out.println();
			
			System.out.print("술 선택 : ");
			al = sc.nextInt();
         
			System.out.print("Shot 수(0 → 술 다시 선택) : ");
			shot = sc.nextInt();
         
			shotTot += shot;

			if (shot < 1)
			{
				// 고를 술 다시 물어봄
			}
         
			if (shot>=1 && shot<=10 && shotTot<=10)
			{
				switch (al)
				{
				case 1: price = 2000*shot;break;
				case 2: price = 2500*shot; break;
				case 3: price = 1500*shot; break;
				case 4: price = 3000*shot; break;
				case 5: price = 1500*shot; break;
				case 6: price = 2000*shot; break;
				case 7: price = 1500*shot; break;
				case 8: price = 2000*shot; break;
				case 9: price = 2000*shot; break;
				case 10: price = 1000*shot; break;
				case 11: price = 1000*shot; break;
				case 12: price = 1000*shot; break;
				case 13: price = 1000*shot; break;
				case 14: price = 1000*shot; break;
				case 15: price = 1000*shot; break;
				}
			
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
				
				//테스트(확인)
				//System.out.printf("술 잔량 : %d", result);
				
				System.out.print("종류 : ");
				alcoholReturn(al);
				System.out.printf("추가된 총 Shot : %d\n", shotTot);

				if (result==100)
				{
					System.out.println("매진");
					return -1;
				}
				
					 
			} // close if
   
         
			if (shotTot>10)
			{
				System.out.println("총 10 Shot을 초과하였습니다. 다시 입력하세요.");

				shotTot -= shot;
         
			}
         
   
		} // close while
      
      
		return price;

  
	}
	
	// CustomCocktail 클래스만 재고정리를 stock메소드 대신 alcoholChoose메소드 안 while문에 통합 
   
   

	@Override
	protected String alcoholReturn(int al)
	{
		//Map<String,Integer> map = new HashMap<String,Integer>();

		String result = "";
      
		switch (al)
		{
		case 1: result = "보드카";
						count++;
						break;
		case 2: result = "진";
						count++;
						break;
		case 3: result = "베르무트";
						count++;
						break;
		case 4: result = "캄파리"; 
						count++;
						break;
		case 5: result = "아마레토";
						count++;
						break;
		case 6: result = "예거 마이스터";
						count++;
						break;
		case 7: result = "모히또";
						count++;
						break;
		case 8: result = "화이트 럼";
						count++;
						break;
		case 9: result = "블루 큐라소";
						count++;
						break;
		case 10: result = "오렌지주스";
						count++;
						break;
		case 11: result = "라임주스";
						count++;
						break;
		case 12: result = "파인애플주스";
						count++;
						break;
		case 13: result = "레몬 주스";
						count++;
						break;
		case 14: result = "탄산수";
						count++;
						break;
		case 15: result = "레드불";
						count++;
						break;
		}
      
		System.out.println(result);
      
		//map.put(result,300);
		//System.out.println(map);
		return result;
	}
   
   
	@Override
	protected void list()
	{
		System.out.println();
		System.out.println("1shot (30ml)");
		System.out.println();
		
		System.out.printf("1 %s      (%d￦) ","보드카",2250);
		System.out.printf("2 %s        (%d￦)","진",2550);
		System.out.printf("  3 %s      (%d￦) \n","베르무트",1650);
		System.out.printf("4 %s      (%d￦) ","캄파리",2850);
		System.out.printf("5 %s  (%d￦) ","아마레토",1650);
		System.out.printf(" 6 %s (%d￦) \n","예거 마이스터",2250);
		System.out.printf("7 %s      (%d￦) ","모히또",1650);
		System.out.printf("8 %s (%d￦) ","화이트 럼",2250);
		System.out.printf(" 9 %s   (%d￦) \n","블루 큐라소",2250);
		System.out.printf("10 %s (%d￦) ","오렌지주스",750);
		System.out.printf(" 11 %s (%d￦) ","라임주스",1050);
		System.out.printf(" 12 %s (%d￦) \n","파인애플주스",750);
		System.out.printf("13 %s   (%d￦) ","레몬주스",750);
		System.out.printf(" 14 %s   (%d￦) ","탄산수",750);
		System.out.printf("  15 %s       (%d￦)\n ","레드불",2250);
		
		System.out.println();
      
	}


	@Override
	protected int change(int price)
	{
		int changeMoney = getMoney() - price;

		while (changeMoney < 0)
		{
			System.out.println("입력한 돈이 부족합니다. 다시 입력해주세요.");
			System.out.println();

			enterMoney();
			changeMoney = getMoney() - price;
		}

		return changeMoney;

	}

	@Override
	protected void enterStock()
	{
		vodka=10000;
	    gin=10000;
	    vermouth=10000;
        campari=10000;
	    amaretto=10000;
	    jgermeister=10000;
	    mojito=10000;
	    whiterum=10000;
	    bluecuracao=10000;
	    orangejuice=10000;
	    limejuice=10000;
	    pinejuice=10000;
	    lemonjuice=10000;
	    sparklingwater=10000;
	    redbull=10000;
	    

	}

	/*
	@Override
	protected int alcoholRun()
	{
		list();
		int price = alcoholChoose();
		if (price == -1)
		{
			System.exit(-1);
		}
		
		return price;
		
	}
	*/
	
	
	
	
	// 커스텀칵테일 유형 안에서 각각의 주류,비주류를 랜덤으로 뽑아 조합되는 랜덤 커스텀칵테일...... 고민중................
   

   
   
   
}