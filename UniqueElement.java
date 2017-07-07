package hunter;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,1,2,5,3,4,6,7,6,7,8};
		int len=array.length;
		int[] num={0,1,2,3,4,5,6,7,8,9};
		int[] count=new int[10];
		for(int i=0;i<len;i++){
		for(int j=0;j<=9;j++){
				if(array[i]==num[j]){
				count[j]++;
				}
			}
		}
		for(int i=0;i<=9;i++){
			if(count[i]==1){
				System.out.println(num[i]);
			}
		}


	}

}
