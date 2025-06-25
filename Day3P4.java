package TopGunPractice;
import java.util.*;
public class Day3P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of the array is:");
		int size=sc.nextInt();
		System.out.print("Enter the size of window");
		int k=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int i=0;
		int j=k-1;
		int max=0;
		while(j<arr.length) {
			int sum=0;
			for(int l=i;l<=j;l++) {
				sum+=arr[l];
				if(max<sum) {
					max=sum;
				}
			}
			i++;
			j++;
		}
		System.out.print(max);
	}
}
