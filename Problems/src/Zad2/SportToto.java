package Zad2;

import java.util.Random;

public class SportToto {
	private static int[] numbers = new int[6];

	static Random rand = new Random();

	public static void main(String[] args) {
        for(int i=0; i < numbers.length; i++ ) {
            numbers[i] = rand.nextInt(49)+ 1 ;
        }
        for(int n: numbers)    
            System.out.println(n);
            
        for(int i = 0; i<numbers.length; i++) {
        	System.out.print(numbers[i]);
        	if(i< numbers.length - 1 )
        		System.out.print(",");
        }
            
	
	}

}
