package ua.khpi.oop.zavadskyi02;

import java.util.Random;
public class Main {
	  public static void main(String[] args) {
	     
	    double rand_num;
	    int x;
	    System.out.println("|    Значение     |    Число  \t|");
	    System.out.println("|_________________|_____________|");
	    for(int i=0;i<10;i++)
	      
	    {
	      rand_num = Math.random()*10;
	      x =  (int)rand_num;
	      task(x);
	      System.out.println("|_________________|_____________|");
	    }

	      }
	  
	  public static void task(int x)
	  { 
	    int cop = x; 
	        for ( int i=2; i < x; i++) {
	                if ( x % i == 0) {
	                        System.out.println("|Не простое\t  |\t"+cop+" \t|");
	                        return;
	                }      
	        }
	        System.out.println("|Простое\t  |\t"+cop+" \t|"); 
	        return;
	  }
	  
	  
	  
	}