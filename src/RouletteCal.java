class RouletteCal   // chageMoney Ŭ�������� whetherRunRoulette()�� return 1 or 0. 1-> �귿 ����.
{
    char[] arr = new char[3];

    // ����ƽ �ϸ� ���Ұ� �����ѵ�

    public void rand(int start,PrizeMoneyDisplay pmd) // 1 ������
    {
        if(start ==1)
        {
            String res = "";
			System.out.println("===========================");
            System.out.println("\t���� ����");
			System.out.println("===========================");

            double rand;
            double roun;

            //countPlay++;    // ������� ��� �÷��� �߳� ��� -> �Ŀ� ������δ� ������ �󸶳� �̾Ƴ³� ������

            for (int i = 0; i < 3; i++)    // �迭 3ĭ�� �ɺ��� �ִ� ���� + String���� �̰� ������
            {
                rand = (Math.random() * 100);
                roun = Math.round(rand * 100) / 100.0;
                if (roun >= 0.00 && roun < 10.00)
                    arr[i] = 'a';
                else if (roun >= 10.00 && roun < 30.00)
                    arr[i] = 'b';
                else if (roun >= 30.00 && roun < 60.00)
                    arr[i] = 'c';
                else if (roun >= 60.00 && roun < 99.97)
                    arr[i] = 'd';
                else
                    arr[i] = '7';
                res = res + arr[i];
            }
			
            System.out.println(">>>  " + res + "  <<<");

			
			PrizeMoney pm = new PrizeMoney();
			pm.prizeMoney(res,pmd);
        }
        else
        {
            System.exit(-1);
            
        }
    }	
}