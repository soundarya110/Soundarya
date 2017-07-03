package guvi;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int count=0;
		while(input!=0){
			int num=input%10;
			count++;
			input=input/10;
		}
		System.out.println(count);
        sc.close();
	}

}
