class PrizeMoneyDisplay // 이건 계속 보여줘야하는 거임.
{
    final int INIT_PRIZE = 100000;  // 초기화때 쓰는 100,000 원
    final int STACK = 490;          // 수수료 10원을 제외한 유저 눈에 보이는 490 원
    private int totalPrizeMoney = INIT_PRIZE;    // 시작은 INIT_PRIZE로

    public int getTotalPrizeMoney() // 일단 언제 쓸지 몰라서 만들어는 둚
    {
        return totalPrizeMoney;
    }
    public void setTotalPrizeMoney(int prizeMoney)
    {
        if (prizeMoney>1)
        {
            totalPrizeMoney -= prizeMoney;
            showTotalPrize();
        }
        else if(prizeMoney==1)
        {
            totalPrizeMoney = INIT_PRIZE;
            showTotalPrize();
            // 여기에 관리자 호출 넣으면 될 거 같은데 관리자 인터페이스 어케 구성할 지 모르겠음. 이건 논의가 필요
        }
        else
            showTotalPrize();


        if (totalPrizeMoney<100000)        //
        {
            totalPrizeMoney = INIT_PRIZE;
            showTotalPrize();
        }

    }

    public void showTotalPrize()
    {
        System.out.printf("누적 당첨금: %d\n",totalPrizeMoney);
    }
    public void stack()
    {
        totalPrizeMoney += STACK;
        showTotalPrize();
    }
//    public void setINIT_PRIZE()
//    {
//        if (totalPrizeMoney<100000)
//            totalPrizeMoney = INIT_PRIZE;
//        show();
//    }
//    public void payPrize(int prizeMoney)
//    {
//        this.totalPrizeMoney = prizeMoney;
//        System.out.printf("누적 당첨금: %d\n",prizeMoney);
//        showTotalPrize();
//    }



}

class RouletteCal   // chageMoney 클래스에서 whetherRunRoulette()이 return 1 or 0. 1-> 룰렛 실행.
{
    char[] arr = new char[3];

    // 스태틱 하면 편할거 같긴한디

    public void rand(int start) // 1 들어오면
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
			pm.prizeMoney(res);
        }
        else
        {
            System.exit(-1);
            
        }
    }	
}


/*
    //public void message()
public class VendingMachine // 임시로 만든 public class//    Roulette으로 만들어야 하나?
{
    static int countPlay=0;
    //static int totalPrizeMoney; 아 그냥 스태틱 쓰면 안되나
    public static void main(String[] args)
    {
        VendingMachine vm = new VendingMachine();

        PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();   // 계속 쓸거라서 일단 main 쪽으로 빼뒀음.
        pmd.showTotalPrize();    // 처음 누적된 당첨금 보여주기 -> 100,000 원
		System.out.println();

        //pmdp.setTotalPrizeMoney(totalPrizeMoney);



        ChangeMoney cm = new ChangeMoney();
        int start = cm.whetherRunRoulette(); // start =1 이면 시작 이걸 아예 if(start ==1) {rc.rand()} 이렇게  할까도 생각했는데 좀 짜치는거 같기도 하고

        RouletteCal rc = new RouletteCal(); // 룰렛객체 생성
        for(int i = 0; i<10;i++)
        {
            //String res="";
            countPlay++;
            pmd.stack();   // 수수료 제외한 누적당첨금에 490 원 추가

            String res =rc.rand(start);
            int prizeMoney=rc.winningsOut(res);
			System.out.println();

            pmd.setTotalPrizeMoney(prizeMoney);    // prizeMoney가 반환하는것이 0 이면 시스템 종료
        }
        System.out.println(countPlay);
//        countPlay++;
//        pmd.stack();   // 수수료 제외한 누적당첨금에 490 원 추가
//
//        String res =rc.rand(start);
//        int prizeMoney=rc.winningsOut(res);
//        pmd.setTotalPrizeMoney(prizeMoney);    // prizeMoney가 반환하는것이 0 이면 시스템 종료

    }
}
*/

    /*
        // 이미 결과는 났고 이걸 깔롱하게 /b 이랑 sleep()로 보여주자
        // 커서 깜빡이는 것도 사라지게 만들면 더 좋을거 같음  -> 찾아보는데 안되면 준혁이 아버님한테 여쭤보기
        // arr[0] != arr[1] 되면 바로 같은 확률로 abcd7 같은 확률로 랜덤 보여주기
        System.out.println(res);
    }
    */
