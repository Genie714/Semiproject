/* �����ڰ� �̿��ϴ� �޴� ����
 * �ֿ� ��� : 1. ���Ǳ� ���� Ȯ�� 2. ���Ǳ� ��� ����
 * ���� ���� : - �� Ŭ���� �����Ǿ� �ִ� ��ü �ҷ�����
 * 			   - �� Ŭ������ �Ӽ��� �����Ͽ� �� ��������
 * 			   - �޼ҵ带 �̿��Ͽ� Ŭ������ �Ӽ��� �����ϱ�
 * */

import java.util.Scanner;

public class AdminMode
{
	public static void adminMenu()
	{
		//�ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		PrizeMoneyDisplay pmd = PrizeMoneyDisplay.getInstance();
		PayMoney pm = PayMoney.getInstance();
		
		//���� ����
		int adminChoose;
		
		//��� ���
		//1. ���Ǳ� ���� ���� Ȯ�� 
		//���� / �̿�Ƚ��(���Ǳ�,�귿), / ��÷Ƚ��(���� �� Ƚ��) / �α�޴�
		//2. ���Ǳ� ��� ����
		// �� ��ǰ ������/ �� ���������� /
		System.out.println("========================");
		System.out.println("���� ADMIN MENU ����");
		System.out.println("========================");
		System.out.println("1. ���Ǳ� ���� Ȯ��");
		System.out.println("�� ���� �����Ǳ� �̿�Ƚ��(Ĭ����) ��귿 ���(�̿�Ƚ��, ��÷Ƚ��, ��÷�ݾ�) ���α�޴�");
		System.out.println("2. ���Ǳ� ��� ����");
		System.out.println("�� ��ǰ ������ �� ��������");
		System.out.print("�޴� ���� : ");
		
		do
		{
			adminChoose = sc.nextInt();
		}
		while(adminChoose < 1 || adminChoose > 2);
		
		if (adminChoose == 1)
		{
			System.out.println("\n[���Ǳ� ���� Ȯ��]");
			System.out.printf("1. ���� : %d��\n", pm.getSalesMoney());//�������� salesMoney
			System.out.printf("2. Ĭ���� ���� Ƚ�� : %dȸ\n", 150);//Ĭ���� ����Ƚ�� ī��Ʈ//�α�޴� ����
			System.out.println("3. �귿 ���");
			System.out.println("========================");
			System.out.printf("�� �귿 ���� Ƚ�� : %d", pmd.countPlay);// �귿 ���� Ƚ�� ī��Ʈ
			System.out.printf("�� �귿 ��÷ Ƚ�� : �� %dȸ �� %d��", 100,10000);// �Ʒ� ���� �����Ǹ� ��ħ
			System.out.printf("\t- aaa : %dȸ %d��\n", pmd.aaa, (pmd.aaa * 100000));
			System.out.printf("\t- bbb : %dȸ %d��\n", pmd.bbb, (pmd.bbb * 15000));
			System.out.printf("\t- ccc : %dȸ %d��\n", pmd.ccc, (pmd.ccc * 5000));
			System.out.printf("\t- ddd : %dȸ %d��\n", pmd.ddd, (pmd.ddd * 1000));
			System.out.printf("\t- 777 : %dȸ %d��\n", pmd.seven3, 1000000);	 // ���� �ʿ�
			System.out.println("========================");
			
		}
		else if(adminChoose == 2)
		{
			System.out.println("\n[���Ǳ� ��� ����]");
			System.out.println("1. ��ǰ ��� ����");
			System.out.println("2. ���Ǳ� ���� ����");
			int adminChoose2;
			do
			{
				adminChoose2 = sc.nextInt();
				
			}
			while(adminChoose2<1 || adminChoose2>2);
			
			if(adminChoose2==1)
			{
				//��ǰ ��� ä��� �޼ҵ� ���
				//�󸶳� ä������ �����ֱ� 
			}
			else if(adminChoose2==2)
			{
				//0. �����ڿ��� �ȳ�
				System.out.println("1. ����� ��ȯ");
				System.out.println("2. ��ȯ�� ��� �Է�");
				int adminChoose3;
				do
				{
					adminChoose3 = sc.nextInt();
				}
				while(adminChoose3<1 ||adminChoose3>2);
				//1.�����뿡�� ���� ����
				if (adminChoose3 ==1)
				{
					System.out.printf("����� %d���� ��ȯ�ϰڽ��ϴ�.", pm.getSalesMoney());
					pm.outputSalesMoney();
				}
				//2.�Ž��� �� ���� ���� ä���
				
			}
		}
	}
}