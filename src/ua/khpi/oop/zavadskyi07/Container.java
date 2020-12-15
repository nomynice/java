package ua.khpi.oop.zavadskyi07;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

import ua.khpi.oop.zavadskyi08.PointOfSale;

public class Container {

  
  private PointOfSale[] array  ;
  
  public void add()
  { 
    int size;
    if(array!=null)
    {
       size = array.length;
    }
    else
    {
      size=0;
    }
    Scanner scan = new Scanner(System.in);
    System.out.println("¬ведите название торговой точки : ");
    String name_point_of_sale = scan.nextLine(); 
    System.out.println("¬ведите специализацию торговой точки : ");
    String specialty =  scan.nextLine();  
    System.out.println("¬ведите дни недели в которые точка работает : ");
    String day = scan.nextLine(); 
    System.out.println("¬ведите  интервал времени работы точки : ");
    String time = scan.nextLine(); 
    System.out.println("¬ведите номер телефона : ");
    int number = scan.nextInt();
    LinkedHashMap<String, String> work_time = new LinkedHashMap<String, String>();
    work_time.put(day,time);
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(number);
    PointOfSale new_el = new PointOfSale(name_point_of_sale,list,specialty,work_time); 
    PointOfSale new_arr[] = new PointOfSale[++size];
    for(int i=0;i<size-1;i++)
    {
      new_arr[i]=array[i];
    }
    new_arr[size-1] = new_el;
    array = new_arr;
  }
  
  
  public void show()
  {
    if(array != null)
    {
      for (PointOfSale pointOfSale : array) {
        pointOfSale.Show();
      }
    }
      
  }
  
}