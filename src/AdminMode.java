import java.util.Scanner;

public class AdminMode
{
	public void adminMenu()
	{
		Scanner sc = new Scanner(System.in);
		
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
		
		int adminChoose;
		do
		{
			adminChoose = sc.nextInt();
		}
		while(adminChoose < 1 || adminChoose > 2);
		
		if (adminChoose == 1)
		{
			System.out.println("\n[���Ǳ� ���� Ȯ��]");
			System.out.printf("1. ���� : %d��\n", 123);//�������� salesMoney
			System.out.printf("2. Ĭ���� ���� Ƚ�� : %dȸ\n", 150);//Ĭ���� ����Ƚ�� ī��Ʈ//�α�޴�..?
			System.out.println("3. �귿 ���");
			System.out.println("========================");
			System.out.printf("�� �귿 ���� Ƚ�� : %d", 100);// �귿 ���� Ƚ�� ī��Ʈ
			System.out.printf("�� �귿 ��÷ Ƚ�� : �� %dȸ �� %d��", 100,10000);// �Ʒ� ���� �����Ǹ� ��ħ
			System.out.printf("\t- aaa : %dȸ %d��\n", 10, 1000000);
			System.out.printf("\t- bbb : %dȸ %d��\n", 10, 1000000);
			System.out.printf("\t- ccc : %dȸ %d��\n", 10, 1000000);
			System.out.printf("\t- ddd : %dȸ %d��\n", 10, 1000000);
			System.out.printf("\t- 777 : %dȸ %d��\n", 10, 1000000);
			System.out.println("========================");
			
		}
		else if(adminChoose == 2)
		{
			System.out.println("\n[���Ǳ� ��� ����]");
		}
	}
}