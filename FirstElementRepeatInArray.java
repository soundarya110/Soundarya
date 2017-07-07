package hunter;

public class FirstElementRepeatInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={10,20,30,40,50,60,50,10,90};
		int len=array.length;
		int[] high=new int[len];
			for(int i=0;i<len;i++){
				for(int j=i+1;j<len;j++){
					if(array[i]==array[j]){
						high[i]=j;
					}
				}
			}
			for(int k=0;k<len;k++){
			for(int i=0;i<len;i++){
				if(high[i]==0){
					int temp=high[i];
					high[i]=high[len-1];
					high[len-1]=temp;
					len--;
				}
			}
			}
			for(int i=0;i<len;i++){
				System.out.println(high[i]);
			}
			for(int i=0;i<len;i++){
				for(int j=i+1;j<len;j++){
					if(high[i]>high[j]){
						int temp=high[i];
						high[i]=high[j];
						high[j]=temp;
					}
				}
			}
			System.out.println(array[high[0]]);

	}

}
