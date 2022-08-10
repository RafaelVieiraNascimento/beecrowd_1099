package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int soma = 0;
			
			if(y > x) {
				int aux = x;
				x = y;
				y = aux;
			}
			
			for(int j = y; j < x ; j++) {
				if(j % 2 != 0 & j != y) {
					soma += j;
				}
			}
			System.out.println(soma);
		}
		sc.close();
	}
}
