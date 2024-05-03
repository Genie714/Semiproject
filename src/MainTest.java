/*순서
 * 객체불러오기 or 객체 생성하기
 * 자판기 안내 및 잭팟예정금 디스플레이
 * Alcohol 클래스 진행
 * 룰렛 클래스 진행
 * 당첨금 반환
 * 객체 내보내기 */

import java.util.Scanner;

public class MainTest
{
	public static void main(String[] args) throws Exception
	{
		// 객체 불러오기 → 미구현 임시 클래스 인스턴스 생성
//		LoadObject lo = new LoadObject();
//		lo.loadObject();
		
		
		//자판기 안내 및 잭팟 예정금 디스플레이
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		print();
		pmd.showTotalPrize();
		

		
		//Alcohol 클래스 진행(Alcohol 복사 붙여넣기)
		SingleItem ob1 = new SingleItem();
		PresetCocktail ob2 = new PresetCocktail();
		CustomCocktail ob3 = new CustomCocktail();
		
		if(a==1)
		{
			ob1.alcoholRun();
			// 잔돈 반환 //룰렛 클래스 진행
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob1.change(al));
		}
		
		if(a==2)
		{	
			ob2.alcoholRun();
			// 잔돈 반환 //룰렛 클래스 진행
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob2.change(al));
		}
		
		if(a==3)
		{
			ob3.alcoholRun();
			// 잔돈 반환 //룰렛 클래스 진행
			ChangeMoney cm = new ChangeMoney();
			cm.returnMoney(ob3.change(price));

		}
		
		//당첨금 반환
		
		
		
		//객체 내보내기 → 미구현
		//SaveObject so = new SaveObject();
		
		//so.saveObject(ad,buy,alc);
		
	}
	

	private static void print()
	{
		System.out.println("=====================================");
		System.out.println(" ■■■ 500룰렛 칵테일 자판기 ■■■");
		System.out.println("=====================================");

		Scanner sc = new Scanner(System.in);
		System.out.print("3가지 유형 중 하나를 선택하세요 (① 단품 / ② 프리셋(칵테일) / ③ 커스텀(칵테일) : ");
		int a = sc.nextInt();

	}
}