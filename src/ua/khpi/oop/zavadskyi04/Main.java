package ua.khpi.oop.zavadskyi04;

import java.util.Scanner;
 

public class Main {
  public static Helper help = new Helper(); 
  public static void main(String[] args) {
     
     if(args.length>0)
     {
       if(args[0].equals("-help"))
        help.info_about_creater();
       if (args[0].equals("-debug"))
        help.flag = true;
     }   
     Menu(); 
     
  } 

public static  void Menu()
{

  String command, str = "";
  do
  {  
 
    
    System.out.println("������� �������\r\n" + 
        "-  �������� ����� - 1\r\n" + 
        "-  �������� ����� - 2\r\n" + 
        "-  ��������� ��������� - 3\r\n" +  
        "-  ���������� �������� - 0\r\n" + 
        "");

    Scanner scan= new Scanner(System.in);
    System.out.println("������ �������: ");
    command = scan.nextLine(); 
    
    switch (command) {
    case "1": {
        
      System.out.println("Input line: ");
      str = scan.nextLine();
        
      break;
    }
    case "2": {
      
      
      System.out.println("�������� ������ - ");  
      if(str != "")
        help.Show(str);
      else
        System.out.println("�� �� ����� �����");
      break;
    }
    case "3": {
      
      System.out.println("��������� �������������� ��������"); 
      if(str != "")
        Helper.start(new StringBuilder(str));
      else
        System.out.println("�� �� ����� �����");
      break;
    }
    case "0": { 
      System.out.println("ʳ���� ��������");  
      
      break;
    }
    default:
      System.out.println("�� ���������� ��������");
      break;
    }
    
    
  }while(!(command.equals("0")));
  
}

}