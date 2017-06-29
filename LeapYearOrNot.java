package guvi;
import java.util.Scanner;
public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year%4==0){
			System.out.println("The given year is leap year");
		}
		else{
			System.out.println("The given year is not a leap year");
		}
        sc.close();
	}

}
