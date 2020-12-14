package ua.khpi.oop.zavadskyi08;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class PointOfSale { 

		private String name_point_of_sale;
		private ArrayList<Integer> phone_number ;
		private String specialization; 
		private LinkedHashMap<String, String> work_time = new LinkedHashMap<String, String>();
		 
		 
		
		
		public String getName_point_of_sale() {
			return name_point_of_sale;
		}


		public void setName_point_of_sale(String name_point_of_sale) {
			this.name_point_of_sale = name_point_of_sale;
		}


		public ArrayList<Integer> getPhone_number() {
			return phone_number;
		}


		public void setPhone_number(ArrayList<Integer> phone_number) {
			this.phone_number = phone_number;
		}


		public String getSpecialization() {
			return specialization;
		}


		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}


		public LinkedHashMap<String, String> getWork_time() {
			return work_time;
		}


		public void setWork_time(LinkedHashMap<String, String> work_time) {
			this.work_time = work_time;
		}


		public void Addphone_number(int value) {
			this.phone_number.add(value);
		}
		
		 
		public void Addwork_time(String key, String value) {
			this.work_time.put(key, value);
		}
		 
		public String toString_phone_number() {
			String string = "";
			for (Integer integer : phone_number) {
				string +="+" + integer.toString();
				string+="\n";
			}
			return string;
		}
		
		
		public String toString_work_time() {
		 
			String string ="";  
			Set set = work_time.entrySet();
				 for (Object el: set) {
					 string+=el.toString();
					 string+="\n";
				} 
			return string;
		}
		
		 

		public PointOfSale(String name_point_of_sale, ArrayList<Integer> phone_number, String specialization,
				LinkedHashMap<String, String> work_time) {
			super();
			this.name_point_of_sale = name_point_of_sale;
			this.phone_number = phone_number;
			this.specialization = specialization;
			this.work_time = work_time;
		}


		public PointOfSale() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void Show()
		 {
				System.out.println("Название торговой точки - "+ name_point_of_sale +"\r\n" + 
						"Номера телефонов \n"+ toString_phone_number() + "\r" + 
						"Специализация " + specialization +
						"\nРобочее время "+ toString_work_time() + "\r\n");
			 
		 }
	} 
