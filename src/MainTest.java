/*
<순서>
 * 객체불러오기 or 객체 생성하기
 * 자판기 안내 및 잭팟예정금 디스플레이
 * Alcohol 클래스 진행
 * 룰렛 클래스 진행
 * 당첨금 반환
 * 객체 내보내기 
*/

import java.io.*;
import java.util.*;

public class MainTest
{
	public static void main(String[] args) throws Exception
	{
     
		// 객체 불러오기 → 미구현 임시 클래스 인스턴스 생성
		//LoadObject lo = new LoadObject();
		//lo.loadObject();
      
	  
		//자판기 안내 및 잭팟 예정금 디스플레이
		PrizeMoneyDisplay pmd = PrizeMoneyDisplay.getInstance();
		print();
		pmd.showTotalPrize();
      
   
		//술 자판기 최종 작동
		AlcoholVendingMachine.vmRun();				// vmRun메소드가 static이라 바로 불러오기 가능
 
	
	}
       
       
		//당첨금 반환
      
      
      
		//객체 내보내기 → 미구현
		//SaveObject so = new SaveObject();
		//so.saveObject(ad,buy,alc);
      
   
   
	
	private static void print()
	{
		System.out.println("=====================================");
		System.out.println(" ■■■ 500룰렛 칵테일 자판기 ■■■");
		System.out.println("=====================================");
   
	}


}