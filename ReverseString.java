package player;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer str1=new StringBuffer(str);
		StringBuffer str2=str1.reverse();
		System.out.println(str2);
		sc.close();
	}

}
