 abstract public class ReturnMoney
{
	protected int won10kEa = 100;
	protected int won5kEa = 200;
	protected int won1kEa = 2000;

	final int WON10KVAL = 10000;
	final int WON5KVAL = 5000;
	final int WON1KVAL = 1000;

	abstract public void enterMoney();

	abstract public void returnMoney(int money);

}