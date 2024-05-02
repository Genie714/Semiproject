//import java.io.Serializable;

public class Buyer // implements Serializable
{
	private static Buyer instance;
	private int buyerMoney;
	//private 자료구조 buyAlc;

	Buyer()
	{
		buyerMoney = 0;
	}

	Buyer(int money)
	{
		setBuyerMoney(money);
	}

	public static Buyer getInstance()
	{
		if (instance == null)
		{
			instance = new Buyer();
		}
		return instance;
	}

	private void setBuyerMoney(int money)
	{
		buyerMoney = money;
	}

	public void buyerAddMoney(int money)
	{
		buyerMoney += money;
	}

	public void buyerSubMoney(int money)
	{
		buyerMoney -= money;
	}
}