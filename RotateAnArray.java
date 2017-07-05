package player;
import java.util.Scanner;
public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		int len1=n-k;
		int[] reversedarray=new int[n];
		int j=0;
			for(int i=len1;i<n;i++){
				reversedarray[j]=array[i];
				j++;
			}
			for(int i=0;i<len1;i++){
				reversedarray[j]=array[i];
	            j++;		
			}
		for(int i=0;i<n;i++){
			System.out.print(reversedarray[i]);
		}
		sc.close();
	}

}
