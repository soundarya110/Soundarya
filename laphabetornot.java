package guvi;
import java.util.Scanner;
public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		int a=(char)letter;
		if((a>=65&&a<=90)||(a>=97&&a<=122)){
			System.out.println("The given character is alphabet");
		}
		else{
			System.out.println("The given character is special character");
		}
		sc.close();

	}

}
