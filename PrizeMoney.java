public class PrizeMoney
{
	protected int won50kEa = 20;
	protected int won10kEa = 100;
	protected int won5kEa = 200;
	protected int won1kEa = 2000;

	int defaultPrize = 5000000;		// ��÷���� �ݾ� (500��) --> ���� �귿 ���÷��̿����� (10��+490n) ��ŭ ǥ����


	public void prizeMoney(String res)
	{
		Admin ad = Admin.getInstance();
		Buyer by = Buyer.getInstance();
		String result = res;
		
		int prize=0;
		
		/*
		if (result == "aaa")
		{
			System.out.println("�ʸ����� ��÷�Ǽ̽��ϴ�");	// ���� ����(���߿� �ٲܰ�)
			prize = 100000;	// �ӽ÷� �� ����
			won50kEa = won50kEa - 2;
		}
		else if (result == "bbb")
		{
			System.out.println("����õ���� ��÷�Ǽ̽��ϴ�");
			prize = 15000;
			won5kEa = won5kEa - 1;
			won10kEa = won10kEa - 1;
		}
		else if (result == "ccc")
		{
			System.out.println("��õ���� ��÷�Ǽ̽��ϴ�.");
			prize = 5000;
			won5kEa --;
		}
		else if (result == "ddd")
		{
			System.out.println("õ���� ��÷�Ǽ̽��ϴ�.");
			prize = 1000;
			won1kEa --;
		}
		else if (result == "777")
		{
			System.out.println("���� ���� ��÷�� ������ ã�ư���");
		}
		else
		{
			System.out.println("���� ���� ");
		}
		*/

		switch (result) {
            case "aaa":
                System.out.println("100,000�� ��÷");
                prize = 100000;
				won50kEa = won50kEa - 2;
				break;
                
            case "bbb":
                System.out.println("15,000�� ��÷");
                prize = 15000;
				won5kEa = won5kEa - 1;
				won10kEa = won10kEa - 1;
				break;
                
            case "ccc":
                System.out.println("5,000�� ��÷");
                prize = 5000;
				won5kEa --;
				break;
                
            case "ddd":
                System.out.println("1,000�� ��÷");
                prize = 1000;
				won1kEa --;
				break;
                
            case "777":
                System.out.println("!!!JACKPOT!!!");
                System.out.println("��÷���� �����ڿ��� �޾ư�����");	// ������ ȣ�� �߰�
				break;
                
            default:
                System.out.println("����!");
                
        }

		by.buyerAddMoney(prize);	// �����ڿ��� �� ��
		defaultPrize = defaultPrize - prize; // ���� ��÷�� ���뿡�� ��÷ �ݾ׸�ŭ ����
		
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
			defaultPrize = 5000000;

			won50kEa = 100;
			won10kEa = 100;
			won10kEa = 200;	
			won1kEa = 2000;

			ad.subAdminMoney(5000000 - defaultPrize);
			
			
		} // �ٽ� ä���ֱ�
		
		//System.out.printf("���� ���������� %d, �������� %d�� �����ֽ��ϴ�.\n", won50kEa, won10kEa); // �׽�Ʈ ����( ���߿� ����� )
		
	}
	
}