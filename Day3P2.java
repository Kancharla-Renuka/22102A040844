package TopGunPractice;
import java.util.*;
public class Day3P2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of the array is:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int i=0;
		int j=size-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.print(Arrays.toString(arr));
	}

}
