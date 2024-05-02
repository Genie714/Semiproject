import java.io.Serializable;

public class Admin implements Serializable
{
	private int adminMoney;
	private static Admin instance;

	Admin()
	{
		adminMoney = 0;
	}

	Admin(int money)
	{
		setAdminMoney(money);
	}
	
	public static Admin getInstance()
	{
		if (instance == null)
		{
			instance = new Admin();
		}
		return instance;
	}
	public void setAdminMoney(int money)
	{
		adminMoney = money;
	}

	public void subAdminMoney(int money)
	{
		adminMoney -= money; 
	}

	public void giveJackpotPrize(int jackpotPrize)
	{
		subAdminMoney(jackpotPrize);
	}

	public void addAdminmoney(int money)
	{
		adminMoney += money;
	}
	
	//테스트용 메소드
	public int getAdminMoney()
	{
		return adminMoney;
	}

	//주류 넣어야 하나?
}