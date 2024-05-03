// AlcoholVendingMachine 클래스 상속받는 클래스 설계

import java.io.*;
import java.util.*;

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

	private int bluecuracao=10000;

	private int orangejuice=10000;
	private int limejuice=10000;
	private int pinejuice=10000;
	private int lemonjuice=10000;
	private int sparklingwater=10000;
	private int redbull=10000;


	private int olive=10000;
	
	
	@Override
	protected void alcoholReturn(int al)
	{

		Map<String,Integer> map = new HashMap<String,Integer>();


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

		map.put(result,300);
		//System.out.println(map);


	}
	
	@Override
	protected void list()
	{	

		System.out.printf("1 %s (%5d￦)   ","스큐르 드라이버",12500);
		System.out.printf("2 %s (%5d￦)   ","네그로니",23500);
		System.out.printf("3 %s    (%5d￦) \n","김렛",21500);
		System.out.printf("4 %s      (%5d￦)   ","카타르시스",18500);
		System.out.printf("5 %s  (%5d￦)   ","진 피즈",16500);
		System.out.printf("6 %s (%5d￦) \n","예거 밤",11500);
		System.out.printf("7 %s   (%5d￦)   ","드라이 마티니",18500);
		System.out.printf("8 %s   (%5d￦)   ","진토닉",11500);
		System.out.printf("9 %s  (%5d￦) \n","모히또",9500);
		System.out.printf("10 %s     (%5d￦)\n","블루하와이",14500);
     

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
		
		int changeMoney = getMoney() - price;

		while (changeMoney < 0)
		{
			System.out.println("입력한 돈이 부족합니다. 다시 입력해주세요.");
			System.out.println();

			changeMoney = getMoney() - price;
		}

		return changeMoney;
	}
	
	protected void stock(int al)						// 모든 종류의 술 재고 정리해주는 메소드
	{
	    switch(al) 
	    {
			case 1:
			   vodka -= 100;
	           orangejuice -= 200;
	           break;
	       
		    case 2:
			   gin -= 100;
	           vermouth -= 100;
	           campari -= 100;
	           break;

			case 3:
	           gin -= 225;
	           limejuice -= 75;
	           break;
			
			case 4:
	           whiterum -= 180;
	           limejuice -= 60;
	           amaretto -= 60;
	           break;
			
			case 5:
	           gin -= 130;
	           sparklingwater -= 85;
	           lemonjuice -= 85;
	           break;

			case 6:
	           jgermeister -= 75;
	           redbull -= 225;
	           break;
	        
			case 7:
	           gin -= 75;
	           vermouth -= 225;
	           olive -= 1;
	           break;

			case 8:
	           gin -= 75;
	           sparklingwater -= 225;
	           break;

			case 9:
	           mojito -= 75;
	           sparklingwater -= 225;
	           break;
	        
			case 10:
	           whiterum -= 100;
	           bluecuracao -= 50;
	           lemonjuice -= 50;
	           pinejuice -= 100;;
	           break;

		}
      

	  	if (al==1)
		{
			if (vodka < 100 || orangejuice < 200)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}

		if (al==2)
		{
			if (gin < 100 || vermouth < 100 || campari < 100)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
		
		if (al==3)
		{
			if (gin < 225 || limejuice < 75)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
		
		if (al==4)
		{
			if (whiterum < 180 || limejuice < 60 || amaretto < 60)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
		
		if (al==5)
		{
			if (gin < 130 || sparklingwater < 85 || lemonjuice < 85)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
      
		if (al==6)
		{
			if (jgermeister < 75 || redbull < 225)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
      
		if (al==7)
		{
			if (gin < 75 || vermouth < 225 || olive < 1)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
      
		if (al==8)
		{
			if (gin < 75 || sparklingwater < 225)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
      
		if (al==9)
		{
			if (mojito < 75 || sparklingwater < 225)
			{
				System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
      
		if (al==10)
		{
			if (whiterum < 100 || bluecuracao < 50 || lemonjuice < 50 || pinejuice < 100)
			{
            System.out.println("관리자 호출 바람(재고 부족)");
			}
		}
		System.out.println();
  
	}

	
	protected void alcoholRun()
	{
		list();
		int al = alcoholChoose();
		alcoholReturn(al);
		stock(al);
		System.out.println("잔돈 : " + change(al));
		
		System.out.println();
				
		System.out.print("술을 추가로 선택하시겠습니까?(Y/N) : ");
		String add = sc.next();
		char check = add.charAt(0);

		if (check != 'y' && check != 'Y')
		{
			break;
		}
	
	}


}