package ua.khpi.oop.zavadskyi02;

public class Main {
	public static void main(String[] args) {
		 
		double rand_num;
		int x;
		for(int i=0;i<10;i++)
		{
			rand_num = Math.random()*1000;
			x =  (int)rand_num;
			task(x);
			System.out.println("_____________________");
		}

      }
	
	public static void task(int x)
	{ 
		int sum=0;
		System.out.println("Your number is "+x ) ;
        while(x!=0)
        {
        	sum += x%10;
        	x /=10;
        }
        System.out.println("The sum of the numbers of this number = " + sum); 
        return;
	}
	
	
	
	
	
}