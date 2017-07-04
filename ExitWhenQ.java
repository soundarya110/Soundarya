package guvi;
import java.util.Scanner;
public class ExitWhenQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			char ch=sc.next().charAt(0);
		if(ch=='Q'){
			break;
		}
		}
		sc.close();
	}

}
