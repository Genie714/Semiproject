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
		// charge == �Ž�����
		int man = charge / WON10KVAL;
		int ochun = (charge % WON10KVAL) / WON5KVAL;
		int chun = (charge % WON5KVAL) / WON1KVAL;
		int check = 0;

		int finalcharge = man*WON10KVAL + ochun*WON5KVAL + chun*WON1KVAL;

		//ex) ���µ� �ݾ� ���� -> 300 500 800
		// 500�̸��� �� �׳� ��ȯ
		// 500�� �� �ٷ� �������� ����
		// 500�ʰ��� �� 500�� ����� (�Ž�����-500) �� �ݾ� ��ȯ
		Buyer by = Buyer.getInstance();

		if (charge-finalcharge < 500)
		{
			finalcharge = charge;
			System.out.printf("%d���� ��ȯ�Ǿ����ϴ�.\n", finalcharge);
			by.buyerAddMoney(finalcharge);
			return;
		}
		else if (charge-finalcharge == 500)
		{		
			Scanner sc = new Scanner(System.in);
			System.out.printf("%d���� ��ȯ�Ǿ����ϴ�.\n", finalcharge);
			System.out.print("�����Ͻðڽ��ϱ�?(1.���� 2.�ܵ���ȯ) : ");
			check = sc.nextInt();
		}
		else
		{
			finalcharge = charge-500;

			Scanner sc = new Scanner(System.in);
			System.out.printf("%d���� ��ȯ�Ǿ����ϴ�.\n", finalcharge);
			System.out.print("�����Ͻðڽ��ϱ�?(1.���� 2.�ܵ���ȯ) : ");
			check = sc.nextInt();
		}

		if (check == 1)
		{
			RouletteCal exe = new RouletteCal();
			exe.print(); // ����
		}
		else
		{
			System.out.println("500���� �߰��� ��ȯ�Ǿ����ϴ�.");
			finalcharge = finalcharge + 500;
		}
		
		by.buyerAddMoney(finalcharge);
	}
}
	
	
	
