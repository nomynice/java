package ua.khpi.oop.zavadskyi02;

public class Main {
	  public static void main(String[] args) {
	     
	    double rand_num;
	    int x;
	    for(int i=0;i<10;i++)
	    {
	      rand_num = Math.random()*10;
	      x =  (int)rand_num;
	      task(x);
	      System.out.println("____________________________");
	    }

	      }
	  
	  public static void task(int x)
	  { 
	    System.out.println("„исло :"+x ) ;
	        for ( int i=2; i < x; i++) {
	                if ( x % i == 0) {
	                        System.out.println("Ёто число не €вл€етс€ постым.");
	                        return;
	                }      
	        }
	        System.out.println("Ёто число простое"); 
	        return;
	  }
	  
	  
	  
	
	
	
	
	
	
	
}