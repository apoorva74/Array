package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Array1 {
	public static void main (String[] args) {
		int value1 = 5;
		Double [] array1 = new Double[value1];
		
		Scanner sc = new Scanner(System.in);
		double random = new Random().nextDouble();
		
		/*double start =1;
		double end = 100;
		double result = start + (random *(end - start)); */
		
		 double max = 0;
		    double min = 10;
		    Random math = new Random();
		   /* for(int a = 0; a < 1000000000; a++) {
		        double rand = math.nextDouble();
		        max = Math.max(max, rand);
		        min = Math.min(min, rand);  */
		   // }
		    //System.out.println("maximum: " + max + " minimum: " + min);
		
		for(int i=0; i<array1.length; i++) {
			double rand = math.nextDouble();
	        max = Math.max(max, rand);
	        min = Math.min(min, rand);
			array1[i] = rand;
			System.out.println("maximum: " + max + " minimum: " + min);
			//System.out.println(result);
			
		}

		for (int j=0; j<array1.length; j++) {
			System.out.println(array1[j]);
		}
		
	}

}
