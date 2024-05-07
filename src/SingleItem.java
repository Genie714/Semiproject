// AlcoholVendingMachine 클래스 상속받는 클래스 설계

import java.io.*;
import java.util.*;

class SingleItem extends AlcoholVendingMachine
{
	private int soju=1000;
	private int beer=10000;
	private int somac=10000;
	private int cognac=10000;
	private int valentine=10000;
	private int tequila=10000;
	private int johnny=10000;
	private int chivas=10000;
	private int monkey=10000;
	private int count=0;
	private int price=0;
	private int result=0;
	private int al;
	private String resultName;
	
	
	private static SingleItem instance;

	public static SingleItem getInstance()
	{
		if (instance == null)
		{
			instance = new SingleItem();
		}
		return instance;
	}
	
	
	@Override
	protected int alcoholPrice(int al)					
	{
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
			
		return price;
		  	
	}


	@Override
	protected void alcoholReturn(int al)
	{

		Map<String,Integer> map = new HashMap<String,Integer>();


		switch (al)
		{
		case 1: resultName = "소주";
						count++;
	                    break;
		case 2: resultName = "맥주";
		                count++;
	                    break;
		case 3: resultName = "소맥";
		                count++;
	                    break;
		case 4: resultName = "꼬냑";
		                count++;
	                    break;
		case 5: resultName = "발렌타인 12";
		                count++;
	                    break;
		case 6: resultName = "데킬라";
		                count++;
	                    break;
		case 7: resultName = "조니워커 블랙라벨";
		                count++;
	                    break;
		case 8: resultName = "시바스리갈"; 
		                count++;
	                    break;
		case 9: resultName = "몽키 숄더";
		                count++;
	                    break;
		}
		
		System.out.println(resultName);
		
		map.put(resultName,300);
		//System.out.println(map);

	}
	
	
	@Override
	protected void list()
	{	
		System.out.println();
		
		if (soju<=100)
		{
			System.out.printf("1 %s(매진)              (%d￦)    ","소주",7500);
		}
		else if (soju>100)
		{
			System.out.printf("1 %s                    (%d￦)    ","소주",7500);
		}
		if (beer<=100)
		{
			System.out.printf("2 %s(매진)       (%d￦)    ","맥주",9500);
		}
		else if (beer>100)
		{
			System.out.printf("2 %s             (%d￦)    ","맥주",9500);
		}
		if (somac<=100)
		{
			System.out.printf("3 %s(매진)      (%d￦)\n","소맥",8500);
		}
		else if (somac>100)
		{
			System.out.printf("3 %s            (%d￦)\n","소맥",8500);
		}
		if (cognac<=100)
		{
			System.out.printf("4 %s(매진)              (%d￦)   ","꼬냑",18500);
		}
		else if (cognac>100)
		{
			System.out.printf("4 %s                    (%d￦)   ","꼬냑",18500);
		}
		if (valentine<=100)
		{
			System.out.printf("5 %s(매진) (%d￦)   ","발렌타인12",11500);
		}
		else if (valentine>100)
		{
			System.out.printf("5 %s       (%d￦)   ","발렌타인12",11500);
		}
		if (tequila<=100)
		{
			System.out.printf("6 %s(매진)    (%d￦)\n","데킬라",10500);
		}
		else if (tequila > 100)
		{
			System.out.printf("6 %s          (%d￦)\n","데킬라",10500);
		}
		if (johnny<=100)
		{
			System.out.printf("7 %s(매진) (%d￦)   ","조니워커 블랙라벨", 14500);
		}
		else if (johnny>100)
		{
			System.out.printf("7 %s       (%d￦)   ","조니워커 블랙라벨", 14500);
		}
		if (chivas<=100)
		{
			System.out.printf("8 %s(매진) (%d￦)   ","시바스리갈",12500);
		}
		else if (chivas > 100)
		{
			System.out.printf("8 %s       (%d￦)   ","시바스리갈",12500);
		}
		if (monkey <= 100)
		{
			System.out.printf("9 %s(매진) (%d￦)\n","몽키 숄더",13500);
		}
		else  if (monkey>100)
		{
			System.out.printf("9 %s       (%d￦)\n","몽키 숄더",13500);
		}
		
		
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
	protected int stock(int al)						
	{
		Scanner sc = new Scanner(System.in);
		
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


		if (result < 100)								
		{                                                                                      
			return result;                                                                      
		}
		
		//테스트(확인)
		System.out.printf("술 잔량 : %d\n", soju);
		//System.out.printf("술 잔량 : %d", beer);
		//System.out.printf("술 잔량 : %d\n", somac);
		
		
		
		return result;
		
	}
	
	
	
	@Override
	protected int alcoholChoose()												// 술을 선택하는 메소드
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("술을 선택하시오 : ");
			al = sc.nextInt();
			
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
			
			if (result >= 100)
			{
				alcoholReturn(al);
				System.out.printf("소주 잔량 : %d\n", soju);
				return al;
			}
			
			if (result < 100)
			{	
				switch (al)
				{
				case 1: result = soju+=300; break;
				case 2: result = beer+=300; break;
				case 3: result = somac+=300; break;
				case 4: result = cognac+=300; break;
				case 5: result = valentine+=300; break;
				case 6: result = tequila+=300; break;
				case 7: result = johnny+=300; break;
				case 8: result = chivas+=300; break;
				case 9: result = monkey+=300; break;
				}
				
				System.out.printf("술 잔량 : %d\n", soju);
				System.out.println("매진입니다. 다른 술을 선택하세요.");
				return -1;
			}
		
		
		}
		
	
		//테스트(확인)
		//System.out.printf("술 잔량 : %d\n", soju);
		//System.out.printf("술 잔량 : %d", beer);
		//System.out.printf("술 잔량 : %d\n", somac);
		
	
	}
	
	
	@Override
	protected void enterStock(int al)
	{
		soju = 10000;
		beer = 10000;
		somac = 10000;
		cognac = 10000;
		valentine = 10000;
		tequila = 10000;
		johnny = 10000;
		chivas = 10000;
		monkey = 10000;

		switch (al)
		{
		case 1: resultName = "소주"; break;
		case 2: resultName = "맥주"; break;
		case 3: resultName = "소맥"; break;
		case 4: resultName = "꼬냑"; break;
		case 5: resultName = "발렌타인 12";break;
		case 6: resultName = "데킬라"; break;
		case 7: resultName = "조니워커 블랙라벨";break;
		case 8: resultName = "시바스리갈"; break;
		case 9: resultName = "몽키 숄더"; break;
		}

	    System.out.printf("%s가 10L 채워졌습니다. " , resultName);
	}
	
	
	@Override
	protected int alcoholRun()
	{
		list();
		int result = alcoholChoose();

		//alcoholReturn(al);
	
		return result;
	
	}



}


