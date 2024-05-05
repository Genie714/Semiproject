import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine											// ����Ŭ����
{

	private AlcoholVendingMachine avmArr[] = new AlcoholVendingMachine[3];		// ���� Ŭ���� ��ü�迭 ����
	
	
	protected abstract void list();												// �� ����Ʈ
	
	
	protected int alcoholChoose()												// ���� �����ϴ� �޼ҵ�
	{
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �����Ͻÿ� : ");
		al = sc.nextInt();
		return al;
	}
	
	
	protected abstract void alcoholReturn(int al);								// ���� ��ȯ�ϴ� �޼ҵ�
	
	
	protected abstract int stock(int al);										// ��� ������ �� ��� �������ִ� �޼ҵ�
	
	
	protected abstract int alcoholPrice(int al);								// �� ���� å���ϴ� �޼ҵ�
	
	
	protected static void enterMoney()											// �� �Է� ��¹� �޼ҵ�
	{
		System.out.print("���� �Է��Ͻÿ� : ");   
	}
	
	
	protected int getMoney()													// �� �Է¹޴� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);  
		int money = sc.nextInt();

		PayMoney pm = PayMoney.getInstance();
		pm.inputMoney(money);

		return money;
	}


	protected abstract int alcoholRun();										// �� ���� �������� �ܰ踦 ��� ���� �޼ҵ�


	protected abstract int change(int al);										// �� ���� �������� �Է¹��� ������ ���ִ� �޼ҵ�

	
	


	
	
	
	static void vmRun() throws Exception										// ���� ��� ��� �����ϴ� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);
    
		char check;
		String add;
		int a;
		int al;
		int priceAdd12=0;
		int priceAdd3=0;
		int priceAll=0;
		
		
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		ChangeMoney cm = new ChangeMoney();
		
		
		SingleItem ob1 = new SingleItem();
        PresetCocktail ob2 = new PresetCocktail();
        CustomCocktail ob3 = new CustomCocktail();
		
		
   	    AlcoholVendingMachine[] avmArr = new AlcoholVendingMachine[3];
		
		avmArr[0] = ob1;					// �� SingleItem ��ü�迭(��ĳ����)
   	    avmArr[1] = ob2;					// �� PresetCocktail ��ü�迭(��ĳ����)
   	    avmArr[2] = ob3;					// �� CustomCocktail ��ü�迭(��ĳ����)
		
		
   	    while (true)
	    {
			System.out.print("3���� ���� �� �ϳ��� �����ϼ��� (�� ��ǰ / �� ������(Ĭ����) / �� Ŀ����(Ĭ����) : "); 
			a = sc.nextInt();
			
   	        if (a==1 || a==2)
	        {
				al = avmArr[a-1].alcoholRun();
				priceAdd12 += avmArr[a-1].alcoholPrice(al);
			   
	        }
			if (a==3)
			{
				priceAdd3 = avmArr[a-1].alcoholRun();
				
			}
			
			priceAll = priceAdd12 + priceAdd3;				// ���� �� �� �� ������ ���� ����
			
			
			System.out.println();
      		System.out.print("�� �Է� �� ���� �߰��� �����Ͻðڽ��ϱ�?(Y/N) : ");
            add = sc.next();
            check = add.charAt(0);
      
            if (check != 'y' && check != 'Y')
            {
                  break;
            }
			
      		 
     	}// close while
		System.out.println();
		
		enterMoney();
		cm.returnMoney(avmArr[a-1].change(priceAll),pmd);		// �������� priceAll�� change�޼ҵ忡 ��� �ܵ� ���
					
	}




}
