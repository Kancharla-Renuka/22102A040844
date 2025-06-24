package TopGunPractice;
import java.util.*;
public class Day2P4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int sum=0;
		int median=0;
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		int a=size/2;
		if (a/2==0) {
			median=arr[a]+arr[a-1];
		}
		else {
			median=arr[a+1];
		}
		
		System.out.println("The sum of the array is: "+sum);
		System.out.println("The Average of the array is: "+sum/size);
		System.out.println("The Meadian of the array is: "+median);
		
	}

}
