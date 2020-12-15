package ua.khpi.oop.zavadskyi05; 

import java.util.Iterator;

public class Main { 
	  
	public static void main(String[] args ) {
		Container container = new Container("Привет, пользователь.", "Цель этой лабораторной работы - показать, как я могу справиться с проблемой разработки контейнеров», «Все это необходимо, чтобы я мог сохранить строки в целости."); 
		 Iterator<String> it = container.getIterator() ;
		for (;it.hasNext();) 
			System.out.println(it.next());
		it = container.getIterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		System.out.println("Удаление первого аналогичного элемента из контейнера и его отображение с помощью метода toString:");
		System.out.println("Проверка результатов - " + container.remove("Привет пользователь."));
		System.out.println(container.toString());
		System.out.println("Размер контейнера - " + container.size());
		System.out.println("Содержит текст со строкой :" + " Все это нужно для того, чтобы строки с палиндромами были в целости и сохранности - " + container.contains("Все это нужно для того, чтобы я мог сохранить в целости и сохранности строки с палиндромами."));
		System.out.println("Добавьте одну строку в мой контейнер");
		container.add("Добавилось это.");
		System.out.println("Вид : " + container.toString());
		System.out.println("\nСодержит весь текст - " + container.containsAll(new Container("adda wad ss.", "Цель этой лабораторной работы - показать, как я могу решить проблему разработки контейнеров.","Все это нужно для того, чтобы я мог сохранить в целости и сохранности строки с палиндромами.")));
		System.out.println("Очистка контейнера");
		container.clear();
		
		
	} 

}

