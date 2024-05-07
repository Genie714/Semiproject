import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine											// ���� Ŭ����
{
	
	
	private AlcoholVendingMachine avmArr[] = new AlcoholVendingMachine[3];     // ���� Ŭ���� ��ü�迭 ����
	
	
	protected abstract void list();												// �� ����Ʈ
	
	
	protected int alcoholChoose()									// ���� �����ϴ� �޼ҵ�
	{
		int al=0;
		boolean flag = true;
		int choice = 0;
		while(flag)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �����ϼ���");
			al = sc.nextInt();
			flag = false;

			if (SingleItem.getInstance().stock[al-1]<300)
			{
				System.out.println("������ ��ǰ�̹Ƿ� �ٽ� �����ϼ���");
				System.out.print("�ٸ� ���� ����(1) / ���� ����(2)");
				choice = sc.nextInt();
				if (choice == 1)
				{
					flag = true;
				}
			}
		}
		return al;
	}

	
	
	protected abstract String alcoholReturn(int al);								// ���� ��ȯ�ϴ� �޼ҵ�
	
	
	protected abstract void stock(int al);										// ��� ������ �� ��� �������ִ� �޼ҵ�

	
	protected abstract void enterStock();									// ��� ����� ���� �ʱⰪ���� �ʱ�ȭ���ִ� �޼ҵ�
	
		
	
	
	
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


	//protected abstract int alcoholRun();										// �� ���� �������� �ܰ踦 ��� ���� �޼ҵ�


	protected abstract int change(int al);										// �� ���� �������� �Է¹��� ������ ���ִ� �޼ҵ�

	


	
	
	
	static void vmRun() throws Exception										// ���� ��� ��� �����ϴ� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);

		int add=0, add2=0;
		int a;
		int al=0;
		int price=0;
		int priceCancle=0;
		int priceAdd=0;
		//int priceAdd2=0;
		//int priceAdd3=0;
		int priceAll=0;
		int stock=0;
		int result=0;
		int selectCount=0;
		int alcml = 0;
		HashMap<String,Integer> selectedAl= new HashMap<String,Integer>();
		
		//Stack<String> selectedAlName = new Stack<String>();

		
		PrizeMoneyDisplay pmd = new PrizeMoneyDisplay();
		ChangeMoney cm = new ChangeMoney();
		
		
		SingleItem ob1 = SingleItem.getInstance();										// ���� Ŭ������ ��ü ����
        PresetCocktail ob2 = PresetCocktail.getInstance();
        CustomCocktail ob3 = CustomCocktail.getInstance();
		
		
   	    AlcoholVendingMachine[] avmArr = new AlcoholVendingMachine[3];
		
		avmArr[0] = ob1;														// �� SingleItem ��ü�迭(��ĳ����)
   	    avmArr[1] = ob2;														// �� PresetCocktail ��ü�迭(��ĳ����)
   	    avmArr[2] = ob3;														// �� CustomCocktail ��ü�迭(��ĳ����)

		
		while (true)
	    {
			System.out.print("3���� ���� �� �ϳ��� �����ϼ��� (�� ��ǰ / �� ������(Ĭ����) / �� Ŀ����(Ĭ����) :  "); 
			a = sc.nextInt();
			
			avmArr[a-1].list();
			al = avmArr[a-1].alcoholChoose();

			
			System.out.println();
			if (SingleItem.getInstance().stock[al-1]<300)
			{
				System.out.print("[�� ���(1) / �߰� ����(2) : ");
				add = sc.nextInt();
			}
			else
			{
				System.out.print("[�� ���(1) / �߰� ����(2) / ��� ������ ��ǰ ���(3) : ");
				add = sc.nextInt();
			}

			if (add == 1)
			{	
				//������
				avmArr[a-1].stock(al);
				selectedAl.put(avmArr[a-1].alcoholReturn(al), alcml += 300);
				//�� ���ÿϷ� �� (����)��ȯ�� �뿡 ������ �����ڿ��� �� ��
				//�����
				priceAdd += avmArr[a-1].alcoholPrice(al);
				break;
			}
			if (add == 2)
			{
				//������
				avmArr[a-1].stock(al);
				selectedAl.put(avmArr[a-1].alcoholReturn(al), alcml += 300);
				//�����
				priceAdd += avmArr[a-1].alcoholPrice(al);
				System.out.println("�߰� ���Ÿ� �����ϼ̽��ϴ�");
			}
			if (add == 3)
			{
				System.out.println("�߰� ����(1) / ���� ����(2)");
				add2 = sc.nextInt();
				if (add2 == 1 || selectCount == 0)
				{
					continue;
				}
				break;
			}
			if (add2 == 2 && selectCount == 0)
			{
				continue;
			}
			selectCount++;
			System.out.printf("���� ���� : %d\n", priceAdd);	
		}//while close;
		// ���

		// �����
		// ���� ���� ���� ����� ��  �����

		// �����ȯ
		// ���� ���ݱ��� ����� ���Ḧ ��ȯ���ְ�
		/*


			
			avmArr[a-1].stock();
			//���� ���ݹ�ȯ
			//list()
			//System.out.print("�����");
			//al = sc.nextInt();
			//alcoholchoose ������ �� ����������� ��ȯ�ߴٸ�
			al = avmArr[a-1].alcoholRun();
			price = avmArr[a-1].alcoholPrice(al);						// SingleItem Ŭ�������� ���� �� ���� �� price�� ����
			priceAdd1 += price;											// SingleItem ���� ������ ������ ��� priceAdd1 �� ����
				
		    }
			else if (a == 2)
			{
				al = avmArr[a-1].alcoholRun();	
                price = avmArr[a-1].alcoholPrice(al);						// PresetCocktail Ŭ�������� ���� �� ���� �� price�� ����
				priceAdd2 += price;                                         // PresetCocktail ���� ������ ������ ��� priceAdd2 �� ����
				
			}
			else if (a == 3)					
			{
				price = avmArr[a-1].alcoholRun();							// CustomCocktail Ŭ�������� ���� �� ���� �� price�� ����
				priceAdd3 += price;											// CustomCocktail ���� ������ ������ ��� priceAdd3 �� ����
				
			}
			priceAll = priceAdd1 + priceAdd2 + priceAdd3 + priceCancle;				// priceAll �� ���� ����� �ݾ�
			System.out.println("������ �Ѿ�" + priceAll);							// priceCancle �� ������ ���� ��ǰ ������ priceAll ���� ���� �ݾ�
			
			
			if (add==3)																// ��� ������ ��ǰ ���(3)�� �����Ͽ��� �� ���ǹ�
			{
				
				
				priceCancle = priceAll - price;										// (3)�� ������ ���� ������ ��ǰ�� ���� ����� �ݾ׿��� ���� �ݾ�
				//System.out.println("�ֱٱ��� ��ǰ �� �Ѿ�" + priceCancle);
				
				
				priceAdd1 = 0;
				priceAdd2 = 0;														// ������ ������ ��ǰ�� ���ܽ�Ų �� ���� ���� �ݾ��� priceCancle�� ��ұ� ������	
				priceAdd3 = 0;                                                      // ������ ���� ���� ���״� priceAdd1,priceAdd2,priceAdd3 �� 0���� �ʱ�ȭ �ϰ� �ٽ� ��ƾ� �Ѵ�.

			}
			*//*
			if (add==1)																// �� ���(1)�� �����ϸ� break �� while���� �������� �� �Է� ȭ������ �Ѿ��.
			{	
				
				stock = avmArr[a-1].stock(al);
			    if (stock < 100)
		        {
			        //enterStock(al);
		        }
				
				
				break;
				
				
			}*/
			/*
			
			if (add==2)
			{
				
				
				stock = avmArr[a-1].stock(al);
				if (stock < 100)
		        {
			        //enterStock(al);
		        }
			}
		
      		 
     	} // close while															
			*/	
		System.out.println();
	
				
		enterMoney();																// �� �Է��� ���� ��¹�
		cm.returnMoney(avmArr[a-1].change(priceAdd),pmd);							// �������� priceAll�� change�޼ҵ忡 ��� �ܵ� ���
		//���� �����
		
	}




}
