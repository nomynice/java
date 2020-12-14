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
 
    
    System.out.println("Доступні команди\r\n" + 
        "-  введення даних - 1\r\n" + 
        "-  перегляд даних - 2\r\n" + 
        "-  виконання обчислень - 3\r\n" +  
        "-  завершення програми - 0\r\n" + 
        "");

    Scanner scan= new Scanner(System.in);
    System.out.println("Введіть команду: ");
    command = scan.nextLine(); 
    
    switch (command) {
    case "1": {
        
      System.out.println("Input line: ");
      str = scan.nextLine();
        
      break;
    }
    case "2": {
      
      
      System.out.println("Перегляд данних - ");  
      if(str != "")
        help.Show(str);
      else
        System.out.println("Ви не ввели рядок");
      break;
    }
    case "3": {
      
      System.out.println("Виконання індивідуального завдання"); 
      if(str != "")
        Helper.start(new StringBuilder(str));
      else
        System.out.println("Ви не ввели рядок");
      break;
    }
    case "0": { 
      System.out.println("Кінець програми");  
      
      break;
    }
    default:
      System.out.println("Ви помилилися командой");
      break;
    }
    
    
  }while(!(command.equals("0")));
  
}

}