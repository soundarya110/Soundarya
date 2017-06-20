package guvi;
import java.util.Scanner;
public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b&&b==c){
			System.out.println("Three values are equal");
		}
		if(a>b&&a>c){
			System.out.println(a+" is greater");
		}
		if(b>a&&b>c){
			System.out.println(b+" is greater");
		}
		if(c>a&&c>b){
			System.out.println(c+" is greater");
		}
		if(a==b&&a>c){
			System.out.println(a+" is greater");
		}
		if(b==c&&b>a){
			System.out.println(b+" is greater");
		}
		if(c==a&&c>b){
			System.out.println(c+" is greater");
		}
        sc.close();
	}

}
