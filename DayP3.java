package TopGunPractice;
import java.util.Arrays;
import java.util.Scanner;
public class DayP3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			if(arr[i]<arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
