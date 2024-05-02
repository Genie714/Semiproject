import java.util.Scanner;

public class PayMoney
{
	private int salesMoney=0;

	/*
	public int inputMoney()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("돈을 입력하세요 : ");
		int money =  sc.nextInt();
		return money;
		
	}
	*/

	public void outputSalesMoney(int money)
	{
		Admin ad = Admin.getInstance();
		salesMoney += money;
		ad.addAdminmoney(salesMoney); // 입력받은 돈을 관리자한테 넘김
		
	}
}


