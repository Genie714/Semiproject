/* 관리자가 이용하는 메뉴 구현
 * 주요 기능 : 1. 자판기 정보 확인 2. 자판기 재고 관리
 * 세부 사항 : - 각 클래스 생성되어 있는 개체 불러오기
 * 			   - 각 클래스의 속성에 접근하여 값 가져오기
 * 			   - 메소드를 이용하여 클래스의 속성에 접근하기
 * */

import java.util.Scanner;

public class AdminMode
{
	public static void adminMenu()
	{
		//인스턴스 생성
		Scanner sc = new Scanner(System.in);
		PrizeMoneyDisplay pmd = PrizeMoneyDisplay.getInstance();
		PayMoney pm = PayMoney.getInstance();
		
		//변수 선언
		int adminChoose;
		
		//목록 출력
		//1. 자판기 산출 정보 확인 
		//매출 / 이용횟수(자판기,룰렛), / 당첨횟수(종류 및 횟수) / 인기메뉴
		//2. 자판기 재고 관리
		// 각 상품 재고관리/ 각 돈통재고관리 /
		System.out.println("========================");
		System.out.println("■■■ ADMIN MENU ■■■");
		System.out.println("========================");
		System.out.println("1. 자판기 정보 확인");
		System.out.println("■ 매출 ■자판기 이용횟수(칵테일) ■룰렛 통계(이용횟수, 당첨횟수, 당첨금액) ■인기메뉴");
		System.out.println("2. 자판기 재고 관리");
		System.out.println("■ 상품 재고관리 ■ 금전관리");
		System.out.print("메뉴 선택 : ");
		
		do
		{
			adminChoose = sc.nextInt();
		}
		while(adminChoose < 1 || adminChoose > 2);
		
		if (adminChoose == 1)
		{
			System.out.println("\n[자판기 정보 확인]");
			System.out.printf("1. 매출 : %d원\n", pm.getSalesMoney());//매출통의 salesMoney
			System.out.printf("2. 칵테일 구매 횟수 : %d회\n", 150);//칵테일 구매횟수 카운트//인기메뉴 연동
			System.out.println("3. 룰렛 통계");
			System.out.println("========================");
			System.out.printf("■ 룰렛 참여 횟수 : %d", pmd.countPlay);// 룰렛 참여 횟수 카운트
			System.out.printf("■ 룰렛 당첨 횟수 : 총 %d회 총 %d원", 100,10000);// 아래 변수 설정되면 합침
			System.out.printf("\t- aaa : %d회 %d원\n", pmd.aaa, (pmd.aaa * 100000));
			System.out.printf("\t- bbb : %d회 %d원\n", pmd.bbb, (pmd.bbb * 15000));
			System.out.printf("\t- ccc : %d회 %d원\n", pmd.ccc, (pmd.ccc * 5000));
			System.out.printf("\t- ddd : %d회 %d원\n", pmd.ddd, (pmd.ddd * 1000));
			System.out.printf("\t- 777 : %d회 %d원\n", pmd.seven3, 1000000);	 // 상의 필요
			System.out.println("========================");
			
		}
		else if(adminChoose == 2)
		{
			System.out.println("\n[자판기 재고 관리]");
			System.out.println("1. 상품 재고 관리");
			System.out.println("2. 자판기 금전 관리");
			int adminChoose2;
			do
			{
				adminChoose2 = sc.nextInt();
				
			}
			while(adminChoose2<1 || adminChoose2>2);
			
			if(adminChoose2==1)
			{
				//상품 재고 채우는 메소드 사용
				//얼마나 채웠는지 보여주기 
			}
			else if(adminChoose2==2)
			{
				//0. 관리자에게 안내
				System.out.println("1. 매출액 반환");
				System.out.println("2. 반환액 재고 입력");
				int adminChoose3;
				do
				{
					adminChoose3 = sc.nextInt();
				}
				while(adminChoose3<1 ||adminChoose3>2);
				//1.매출통에서 돈을 빼기
				if (adminChoose3 ==1)
				{
					System.out.printf("매출액 %d원을 반환하겠습니다.", pm.getSalesMoney());
					pm.outputSalesMoney();
				}
				//2.거스름 및 보상 돈통 채우기
				
			}
		}
	}
}