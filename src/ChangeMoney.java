import java.util.Scanner;

public class ChangeMoney extends ReturnMoney
{

	protected int won500Ea = 2000;
	int finalcharge;
	int totalVal;
	
	//@Override
	public void returnMoney(int charge, PrizeMoneyDisplay pmd)	// �Ž����� �Ѱܹ���
	{
		//System.out.printf("���� �Ž����� �뿡 ����ִ� ���� %d�� �Դϴ�.\n",totalVal);
		// charge == �Ž�����
		int man = charge / WON10KVAL;
		int ochun = (charge % WON10KVAL) / WON5KVAL;
		int chun = (charge % WON5KVAL) / WON1KVAL;
		int check = 0;

		finalcharge = man*WON10KVAL + ochun*WON5KVAL + chun*WON1KVAL;

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
			System.out.printf("500���� ������ %d���� ��ȯ�Ǿ����ϴ�.\n", finalcharge);
			System.out.print("500������ �귿�� �����Ͻðڽ��ϱ�?(1->���� 2->500����ȯ) : ");
			check = sc.nextInt();
		}
		else
		{
			finalcharge = charge-500;

			Scanner sc = new Scanner(System.in);
			System.out.printf("500���� ������ %d���� ��ȯ�Ǿ����ϴ�.\n", finalcharge);
			System.out.print("500������ �귿�� �����Ͻðڽ��ϱ�?(1->���� 2->500����ȯ) : ");
			check = sc.nextInt();
		}

		if (check == 1)	// �����߾�
		{
			//PrizeMoneyDisplay.stack();//: dp�� 490�� �߰��� ������ ���Ӱ� �����ش�.
			pmd.stack();
			RouletteCal exe = new RouletteCal();
			exe.rand(check,pmd);
		}
		else
		{
			System.out.println("500���� �߰��� ��ȯ�Ǿ����ϴ�.");
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
		if (won10kEa <= 1 || won5kEa <= 1 || won1kEa <= 1||won500Ea <= 1) // Ư�� �ݾװ����� 1 ���ϰ� �Ǹ� ����
		{
			won10kEa = 100;
			won5kEa = 200;	
			won1kEa = 2000;
			won500Ea = 2000;

			Admin ad = Admin.getInstance();
			ad.subAdminMoney(fill);

			//System.out.printf("%d ���� ������ �������� �������ϴ�", fill); // �׽�Ʈ����
		}
		else
			return;
	}
}
	
	
	
