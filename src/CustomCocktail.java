// AlcoholVendingMachine 클래스 상속받는 클래스 설계

import java.io.*;
import java.util.*;

class CustomCocktail extends AlcoholVendingMachine
{
   
   private int vodka=10000;
   private int gin=10000;
   private int vermouth=10000;
   private int campari=10000;
   private int amaretto=10000;
   private int jgermeister=10000;
   private int mojito=10000;
   private int whiterum=10000;
   private int bluecuracao=10000;
   private int orangejuice=10000;
   private int limejuice=10000;
   private int pinejuice=10000;
   private int lemonjuice=10000;
   private int sparklingwater=10000;
   private int redbull=10000;
   int price=0;
   int result=0;
   int al;
   int shot;
   
   
   @Override
   protected int alcoholChoose()                  // 커스텀 칵테일 클래스만 술 선택하는 메소드 따로 정의
   {

      Scanner sc = new Scanner(System.in);
      
      int shotTot = 0;
      
      while(shotTot != 10)
      {   
         System.out.print("술을 선택하시오 : ");
         al = sc.nextInt();

         alcoholReturn(al);
         
         System.out.print("추가할 Shot : ");
          shot = sc.nextInt();
         
         shotTot += shot;

         if (shot < 1)
         {
            System.out.println("총 10 Shot을 넣어야 술이 제조됩니다. 계속 입력하세요.");
         }
         
         if (shotTot<=10)
         {
            switch (al)
            {
            case 1: price += 2250*shot;break;
            case 2: price += 2550*shot; break;
            case 3: price += 1650*shot; break;
            case 4: price += 2850*shot; break;
            case 5: price += 1650*shot; break;
            case 6: price += 2250*shot; break;
            case 7: price += 1650*shot; break;
            case 8: price += 2250*shot; break;
            case 9: price += 2250*shot; break;
            case 10: price += 750*shot; break;
            case 11: price += 1050*shot; break;
            case 12: price += 750*shot; break;
            case 13: price += 1050*shot; break;
            case 14: price += 750*shot; break;
            case 15: price += 750*shot; break;
            }
      

            switch (al)
            {
            case 1: result = vodka-=30*shot; break;
            case 2: result = gin-=30*shot; break;
            case 3: result = vermouth-=30*shot; break;
            case 4: result = campari-=30*shot; break;
            case 5: result = amaretto-=30*shot; break;
            case 6: result = jgermeister-=30*shot; break;
            case 7: result = mojito-=30*shot; break;
            case 8: result = whiterum-=30*shot; break;
            case 9: result = bluecuracao-=30*shot; break;
            case 10: result = orangejuice-=30*shot; break;
            case 11: result = limejuice-=30*shot; break;
            case 12: result = pinejuice-=30*shot; break;
            case 13: result = lemonjuice-=30*shot; break;
            case 14: result = sparklingwater-=30*shot; break;
            case 15: result = redbull-=30*shot; break;
            }

            if (result==100)
            {
               System.out.println("관리자 호출 바람(재고 부족)");
               return -1;
            }
            System.out.println();
                  

         } // close if
   
         
         if (shotTot>10)
         {
            System.out.println("shot이 총 10잔을 초과하였습니다. 다시 입력하세요.");
            System.out.println();

            shotTot -= shot;
         
         }
         
   
      } // close while
      
      
      return price;

   
   }
   
   @Override
   protected void alcoholReturn(int al)
   {
      Map<String,Integer> map = new HashMap<String,Integer>();

      String result = "";
      
      switch (al)
      {
      case 1: result = "보드카"; break;
      case 2: result = "진"; break;
      case 3: result = "베르무트"; break;
      case 4: result = "캄파리"; break;
      case 5: result = "아마레토"; break;
      case 6: result = "예거 마이스터"; break;
      case 7: result = "모히또"; break;
      case 8: result = "화이트 럼"; break;
      case 9: result = "블루 큐라소"; break;
      case 10: result = "오렌지주스"; break;
      case 11: result = "라임주스"; break;
      case 12: result = "파인애플주스"; break;
      case 13: result = "레몬 주스"; break;
      case 14: result = "탄산수"; break;
      case 15: result = "레드불"; break;
      }
      
      System.out.println(result);
      map.put(result,300);
      //System.out.println(map);
   }
   
   @Override
   protected void list()
   { 
	  System.out.println();
      System.out.println("1shot (30ml)");
      System.out.println();
      System.out.printf("1 %s      (%d￦) ","보드카",2250);
      System.out.printf("2 %s        (%d￦)","진",2550);
      System.out.printf("  3 %s      (%d￦) \n","베르무트",1650);
      System.out.printf("4 %s      (%d￦) ","캄파리",2850);
      System.out.printf("5 %s  (%d￦) ","아마레토",1650);
      System.out.printf(" 6 %s (%d￦) \n","예거 마이스터",2250);
      System.out.printf("7 %s      (%d￦) ","모히또",1650);
      System.out.printf("8 %s (%d￦) ","화이트 럼",2250);
      System.out.printf(" 9 %s   (%d￦) \n","블루 큐라소",2250);
      System.out.printf("10 %s (%d￦) ","오렌지주스",750);
      System.out.printf(" 11 %s (%d￦) ","라임주스",1050);
      System.out.printf(" 12 %s (%d￦) \n","파인애플주스",750);
      System.out.printf("13 %s   (%d￦) ","레몬주스",750);
      System.out.printf(" 14 %s   (%d￦) ","탄산수",750);
      System.out.printf("  15 %s       (%d￦)\n ","레드불",2250);
  
      System.out.println();

   }

   @Override
   protected int change(int price)
   {
      int changeMoney = getMoney() - price;

      while (changeMoney < 0)
      {
         System.out.println("입력한 돈이 부족합니다. 다시 입력해주세요.");
         System.out.println();

         changeMoney = getMoney() - price;
      }

      return changeMoney;

   }
   

   // 커스텀 클래스만 stock 메소드 없이 술 재고 정리도 alcoholChoose 메소드 안 while문에 통합 
   
   
   // 커스텀칵테일 유형 안에서 각각의 주류,비주류를 랜덤으로 뽑아 조합되는 랜덤 커스텀칵테일...... 고민중................
   

   protected int alcoholRun()
   {
      list();
      int price = alcoholChoose();
   
      if (price==-1)
      {
         System.exit(-1);
      }
      System.out.println();
      
			
      /*
	  Scanner sc = new Scanner(System.in);
	  System.out.print("술을 추가로 선택하시겠습니까?(Y/N) : ");
      String add = sc.next();
      char check = add.charAt(0);

      if (check != 'y' && check != 'Y')
      {
        break;
      }
	  */

	  return price;


   }

   

}  


