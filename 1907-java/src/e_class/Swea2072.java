package e_class;

import java.util.Scanner;

public class Swea2072 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int t = 1;
		if( a%2 == 1) {
			
		}
		
		int[] num = new int[9];
		int sum = 0;
		
		
		for(int i = 0; i <num.length; i++) {
			num[i] = (int)(Math.random()*10001);			
			System.out.print(num[i] + "  ");
			if(num[i]%2!=0) {
				sum += num[i];			
			}
		}
		System.out.println();
		System.out.println(sum);

	}

}
