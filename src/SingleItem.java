// AlcoholVendingMachine 클래스 상속받는 클래스 설계

import java.io.*;
import java.util.*;

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

		Map<String,Integer> map = new HashMap<String,Integer>();



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
		map.put(result,300);
		//System.out.println(map);

	}
	
	@Override
	protected void list()
	{	

      System.out.printf("1 %s              (%d￦)    ","소주",7500);
      System.out.printf("2 %s       (%d￦)    ","맥주",9500);
      System.out.printf("3 %s      (%d￦)\n","소맥",8500);
      System.out.printf("4 %s              (%d￦)   ","꼬냑",18500);
      System.out.printf("5 %s (%d￦)   ","발렌타인12",11500);
      System.out.printf("6 %s    (%d￦)\n","데킬라",10500);
      System.out.printf("7 %s (%d￦)   ","조니워커 블랙라벨",14500);
      System.out.printf("8 %s (%d￦)   ","시바스리갈",12500);
      System.out.printf("9 %s (%d￦)\n","몽키 숄더",13500);
      
      System.out.println();
      		
	}

	@Override
	protected int change(int al)                         

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
