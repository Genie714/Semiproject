class RouletteCal   // chageMoney Ŭ�������� whetherRunRoulette()�� return 1 or 0. 1-> �귿 ����.
{
    char[] arr = new char[3];

    // ����ƽ �ϸ� ���Ұ� �����ѵ�

    public void rand(int start,PrizeMoneyDisplay pmd) throws Exception// 1 ������
    {
        if(start ==1)
        {
            String res = "";
			System.out.println("===========================");
            System.out.println("\t ���� ����");
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
                else if (roun >= 60.00 && roun < 99.90)
                    arr[i] = 'd';
                else
                    arr[i] = '7';
                res = res + arr[i];
            }

			// �Ҷ�����

		  for (int i =100 ;i<400 ;i+=50 )
		  {
			 System.out.printf("A B C");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b\b");

			 System.out.printf("B C A");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b\b");

			 System.out.printf("7 7 7");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b\b");

			 System.out.printf("D A 7");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b\b");

			 System.out.printf("A C D");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b\b");
		  }

		  System.out.printf("\b\b\b\b\b");
		  System.out.printf("[%c]",Character.toUpperCase(arr[0]));
		  for (int i =500 ;i<600 ;i+=50 )
		  {
			 System.out.printf(" B C");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b");

			 System.out.printf(" C A");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b");

			 System.out.printf(" D B");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b");

			 System.out.printf(" A 7");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b");

			 System.out.printf(" C D");
			 Thread.sleep(i);
			 System.out.printf("\b\b\b\b");

		  }
		  //System.out.printf("\b\b\b");
		  System.out.printf(" [%c]",Character.toUpperCase(arr[1]));

		  for (int i =700 ;i<750 ;i+=50 )
		  {
			 System.out.printf(" 7");
			 Thread.sleep(i);
			 System.out.printf("\b\b");

			 System.out.printf(" A");
			 Thread.sleep(i);
			 System.out.printf("\b\b");

			 System.out.printf(" B");
			 Thread.sleep(i);
			 System.out.printf("\b\b");

			 System.out.printf(" C");
			 Thread.sleep(i);
			 System.out.printf("\b\b");

			 System.out.printf(" D");
			 Thread.sleep(i);
			 System.out.printf("\b\b");
		  }
		  System.out.printf(" [%c]",Character.toUpperCase(arr[2]));
		  System.out.println();

			
            

			//PrzieMoney pm = new PrizeMoney();
			PrizeMoney pm = PrizeMoney.getInstance();
			pm.prizeMoney(res,pmd);
        }
        else
        {
            System.exit(-1);
            
        }
    }	
}