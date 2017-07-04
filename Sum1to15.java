package guvi;

public class Sum1to15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int oddsum=0;
		for(int i=1;i<=15;i++){
			sum=sum+i;
		}
		for(int i=15;i<=45;i++){
			if(i%2!=0){
				oddsum=oddsum+i;
			}
		}
		System.out.println(sum);
		System.out.println(oddsum);
	}

}
