import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine					// 상위클래스
{
	

	protected abstract void alcoholReturn(int al);		// 술을 반환하는 메소드
	
	protected abstract void list();						// 술 리스트
		
	protected abstract int change(int al);				// 고른 술에 대한 값을 입력받은 값에서 빼주는 메소드
	
	protected int alcoholChoose()						// 술을 선택하는 메소드
	{
		
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("술을 선택하시오 : ");
		al = sc.nextInt();
		return al;
	}
	

	protected int getMoney()							// 돈 입력받는 메소드
	{
		PayMoney pm = PayMoney.getInstance();
		pm.inputMoney(money);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("돈을 입력하시오 : ");
		int money = sc.nextInt();

		return money;
	}

}
