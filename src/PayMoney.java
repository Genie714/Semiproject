import java.util.Scanner;

public class PayMoney
{
	private int salesMoney=0;

	/*
	public int inputMoney()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int money =  sc.nextInt();
		return money;
		
	}
	*/

	public void outputSalesMoney(int money)
	{
		Admin ad = Admin.getInstance();
		salesMoney += money;
		ad.addAdminmoney(salesMoney); // �Է¹��� ���� ���������� �ѱ�
		
	}
}


