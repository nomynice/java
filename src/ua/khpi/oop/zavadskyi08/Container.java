package ua.khpi.oop.zavadskyi08;
 

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
 

public class Container {
	 
	PointOfSale[] array  = new PointOfSale[3]; 
	
	public void add()
	{ 
		int size = array.length;
		Scanner scan = new Scanner(System.in);
		System.out.println("¬ведите название торговой точки");
		String name_point_of_sale = scan.nextLine();
		System.out.println("¬ведите номер телефону");
		int number = scan.nextInt();
		System.out.println("¬ведите специализацию торговой точки");
		String specialty =  scan.nextLine();  
		System.out.println("¬ведите день недели в который точка работает");
		String day = scan.nextLine(); 
		System.out.println("¬ведите в какой интервал времени работает точка");
		String time = scan.nextLine(); 
		LinkedHashMap<String, String> work_time = new LinkedHashMap<String, String>();
		work_time.put(day,time);
		PointOfSale new_el = new PointOfSale(name_point_of_sale,new ArrayList<Integer>(number),specialty,work_time); 
		PointOfSale new_arr[] = new PointOfSale[++size];
		for(int i=0;i<size-1;i++)
		{
			new_arr[i]=array[i];
		}
		new_arr[size-1] = new_el;
		array = new_arr;
	}
	 
	public void remove()
	{
		int size = array.length;
		if(size!=0)
		{
			PointOfSale new_arr[] = new PointOfSale[--size];
			for(int i=0;i<size;i++)
			{
				new_arr[i]=array[i];
			}
			array = new_arr;
		}
		else
		{
			System.out.println("¬аш масив пуст, удал€ть  нечего");
		}
		
	}
	
	public void Show()
	{
		for (PointOfSale carsShop : array) {
			carsShop.Show();
		}
	}
	
	
	}
