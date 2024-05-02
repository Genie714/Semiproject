import java.util.Scanner;

public class ChangeMoney extends ReturnMoney
{
	protected int won500Ea = 2000;
	@Override
	public void enterMoney()
	{
		
		Admin ad = Admin.getInstance();
		ad.subAdminMoney(500);

		won500Ea--;
	}
	
	@Override
	public void returnMoney(int charge)
	{
		// charge == 거스름돈
		int man = charge / WON10KVAL;
		int ochun = (charge % WON10KVAL) / WON5KVAL;
		int chun = (charge % WON5KVAL) / WON1KVAL;
		int check = 0;

		int finalcharge = man*WON10KVAL + ochun*WON5KVAL + chun*WON1KVAL;

		//ex) 남는돈 금액 유형 -> 300 500 800
		// 500미만일 시 그냥 반환
		// 500일 시 바로 참가여부 질문
		// 500초과일 시 500을 남기고 (거스름돈-500) 한 금액 반환
		Buyer by = Buyer.getInstance();

		if (charge-finalcharge < 500)
		{
			finalcharge = charge;
			System.out.printf("%d원이 반환되었습니다.\n", finalcharge);
			by.buyerAddMoney(finalcharge);
			return;
		}
		else if (charge-finalcharge == 500)
		{		
			Scanner sc = new Scanner(System.in);
			System.out.printf("%d원이 반환되었습니다.\n", finalcharge);
			System.out.print("참가하시겠습니까?(1.참가 2.잔돈반환) : ");
			check = sc.nextInt();
		}
		else
		{
			finalcharge = charge-500;

			Scanner sc = new Scanner(System.in);
			System.out.printf("%d원이 반환되었습니다.\n", finalcharge);
			System.out.print("참가하시겠습니까?(1.참가 2.잔돈반환) : ");
			check = sc.nextInt();
		}

		if (check == 1)
		{
			RouletteCal exe = new RouletteCal();
			exe.print(); // 임의
		}
		else
		{
			System.out.println("500원이 추가로 반환되었습니다.");
			finalcharge = finalcharge + 500;
		}
		
		by.buyerAddMoney(finalcharge);
	}
}
	
	
	
