package homework1;

import java.util.Random;

public class code1 {
	public static void main(String[] args) {
		final int LENGTH =20;
		int i;
		int check = 0;
		int[] numbers=new int[LENGTH + 1];
		
		Random rand = new Random();
		
		for( i=0;i<LENGTH;i++) {
			numbers[i]=rand.nextInt(9);
		}
		for(i=0;i<LENGTH;i++) {
			if(numbers[i]==numbers[i+1]) {
				if(check == 0)
				System.out.print("(");
				check = 1;
			}
			
			System.out.print(numbers[i]+" ");
			if(check == 1) {
				if(numbers[i]!=numbers[i+1]) {
					System.out.print(") ");
					check = 0;
				}
			}
	
		}
		System.out.println();	
	}
	
}