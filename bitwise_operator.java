package chapter1;

import java.util.Scanner;

public class bitwise_operator {

	public static void main(String[] args) {
	
		int x,y,result;
		Scanner s= new Scanner(System.in);
		System.out.println("Enetr x and y value=");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("And result is="+(x&y));

		System.out.println("oR result is="+(x|y));

		System.out.println("Xor result is="+(x^y));
	}

}
