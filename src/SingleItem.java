// AlcoholVendingMachine 클래스 상속받는 클래스 설계

import java.io.*;
import java.util.*;

class SingleItem extends AlcoholVendingMachine
{

	//Map<String,Integer> price = new HashMap<String,Integer>();

	
	//private int soju=1000;
	//private int beer=10000;
	//private int somac=10000;
	//private int cognac=10000;
	//private int valentine=10000;
	//private int tequila=10000;
	//private int johnny=10000;
	//private int chivas=10000;
	//private int monkey=10000;
	static int[] stock = {1000,10000,10000,10000,10000,10000,10000,10000,10000}; //1번 소주 2번 맥주 3번 소맥 4번 꼬냑 5번 발렌타인 6번 데킬라
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
	protected String alcoholReturn(int al)
	{
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
		
		return resultName;
		//System.out.println(resultName);
		
		//map.put(resultName,300);
		//System.out.println(map);

	}
	
	
	@Override
	protected void list()
	{	
		//Map<String,Integer> price = new HashMap<String,Integer>();

		//Map<String,Integer> price = new HashMap<String,Integer>();

		

		//map.put()
		
		System.out.println();
		
		if (stock[0]<=100)
		{
			System.out.printf("1 %s(매진)              (%d￦)    ","소주",7500);
		}
		else if (stock[0]>100)
		{
			System.out.printf("1 %s                    (%d￦)    ","소주",7500);
		}
		if (stock[1]<=100)
		{
			System.out.printf("2 %s(매진)       (%d￦)    ","맥주",9500);
		}
		else if (stock[1]>100)
		{
			System.out.printf("2 %s             (%d￦)    ","맥주",9500);
		}
		if (stock[2]<=100)
		{
			System.out.printf("3 %s(매진)      (%d￦)\n","소맥",8500);
		}
		else if (stock[2]>100)
		{
			System.out.printf("3 %s            (%d￦)\n","소맥",8500);
		}
		if (stock[3]<=100)
		{
			System.out.printf("4 %s(매진)              (%d￦)   ","꼬냑",18500);
		}
		else if (stock[3]>100)
		{
			System.out.printf("4 %s                    (%d￦)   ","꼬냑",18500);
		}
		if (stock[4]<=100)
		{
			System.out.printf("5 %s(매진) (%d￦)   ","발렌타인12",11500);
		}
		else if (stock[4]>100)
		{
			System.out.printf("5 %s       (%d￦)   ","발렌타인12",11500);
		}
		if (stock[5]<=100)
		{
			System.out.printf("6 %s(매진)    (%d￦)\n","데킬라",10500);
		}
		else if (stock[5] > 100)
		{
			System.out.printf("6 %s          (%d￦)\n","데킬라",10500);
		}
		if (stock[6]<=100)
		{
			System.out.printf("7 %s(매진) (%d￦)   ","조니워커 블랙라벨", 14500);
		}
		else if (stock[6]>100)
		{
			System.out.printf("7 %s       (%d￦)   ","조니워커 블랙라벨", 14500);
		}
		if (stock[7]<=100)
		{
			System.out.printf("8 %s(매진) (%d￦)   ","시바스리갈",12500);
		}
		else if (stock[7] > 100)
		{
			System.out.printf("8 %s       (%d￦)   ","시바스리갈",12500);
		}
		if (stock[8] <= 100)
		{
			System.out.printf("9 %s(매진) (%d￦)\n","몽키 숄더",13500);
		}
		else  if (stock[8]>100)
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


	
	/*
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
	*/
	
	
	
	@Override
	protected void stock(int al)												// 술을 선택하는 메소드
	{
		if(stock[al-1]<100)
		{
			System.out.print("매진인 상품인 입니다.");
			return;
		}
		/*
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
		*/
		// 대진
		stock[al-1] -= 300;
		//alcoholReturn(al);
		System.out.printf("소주 잔량 : %d\n", stock[al-1]);
		//return 재고;
		
		/*
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
		*/
		
		
		
		
	
		//테스트(확인)
		//System.out.printf("술 잔량 : %d\n", soju);
		//System.out.printf("술 잔량 : %d", beer);
		//System.out.printf("술 잔량 : %d\n", somac);
		
	
	}
	
	
	@Override
	protected void enterStock()
	{
		System.out.printf("소주 %d을 채웠습니다. ", 10000-stock[0]);
		System.out.printf("맥주 %d을 채웠습니다. ", 10000-stock[1]);
		System.out.printf("소맥 %d을 채웠습니다. ", 10000-stock[2]);
		System.out.printf("꼬냑 %d을 채웠습니다. ", 10000-stock[3]);
		System.out.printf("발렌타인12 %d을 채웠습니다. ", 10000-stock[4]);
		System.out.printf("데킬라 %d을 채웠습니다. ", 10000-stock[5]);
		System.out.printf("조니워커 블랙라벨 %d을 채웠습니다. ", 10000-stock[6]);
		System.out.printf("시바스리갈 %d을 채웠습니다. ", 10000-stock[7]);
		System.out.printf("몽키숄더 %d을 채웠습니다. ", 10000-stock[8]);
		stock[0] = 10000;
		stock[1] = 10000;
		stock[2] = 10000;
		stock[3] = 10000;
		stock[4] = 10000;
		stock[5] = 10000;
		stock[6] = 10000;
		stock[7] = 10000;
		stock[8] = 10000;

	}
	
	
	


}


