import java.io.*;
import java.util.*;

abstract class AlcoholVendingMachine					// ����Ŭ����
{
	

	protected abstract void alcoholReturn(int al);		// ���� ��ȯ�ϴ� �޼ҵ�
	
	protected abstract void list();						// �� ����Ʈ
		
	protected abstract int change(int al);				// �� ���� ���� ���� �Է¹��� ������ ���ִ� �޼ҵ�
	
	protected int alcoholChoose()						// ���� �����ϴ� �޼ҵ�
	{
		
		int al;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �����Ͻÿ� : ");
		al = sc.nextInt();
		return al;
	}
	
	
	protected int getMoney()							// �� �Է¹޴� �޼ҵ�
	{
		int money;
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		money = sc.nextInt();
		return money;
	}

}
