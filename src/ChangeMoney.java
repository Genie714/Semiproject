import java.util.Scanner;

public class ChangeMoney extends ReturnMoney
{

	protected int won500Ea = 2000;
	int finalcharge;
	int totalVal;
	
	//@Override
	public void returnMoney(int charge, PrizeMoneyDisplay pmd)	// 거스름돈 넘겨받음
	{
		//System.out.printf("현재 거스름돈 통에 들어있는 돈은 %d원 입니다.\n",totalVal);
		// charge == 거스름돈
		int man = charge / WON10KVAL;
		int ochun = (charge % WON10KVAL) / WON5KVAL;
		int chun = (charge % WON5KVAL) / WON1KVAL;
		int check = 0;

		finalcharge = man*WON10KVAL + ochun*WON5KVAL + chun*WON1KVAL;

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
			System.out.printf("500원을 제외한 %d원이 반환되었습니다.\n", finalcharge);
			System.out.print("500원으로 룰렛에 참가하시겠습니까?(1->참가 2->500원반환) : ");
			check = sc.nextInt();
		}
		else
		{
			finalcharge = charge-500;

			Scanner sc = new Scanner(System.in);
			System.out.printf("500원을 제외한 %d원이 반환되었습니다.\n", finalcharge);
			System.out.print("500원으로 룰렛에 참가하시겠습니까?(1->참가 2->500원반환) : ");
			check = sc.nextInt();
		}

		if (check == 1)	// 참가했어
		{
			//PrizeMoneyDisplay.stack();//: dp에 490원 추가된 값으로 새롭게 보여준다.
			pmd.stack();
			RouletteCal exe = new RouletteCal();
			exe.rand(check,pmd);
		}
		else
		{
			System.out.println("500원이 추가로 반환되었습니다.");
			finalcharge = finalcharge + 500;
			won500Ea --;
		}
		
		by.buyerAddMoney(finalcharge);

		 won10kEa = won10kEa - man;
		 won5kEa = won5kEa - ochun;
		 won1kEa = won1kEa - chun;

		 int totalVal = (won10kEa*WON10KVAL) + (won5kEa*WON5KVAL) + (won1kEa*WON1KVAL) + (won500Ea*500);
	}

	@Override
	public void enterMoney()
	{
		int fill = 5000000 - totalVal;
		if (won10kEa <= 1 || won5kEa <= 1 || won1kEa <= 1||won500Ea <= 1) // 특정 금액갯수가 1 이하가 되면 실행
		{
			won10kEa = 100;
			won5kEa = 200;	
			won1kEa = 2000;
			won500Ea = 2000;

			Admin ad = Admin.getInstance();
			ad.subAdminMoney(fill);

			//System.out.printf("%d 원이 관리자 계정에서 빠졌습니다", fill); // 테스트문구
		}
		else
			return;
	}
}
	
	
	
