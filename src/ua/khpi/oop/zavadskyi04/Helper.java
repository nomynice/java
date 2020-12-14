package ua.khpi.oop.zavadskyi04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Helper {
  public static boolean flag;
  public static Scanner scan = new Scanner(System.in);
 
  public static void start(StringBuilder ln) {
    if(flag)
      System.out.println("начало вычислений, проверка ввел ли пользователь данные");
    if(ln == null) {
      throw new NullPointerException("line is null");
    }
    clottingSpace(ln);
    ArrayList<StringBuilder> line = findArray(ln); 
    task(line);
  }

  static private ArrayList<StringBuilder> findArray(StringBuilder ln){
    if(flag)
      System.out.println("Разделение строки по словам");
    ArrayList<StringBuilder> line = new ArrayList<StringBuilder>();
    ArrayList<Integer> IndexSpace = new ArrayList<Integer>();
    int length = ln.length();
    
    if(flag)
        System.out.println("Нахождение пробелов");
      
    for (int i = 0; i<length;i++) {
      if(ln.charAt(i)==' ')
      IndexSpace.add(i);
    }
    if(flag)
      System.out.println("В строке только одно слово");
    if(IndexSpace.size() == 0) {
      line.add(new StringBuilder(ln));
    }
    else 
    {
      
    line.add(new StringBuilder(ln.substring(0, IndexSpace.get(0))));
    IndexSpace.add(length);
    for(int i=1;i<IndexSpace.size();i++) {
      
      if(ln.substring(IndexSpace.get(i-1)+1, IndexSpace.get(i))!="")
        if(flag)
          System.out.println("Распределение слов по местам в списке");
      line.add(new StringBuilder(ln.substring(IndexSpace.get(i-1)+1, IndexSpace.get(i))));
     }
    }
    return line;
  }
  
  public static void Show(String str)
  {
    System.out.println(str);
  }
   
  public static void info_about_creater() {
    System.out.println("Исполнитель - Завадский Дмитрий, группа КИТ 119а");
    System.out.println("Индивидуальное задание - ");
    System.out.println("Ввести текст. У тексті кожну літеру замінити її номером в алфавіті. Вивести результат наступним чином: в одному рядку друкувати текст з двома пропусками між буквами, в наступному рядку під кожною буквою друкувати її номер.");
    System.out.println("Главный метод - 'start' ");
    System.out.println("Метод обрабатывает строку и вызывает нужные методы для определение номера символа в алфавите");
}
  
  
  static private StringBuilder clottingSpace(StringBuilder line) {
    if(flag)
      System.out.println("Оптимизация пробелов в строке");
    for(int i = 0; i< line.length()-1;i++)
    { 
      if(line.charAt(i)==' '&&line.charAt(i+1)==' ') {
        if(flag)
          System.out.println("Обнаружен лишний пробел");
        line.deleteCharAt(i+1);
        i--;
      }
    }
    if(flag)
      System.out.println("проверка пробелов в конце или начале строки");
    if(line.charAt(line.length()-1)==' ')
      line.deleteCharAt(line.length()-1);
    if(line.charAt(0)==' ')
      line.deleteCharAt(0);
    if(flag)
      System.out.println("Вывод результирующей строки");
    System.out.println(line);
    return line;
  }
  
  static private void task(ArrayList<StringBuilder> line)
  { 
    int size =0; 
    int count;
    if(flag)
      System.out.println("Подсчет общего количества символов");
    for (StringBuilder strB: line) {
       size += strB.length();
    }
    count = size;
    int[] array_numbers = new int [count];
    int i=0; 
    if(flag)
      System.out.println("Цикл определяет номер символа в алфавите используя таблицу ASCII");
    for (StringBuilder strB : line) {
      size = strB.length();
      char[] arr = new char[size];
      strB.getChars(0, size,arr,0);
      for (char el : arr) { 
        if((int)el >=97 && (int)el<= 122)
        {  
          if(flag)
            System.out.println("Найдено букву в малом регистре");
          array_numbers[i] = (int)el;
          array_numbers[i] -=96; 
        }    
        else if((int)el >=65 && (int)el<= 90)
        {  
          if(flag)
            System.out.println("Найдено букву в большом регистре");
          array_numbers[i] = (int)el;
          array_numbers[i] -=64; 
        }    
        i++;
      }
      
    } 
    i=0;
    char[] arrALL = new char[count]; 
    if(flag)
      System.out.println("Перевод всей строки в масив для специально");
    for (StringBuilder strB : line) {
      size = strB.length();
      strB.getChars(0, size, arrALL, i);
      i+=size ;
    }
    if(flag)
      System.out.println("Вывод согласно условию задачи");
    for (char c : arrALL) {
      System.out.print(c+"  ");
    }
    System.out.println("\n");
    for (int c : array_numbers) {
      System.out.print(c+"  ");
    }
    System.out.println("\n");
  } 
  
 
  
 
}
    