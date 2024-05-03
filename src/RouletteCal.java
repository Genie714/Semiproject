class RouletteCal   // chageMoney 클래스에서 whetherRunRoulette()이 return 1 or 0. 1-> 룰렛 실행.
{
    char[] arr = new char[3];

    // 스태틱 하면 편할거 같긴한디

    public void rand(int start,PrizeMoneyDisplay pmd) // 1 들어오면
    {
        if(start ==1)
        {
            String res = "";
			System.out.println("===========================");
            System.out.println("\t게임 시작");
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