class RouletteCal   // chageMoney 클래스에서 whetherRunRoulette()이 return 1 or 0. 1-> 룰렛 실행.
{
    char[] arr = new char[3];

    // 스태틱 하면 편할거 같긴한디

    public void rand(int start,PrizeMoneyDisplay pmd) throws Exception// 1 들어오면
    {
        if(start ==1)
        {
            String res = "";
			System.out.println("===========================");
            System.out.println("\t 게임 시작");
			System.out.println("===========================");

            double rand;
            double roun;

            //countPlay++;    // 사람들이 몇번 플레이 했나 계산 -> 후에 수수료로는 매출을 얼마나 뽑아냈냐 보여줌

            for (int i = 0; i < 3; i++)    // 배열 3칸에 심볼을 넣는 과정 + String으로 이걸 보여줌
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

			// 쫘라라라라락

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