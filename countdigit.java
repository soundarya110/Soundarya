import java.util.Scanner;
class countdigit {
	public static void main(String[] args) {
		int number,num1,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Given number:");
		number=sc.nextInt();
		while(number!=0)
		{
		num1=number%10;
		++count;
		number=number/10;
		}
		System.out.println("Number of digits in  +number is " +count);
		}
		}
