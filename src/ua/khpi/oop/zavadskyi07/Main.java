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
		work1.put("monday", "�� 9 �� 18");
		work1.put("tuesday", "�� 9 �� 18");
		work1.put("friday", "�� 9 �� 18");
		work1.put("saturday", "�� 10 �� 15");
		
		LinkedHashMap<String, String> work2 =new LinkedHashMap<String, String>();
		work2.put("monday", "�� 8 �� 16");
		work2.put("wednesday", "�� 8 �� 16");
		work2.put("friday", "�� 9 �� 16");
		work2.put("saturday", "�� 10 �� 12");
		
		LinkedHashMap<String, String> work3 = new LinkedHashMap<String, String>();
		work3.put("monday", "�� 9 �� 18");
		work3.put("tuesday", "�� 9 �� 18");
		work3.put("friday", "�� 9 �� 18");
		work3.put("saturday", "�� 10 �� 15"); 
		
		PointOfSale[] array = new PointOfSale[3];
		array[0] = new PointOfSale("��������",num1,"������������� �������",work1 );
		 
		array[1] = new PointOfSale("A��",num2,"�����������",work2);
	 
		array[2] = new PointOfSale("�omfy",num3,"������� ��������������",work3);
		
		 
		for (PointOfSale car : array) {
			car.Show();
			
		}
        
	}

}
