import java.util.Scanner;

public class AdminMode
{
	public static void adminMenu()
	{
		Scanner sc = new Scanner(System.in);
		
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
		
		int adminChoose;
		do
		{
			adminChoose = sc.nextInt();
		}
		while(adminChoose < 1 || adminChoose > 2);
		
		if (adminChoose == 1)
		{
			System.out.println("\n[자판기 정보 확인]");
			System.out.printf("1. 매출 : %d원\n", 123);//매출통의 salesMoney
			System.out.printf("2. 칵테일 구매 횟수 : %d회\n", 150);//칵테일 구매횟수 카운트//인기메뉴..?
			System.out.println("3. 룰렛 통계");
			System.out.println("========================");
			System.out.printf("■ 룰렛 참여 횟수 : %d", 100);// 룰렛 참여 횟수 카운트
			System.out.printf("■ 룰렛 당첨 횟수 : 총 %d회 총 %d원", 100,10000);// 아래 변수 설정되면 합침
			System.out.printf("\t- aaa : %d회 %d원\n", 10, 1000000);
			System.out.printf("\t- bbb : %d회 %d원\n", 10, 1000000);
			System.out.printf("\t- ccc : %d회 %d원\n", 10, 1000000);
			System.out.printf("\t- ddd : %d회 %d원\n", 10, 1000000);
			System.out.printf("\t- 777 : %d회 %d원\n", 10, 1000000);
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
				//상품 재고 채움
				//얼마나 채웠는지 보여주기
			}
			else if(adminChoose2==2)
			{
				//1.매출통에서 돈을 빼기
				//2.거스름 및 보상 돈통 채우
			}
		}
	}
}