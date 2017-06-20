package guvi;
import java.util.Scanner;
public class VowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
			System.out.println("The given character is vowel");
		}
		else{
			System.out.println("The given character is console");
		}
		sc.close();
		

	}

}
