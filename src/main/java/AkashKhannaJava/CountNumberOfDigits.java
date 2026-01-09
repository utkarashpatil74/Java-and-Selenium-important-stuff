package AkashKhannaJava;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int counter=digitCount(num);
		System.out.println(counter);
		sc.close();
		
		
	}
	
	public static int digitCount(int number) {
		
		int count=0;
		while(number!=0) {
			
			number=number/10;
			count++;
		}
		return count;
	}

}
