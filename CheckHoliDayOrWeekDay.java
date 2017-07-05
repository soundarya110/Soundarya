package player;
import java.util.Scanner;
public class CheckHoliDayOrWeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","saturday","Sunday"};
		String day=sc.nextLine();
		if(day.equalsIgnoreCase(days[6])){
			System.out.println("false");
		}
		else{
			System.out.println("true");
		}
		sc.close();
	}

}
