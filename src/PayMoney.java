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
		
		ad.addAdminmoney(salesMoney); // 입력받은 돈을 관리자한테 넘김

		//System.out.printf("현재 돈통에 %d원이 쌓여있습니다\n",salesMoney);	// 테스트용 문구

		salesMoney = 0;				  // 넘겨줬으니 다시 초기화

		//System.out.printf("현재 돈통에 %d원이 쌓여있습니다.\n",salesMoney); // 테스트용 문구

	}
}