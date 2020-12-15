package ua.khpi.oop.zavadskyi07;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
 

public class Main {

  public static void main(String[] args) {
     
    Container cont = new Container();
    System.out.println("Введите размер массива (количество торговых точек): ");
    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();   
    while(size!=0)
    {
      cont.add();
      size--;
    }
    cont.show();
  

}
}