/*
<����>
 * ��ü�ҷ����� or ��ü �����ϱ�
 * ���Ǳ� �ȳ� �� ���̿����� ���÷���
 * Alcohol Ŭ���� ����
 * �귿 Ŭ���� ����
 * ��÷�� ��ȯ
 * ��ü �������� 
*/

import java.io.*;
import java.util.*;

public class MainTest
{
	public static void main(String[] args) throws Exception
	{
     
		// ��ü �ҷ����� �� �̱��� �ӽ� Ŭ���� �ν��Ͻ� ����
		//LoadObject lo = new LoadObject();
		//lo.loadObject();
      
	  
		//���Ǳ� �ȳ� �� ���� ������ ���÷���
		PrizeMoneyDisplay pmd = PrizeMoneyDisplay.getInstance();
		print();
		pmd.showTotalPrize();
      
   
		//�� ���Ǳ� ���� �۵�
		AlcoholVendingMachine.vmRun();				// vmRun�޼ҵ尡 static�̶� �ٷ� �ҷ����� ����
 
	
	}
       
       
		//��÷�� ��ȯ
      
      
      
		//��ü �������� �� �̱���
		//SaveObject so = new SaveObject();
		//so.saveObject(ad,buy,alc);
      
   
   
	
	private static void print()
	{
		System.out.println("=====================================");
		System.out.println(" ���� 500�귿 Ĭ���� ���Ǳ� ����");
		System.out.println("=====================================");
   
	}


}