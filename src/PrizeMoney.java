public class PrizeMoney
{
	protected int won50kEa = 20;
	protected int won10kEa = 100;
	protected int won5kEa = 200;
	protected int won1kEa = 2000;

	int defaultPrize = 5000000;		// ��÷���� �ݾ� (500��) --> ���� �귿 ���÷��̿����� (10��+490n) ��ŭ ǥ����
	private static PrizeMoney instance;
	

	public static PrizeMoney getInstance()
	{
		if (instance == null)
		{
			instance = new PrizeMoney();
		}
		return instance;
	}


	public void prizeMoney(String res,PrizeMoneyDisplay pmd)
	{
		
		Admin ad = Admin.getInstance();
		Buyer by = Buyer.getInstance(); 

		String result = res;
		
		int prize=0;

		switch (result) {
            case "aaa":
                System.out.println("50,000�� ��÷");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				// pmd.stack();
				// pmd.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 50000;
				
				won50kEa = won50kEa - 1;

						///////
				defaultPrize = defaultPrize - prize;
				System.out.printf("���� ���뿡 �����ִ� ���� %d���Դϴ�.\n",defaultPrize);		///////(�׽�Ʈ����)
				break;
                
            case "bbb":
                System.out.println("15,000�� ��÷");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 15000;
				won5kEa = won5kEa - 1; 
				won10kEa = won10kEa - 1;

					///////
				defaultPrize = defaultPrize - prize;
				System.out.printf("���� ���뿡 �����ִ� ���� %d���Դϴ�.\n",defaultPrize);		///////(�׽�Ʈ����)
				break;
                
            case "ccc":
                System.out.println("5,000�� ��÷");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 5000;
				won5kEa --;

						///////
				defaultPrize = defaultPrize - prize;
				System.out.printf("���� ���뿡 �����ִ� ���� %d���Դϴ�.\n",defaultPrize);		///////(�׽�Ʈ����)
				break;
                
            case "ddd":
                System.out.println("1,000�� ��÷");
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                prize = 1000;
				won1kEa --;
				
				
				defaultPrize = defaultPrize - prize;		///////
				System.out.printf("���� ���뿡 �����ִ� ���� %d���Դϴ�.\n",defaultPrize);		///////(�׽�Ʈ����)
				break;
                
            case "777":
                System.out.println("!!!JACKPOT!!!");
                System.out.println("��÷���� �����ڿ��� �޾ư�����");	// ������ ȣ�� �߰�
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
				break;
                
            default:
				//PrizeMoneyDisplay.setTotalPrizeMoney(result);
				pmd.setTotalPrizeMoney(result);
                System.out.println("����!");
				System.out.printf("���� ���뿡 �����ִ� ���� %d���Դϴ�.\n",defaultPrize);
                
        }

		by.buyerAddMoney(prize);	// �����ڿ��� �� ��
		//defaultPrize = defaultPrize - prize; // ���� ��÷�� ���뿡�� ��÷ �ݾ׸�ŭ ����
		
		//System.out.printf("���� %d��ŭ�� ���� �����ֽ��ϴ�.\n", defaultPrize); // �׽�Ʈ ����( ���߿� ����� )

		if (defaultPrize <= 100000)			// ������ 10���� ���ϰ� �Ǹ�
		{
			ad.subAdminMoney(5000000 - defaultPrize);		// ���������׼� 500���� �ʿ��� �ݾ׸�ŭ ����
			defaultPrize = 5000000;							// �ٽ� 500���� ä���ְ�
			

			won50kEa = 100;
			won10kEa = 100;
			won5kEa = 200;	
			won1kEa = 2000;					// ����鵵 �� �ٽ� ä���
		}
		else if (won50kEa <= 1 || won10kEa <= 1 || won5kEa <= 1 || won1kEa <= 1) // Ư�� ���� 1��ۿ� �ȳ�����
		{
			ad.subAdminMoney(5000000 - defaultPrize);

			defaultPrize = 5000000;

			won50kEa = 100;
			won10kEa = 100;
			won5kEa = 200;	
			won1kEa = 2000;
			
		} // �ٽ� ä���ֱ�
		
		//System.out.printf("���� ���������� %d, �������� %d�� �����ֽ��ϴ�.\n", won50kEa, won10kEa); // �׽�Ʈ ����( ���߿� ����� )
		
	}
	
}