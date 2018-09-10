package homework2;

import java.util.Random;

public class Code2 {
	public static void main(String[] args) {
		final int LENGTH =20;
		int i,count=0,position=0,max=0;
		int[] numbers=new int[LENGTH +1];
		Random rand = new Random();
		for( i=0;i<LENGTH;i++) {
			numbers[i]=rand.nextInt(5);
		}
		
		for(i=0;i<LENGTH;i++) {
			if(numbers[i]==numbers[i+1]) {
				count++;
			}
			else {
				if(count>max) {
					max=count;
					position=i-count;
				}
				count =0;
			}
		}
		
		for(i=0;i<LENGTH;i++) {
			if(i==position)
				System.out.print("(");
			System.out.print(numbers[i]+" ");
			if(i==position+max)
				System.out.print(")");
		}
		System.out.println();
	}
}