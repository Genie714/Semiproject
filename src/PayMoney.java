import java.util.Scanner;

public class PayMoney
{
	private int salesMoney=0;

	
	public void inputMoney(int money)
	{
		salesMoney += money;	
	}
	

	public void outputSalesMoney()
	{
		Admin ad = Admin.getInstance();
		
		ad.addAdminmoney(salesMoney); // �Է¹��� ���� ���������� �ѱ�

		//System.out.printf("���� ���뿡 %d���� �׿��ֽ��ϴ�\n",salesMoney);	// �׽�Ʈ�� ����

		salesMoney = 0;				  // �Ѱ������� �ٽ� �ʱ�ȭ

		//System.out.printf("���� ���뿡 %d���� �׿��ֽ��ϴ�.\n",salesMoney); // �׽�Ʈ�� ����
	}
}


