import java.util.Scanner;

public class PayMoney
{
	private int salesMoney=0;

	private static PayMoney instance;
	

	public static PayMoney getInstance()
	{
		if (instance == null)
		{
			instance = new PayMoney();
		}
		return instance;
	}
 
	
	public void inputMoney(int money)
	{
		salesMoney += money;	
	}
	

	public void outputSalesMoney()
	{
		Admin ad = Admin.getInstance();
		ad.addAdminmoney(salesMoney); 
		
		salesMoney = 0;				  
	}
}