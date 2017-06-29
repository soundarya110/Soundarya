package guvi;
import java.util.Scanner;
public class Nnumbersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		for(int i=1;i<=N;i++){
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
