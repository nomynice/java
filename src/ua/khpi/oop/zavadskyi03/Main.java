package ua.khpi.oop.zavadskyi03;
 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Для начала работы введите текст. ");
		System.out.println("_________________________________");
		System.out.println("\n");
		System.out.println("Ваш текст :");
		Helper.start(new StringBuilder(scan.nextLine()));
		
		scan.close();
		
	}
}
