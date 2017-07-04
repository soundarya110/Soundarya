package guvi;
import java.util.Scanner;
public class Numberpalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int number1=number;
		int number2=0;
			while(number!=0){
			int num=number%10;
			number2=(number2*10)+num;
			number=number/10;
			}
		if(number2==number1){
			System.out.println("The given number is palindrome");
		}
		else{
			System.out.println("The given number is not palindrome");
		}
		sc.close();
	}

}
