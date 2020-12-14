package ua.khpi.oop.zavadskyi07;
 
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
 

public class Main {

	public static void main(String[] args) {
		 
		
		ArrayList<Integer> num1 = new ArrayList<Integer>();
		num1.add(123456789);
		num1.add(463473537);
		num1.add(246241275);

		ArrayList<Integer> num2 =  new ArrayList<Integer>();
		num2.add(237657355);
		num2.add(845685465);
		num2.add(214803234); 
		
		ArrayList<Integer> num3 =  new ArrayList<Integer>();
		num3.add(463473537);
		num3.add(746456421); 
		
		LinkedHashMap<String, String> work1 = new LinkedHashMap<String, String>();
		work1.put("monday", "от 9 до 18");
		work1.put("tuesday", "от 9 до 18");
		work1.put("friday", "от 9 до 18");
		work1.put("saturday", "от 10 до 15");
		
		LinkedHashMap<String, String> work2 =new LinkedHashMap<String, String>();
		work2.put("monday", "от 8 до 16");
		work2.put("wednesday", "от 8 до 16");
		work2.put("friday", "от 9 до 16");
		work2.put("saturday", "от 10 до 12");
		
		LinkedHashMap<String, String> work3 = new LinkedHashMap<String, String>();
		work3.put("monday", "от 9 до 18");
		work3.put("tuesday", "от 9 до 18");
		work3.put("friday", "от 9 до 18");
		work3.put("saturday", "от 10 до 15"); 
		
		PointOfSale[] array = new PointOfSale[3];
		array[0] = new PointOfSale("Кулиничи",num1,"Хлебобулочные изделия",work1 );
		 
		array[1] = new PointOfSale("AТБ",num2,"Супермаркет",work2);
	 
		array[2] = new PointOfSale("Сomfy",num3,"Магазин електротехники",work3);
		
		 
		for (PointOfSale car : array) {
			car.Show();
			
		}
        
	}

}
