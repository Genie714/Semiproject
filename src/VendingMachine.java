class PrizeMoneyDisplay // �̰� ��� ��������ϴ� ����.
{
    final int INIT_PRIZE = 100000;  // �ʱ�ȭ�� ���� 100,000 ��
    final int STACK = 490;          // ������ 10���� ������ ���� ���� ���̴� 490 ��
    private int totalPrizeMoney = INIT_PRIZE;    // ������ INIT_PRIZE��

    public int getTotalPrizeMoney() // �ϴ� ���� ���� ���� ������ �R
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
            // ���⿡ ������ ȣ�� ������ �� �� ������ ������ �������̽� ���� ������ �� �𸣰���. �̰� ���ǰ� �ʿ�
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
        System.out.printf("���� ��÷��: %d\n",totalPrizeMoney);
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
//        System.out.printf("���� ��÷��: %d\n",prizeMoney);
//        showTotalPrize();
//    }



}

class RouletteCal   // chageMoney Ŭ�������� whetherRunRoulette()�� return 1 or 0. 1-> �귿 ����.
{
    char[] arr = new char[3];

    // ����ƽ �ϸ� ���Ұ� �����ѵ�

    public void rand(int start) // 1 ������
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
public class VendingMachine // �ӽ÷� ���� public class//    Roulette���� ������ �ϳ�?
{
    static int countPlay=0;
    //static int totalPrizeMoney; �� �׳� ����ƽ ���� �ȵǳ�
    public static void main(String[] args)
    {
        VendingMachine vm = new VendingMachine();

        PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();   // ��� ���Ŷ� �ϴ� main ������ ������.
        pmd.showTotalPrize();    // ó�� ������ ��÷�� �����ֱ� -> 100,000 ��
		System.out.println();

        //pmdp.setTotalPrizeMoney(totalPrizeMoney);



        ChangeMoney cm = new ChangeMoney();
        int start = cm.whetherRunRoulette(); // start =1 �̸� ���� �̰� �ƿ� if(start ==1) {rc.rand()} �̷���  �ұ �����ߴµ� �� ¥ġ�°� ���⵵ �ϰ�

        RouletteCal rc = new RouletteCal(); // �귿��ü ����
        for(int i = 0; i<10;i++)
        {
            //String res="";
            countPlay++;
            pmd.stack();   // ������ ������ ������÷�ݿ� 490 �� �߰�

            String res =rc.rand(start);
            int prizeMoney=rc.winningsOut(res);
			System.out.println();

            pmd.setTotalPrizeMoney(prizeMoney);    // prizeMoney�� ��ȯ�ϴ°��� 0 �̸� �ý��� ����
        }
        System.out.println(countPlay);
//        countPlay++;
//        pmd.stack();   // ������ ������ ������÷�ݿ� 490 �� �߰�
//
//        String res =rc.rand(start);
//        int prizeMoney=rc.winningsOut(res);
//        pmd.setTotalPrizeMoney(prizeMoney);    // prizeMoney�� ��ȯ�ϴ°��� 0 �̸� �ý��� ����

    }
}
*/

    /*
        // �̹� ����� ���� �̰� ����ϰ� /b �̶� sleep()�� ��������
        // Ŀ�� �����̴� �͵� ������� ����� �� ������ ����  -> ã�ƺ��µ� �ȵǸ� ������ �ƹ������� ���庸��
        // arr[0] != arr[1] �Ǹ� �ٷ� ���� Ȯ���� abcd7 ���� Ȯ���� ���� �����ֱ�
        System.out.println(res);
    }
    */
