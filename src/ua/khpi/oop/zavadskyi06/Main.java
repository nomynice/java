package ua.khpi.oop.zavadskyi06;
  
	import var25.helper;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.Iterator;
	import java.util.Scanner;
	  
	public class Main { 
		  
		public static void main(String[] args ) throws IOException, ClassNotFoundException {
//			Container container = new Container("Hi user.","This lab aims to show how I can deal with the container development problem.","All this is needed so that I can keep strings with palindromes safe and sound."); 
			Container container = new Container();
			 
			 String command = "";
			 String str = "";
			do
			{	
		 
				
				System.out.println("������� �������\r\n" + 
						"1 -  ���������� ���������� �������          - \r\n" + 
						"2 -  ��������� ����� ����������            - \r\n" + 
						"3 -  ��������� ������ �������� � ���������  - \r\n" + 
						"4 -  ��������� ����e��� � ����������         - \r\n" +
						"5 -  ����� ��������                         - \r\n" +
						"6 -  ���������� ����������(������������ ��������)         - \r\n" +
						"7 -  ���������� ����������                  - \r\n" +
						"8 -  ��������� ����������                 - \r\n" +
						"9 -  ����������                           - \r\n" +
						"10 -  ����������                          - \r\n" +
						"11 -  �������� ������ ��������              - \r\n" +
						"0 -  ���������� ��������(��������� ���������� �����������) - \r\n" + 
						"");
				System.out.println("������ �������: ");
				Scanner scan = new Scanner(System.in);
				command = scan.nextLine();  
				switch (command) {
				case "1": {
					container = Create_container();
					break;
				}
				case "2": {
					if(container.size()!=0)
					{
						System.out.println("��������� ����� ���������� �� �����");
						System.out.println(container.toString());
					}
					else {
						System.out.println("�� �� �� �������� ���������");
					}
					break;
				}
				case "3": {
					if(container.size()!=0)
					{
						System.out.println("������ ����� �����");
						str = scan.nextLine();
						container.add(str);
					}
					else {
						System.out.println("�� �� �� �������� ���������");
					}

					break;
				}
				case "4": {
					if(container.size()!=0)
					{
						System.out.println("������ ����� �� ����������");
						str = scan.nextLine();
						System.out.println("��������� ��������� �������� - " + container.remove(str));
					}
					break;
				}
				case "5": {
					if(container.size()!=0) 
					{
						System.out.println("������ ����� ���� ������� ���������");
						str = scan.nextLine();
						System.out.println("��������� ������ �������� � ���������" + container.contains(str));
					}
					else {
						System.out.println("�� �� �� �������� ���������");
					}
					break;
				}
				case "6": {
					if(container.size()!=0)
					{
						Task t = new Task();
						t.start(container);
					} 
					else {
						System.out.println("�� �� �� �������� ���������");
					}
					break;
				}
				case "7": {
					if(container.size()!=0)
					{
						container.Sort();		
					}

					else {
						System.out.println("�� �� �� �������� ���������");
					}
					break;
				}
				case "8": {
					if(container.size()!=0)
					{
						Container new_cont = Create_container();
						container.containsAll(new_cont);
					}
					else {
						System.out.println("�� �� �� �������� ���������");
					}

					break;
				}
				case "9": {
					
					FileOutputStream fs = new FileOutputStream("Serial.ser");
					ObjectOutputStream os = new ObjectOutputStream(fs);
					os.writeObject(container);
					os.close();
					System.out.println("Serialization successful");
					
					break;
				}
				case "10": {
					
					FileInputStream fis = new FileInputStream("Serial.ser");
					ObjectInputStream ois = new ObjectInputStream(fis);
					Container var = (Container) ois.readObject();
					container = var;
					ois.close();
					
					
					break;
				}
				case "11": {
					 
					helper.countVowelsAndConsonants(container.toString());
					break;
				}
				case "0": { 
					System.out.println("ʳ���� ��������");	
					container.clear();
					break;
				}
				default:
					System.out.println("�� ���������� ��������");
					break;
				}
				
			}while(!(command.equals("0"))); 
		}
		
		
		public static Container Create_container()

		{
			Scanner scan = new Scanner(System.in);
			String enter_data = "";
			System.out.println("������ ������� �������� � ���������");
			enter_data = scan.nextLine();
			int size = Integer. parseInt(enter_data);
			System.out.println(""
					+ "������ �������� - ");
			String [] arr = new String[size];
			for (int i = 0; i < size; i++) {
				System.out.print(i+1 + " ������� - " );
				enter_data = scan.nextLine();
				arr[i] = enter_data;
			}
			Container cont = new Container(arr);
			return cont;
		}
	}
 
