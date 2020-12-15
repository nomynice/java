package ua.khpi.oop.zavadskyi05; 

import java.util.Iterator;

public class Main { 
	  
	public static void main(String[] args ) {
		Container container = new Container("������, ������������.", "���� ���� ������������ ������ - ��������, ��� � ���� ���������� � ��������� ���������� �����������, ���� ��� ����������, ����� � ��� ��������� ������ � �������."); 
		 Iterator<String> it = container.getIterator() ;
		for (;it.hasNext();) 
			System.out.println(it.next());
		it = container.getIterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("�������� ������� ������������ �������� �� ���������� � ��� ����������� � ������� ������ toString:");
		System.out.println("�������� ����������� - " + container.remove("������ ������������."));
		System.out.println(container.toString());
		System.out.println("������ ���������� - " + container.size());
		System.out.println("�������� ����� �� ������� :" + " ��� ��� ����� ��� ����, ����� ������ � ������������ ���� � ������� � ����������� - " + container.contains("��� ��� ����� ��� ����, ����� � ��� ��������� � ������� � ����������� ������ � ������������."));
		System.out.println("�������� ���� ������ � ��� ���������");
		container.add("���������� ���.");
		System.out.println("��� : " + container.toString());
		System.out.println("\n�������� ���� ����� - " + container.containsAll(new Container("adda wad ss.", "���� ���� ������������ ������ - ��������, ��� � ���� ������ �������� ���������� �����������.","��� ��� ����� ��� ����, ����� � ��� ��������� � ������� � ����������� ������ � ������������.")));
		System.out.println("������� ����������");
		container.clear();
		
		
	} 

}

