package player;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int number=0;
		while(num!=0){
			int n=num%10;
			number=(number*10)+n;
			num=num/10;
		}
		System.out.println(number);
		sc.close();
	}

}
