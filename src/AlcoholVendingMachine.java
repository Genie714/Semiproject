import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine											// ���� Ŭ����
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

		int add;
		int a;
		int al;
		int price=0;
		int priceCancle=0;
		int priceAdd1=0;
		int priceAdd2=0;
		int priceAdd3=0;
		int priceAll=0;

		
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		ChangeMoney cm = new ChangeMoney();
		
		
		SingleItem ob1 = new SingleItem();										// ���� Ŭ������ ��ü ����
        PresetCocktail ob2 = new PresetCocktail();
        CustomCocktail ob3 = new CustomCocktail();
		
		
   	    AlcoholVendingMachine[] avmArr = new AlcoholVendingMachine[3];
		
		avmArr[0] = ob1;														// �� SingleItem ��ü�迭(��ĳ����)
   	    avmArr[1] = ob2;														// �� PresetCocktail ��ü�迭(��ĳ����)
   	    avmArr[2] = ob3;														// �� CustomCocktail ��ü�迭(��ĳ����)

		
	
		while (true)
	    { 
			System.out.print("3���� ���� �� �ϳ��� �����ϼ��� (�� ��ǰ / �� ������(Ĭ����) / �� Ŀ����(Ĭ����) :  "); 
			a = sc.nextInt();
			
			if (a == 1)
			{
				al = avmArr[a-1].alcoholRun();
                price = avmArr[a-1].alcoholPrice(al);						// SingleItem Ŭ�������� ���� �� ���� �� price�� ����
				priceAdd1 += price;											// SingleItem ���� ������ ������ ��� priceAdd1 �� ����
		    }
			else if (a == 2)
			{
				al = avmArr[a-1].alcoholRun();							
                price = avmArr[a-1].alcoholPrice(al);						// PresetCocktail Ŭ�������� ���� �� ���� �� price�� ����
				priceAdd2 += price;											// PresetCocktail ���� ������ ������ ��� priceAdd2 �� ����
			}
			else if (a == 3)					
			{
				price = avmArr[a-1].alcoholRun();							// CustomCocktail Ŭ�������� ���� �� ���� �� price�� ����
				priceAdd3 += price;											// CustomCocktail ���� ������ ������ ��� priceAdd3 �� ����
				
			}
			priceAll = priceAdd1 + priceAdd2 + priceAdd3 + priceCancle;				// priceAll �� ���� ����� �ݾ�
			//System.out.println("������ �Ѿ�" + priceAll);							// priceCancle �� ������ ���� ��ǰ ������ priceAll ���� ���� �ݾ�
			
			System.out.println();
			System.out.print("[�� ���(1) / �߰� ����(2) / ��� ������ ��ǰ ���(3)] : ");
			add = sc.nextInt();
			
			if (add==3)																// ��� ������ ��ǰ ���(3)�� �����Ͽ��� �� ���ǹ�
			{
				
				
				priceCancle = priceAll - price;										// (3)�� ������ ���� ������ ��ǰ�� ���� ����� �ݾ׿��� ���� �ݾ�
				//System.out.println("�ֱٱ��� ��ǰ �� �Ѿ�" + pricePrev);
				
				priceAdd1 = 0;
				priceAdd2 = 0;														// ������ ������ ��ǰ�� ���ܽ�Ų �� ���� ���� �ݾ��� priceCancle�� ��ұ� ������	
				priceAdd3 = 0;														// ������ ���� ���� ���״� priceAdd1,priceAdd2,priceAdd3 �� 0���� �ʱ�ȭ �ϰ� �ٽ� ��ƾ� �Ѵ�.
			}
			
			if (add==1)																
			{																		// �� ���(1)�� �����ϸ� break �� while���� �������� �� �Է� ȭ������ �Ѿ��.
				break;																
			}
			
      		 
     	} // close while															// �߰� ����(2)�� ���� ���ǹ� �������� �ʰ� while���� ��� ���� �Ѵ�.
      	
		System.out.println();
	
				
		enterMoney();																// �� �Է��� ���� ��¹�
		cm.returnMoney(avmArr[a-1].change(priceAll),pmd);							// �������� priceAll�� change�޼ҵ忡 ��� �ܵ� ���
					
	}




}
