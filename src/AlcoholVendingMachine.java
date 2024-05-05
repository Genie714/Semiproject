import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine											// 상위클래스
{

	private AlcoholVendingMachine avmArr[] = new AlcoholVendingMachine[3];		// 상위 클래스 객체배열 생성
	
	
	protected abstract void list();												// 술 리스트
	
	
	protected int alcoholChoose()												// 술을 선택하는 메소드
	{
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("술을 선택하시오 : ");
		al = sc.nextInt();
		return al;
	}
	
	
	protected abstract void alcoholReturn(int al);								// 술을 반환하는 메소드
	
	
	protected abstract int stock(int al);										// 모든 종류의 술 재고 정리해주는 메소드
	
	
	protected abstract int alcoholPrice(int al);								// 술 가격 책정하는 메소드
	
	
	protected static void enterMoney()											// 돈 입력 출력문 메소드
	{
		System.out.print("돈을 입력하시오 : ");   
	}
	
	
	protected int getMoney()													// 돈 입력받는 메소드
	{
		Scanner sc = new Scanner(System.in);  
		int money = sc.nextInt();

		PayMoney pm = PayMoney.getInstance();
		pm.inputMoney(money);

		return money;
	}


	protected abstract int alcoholRun();										// 돈 지불 전까지의 단계를 모두 담은 메소드


	protected abstract int change(int al);										// 고른 술의 최종값을 입력받은 값에서 빼주는 메소드

	
	


	
	
	
	static void vmRun() throws Exception										// 최종 모든 기능 구현하는 메소드
	{
		Scanner sc = new Scanner(System.in);
    
		char check;
		String add;
		int a;
		int al;
		int priceAdd12=0;
		int priceAdd3=0;
		int priceAll=0;
		
		
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		ChangeMoney cm = new ChangeMoney();
		
		
		SingleItem ob1 = new SingleItem();
        PresetCocktail ob2 = new PresetCocktail();
        CustomCocktail ob3 = new CustomCocktail();
		
		
   	    AlcoholVendingMachine[] avmArr = new AlcoholVendingMachine[3];
		
		avmArr[0] = ob1;					// → SingleItem 객체배열(업캐스팅)
   	    avmArr[1] = ob2;					// → PresetCocktail 객체배열(업캐스팅)
   	    avmArr[2] = ob3;					// → CustomCocktail 객체배열(업캐스팅)
		
		
   	    while (true)
	    {
			System.out.print("3가지 유형 중 하나를 선택하세요 (① 단품 / ② 프리셋(칵테일) / ③ 커스텀(칵테일) : "); 
			a = sc.nextInt();
			
   	        if (a==1 || a==2)
	        {
				al = avmArr[a-1].alcoholRun();
				priceAdd12 += avmArr[a-1].alcoholPrice(al);
			   
	        }
			if (a==3)
			{
				priceAdd3 = avmArr[a-1].alcoholRun();
				
			}
			
			priceAll = priceAdd12 + priceAdd3;				// 술을 다 고른 후 누적된 최종 가격
			
			
			System.out.println();
      		System.out.print("돈 입력 전 술을 추가로 선택하시겠습니까?(Y/N) : ");
            add = sc.next();
            check = add.charAt(0);
      
            if (check != 'y' && check != 'Y')
            {
                  break;
            }
			
      		 
     	}// close while
		System.out.println();
		
		enterMoney();
		cm.returnMoney(avmArr[a-1].change(priceAll),pmd);		// 최종가격 priceAll을 change메소드에 담아 잔돈 계산
					
	}




}
