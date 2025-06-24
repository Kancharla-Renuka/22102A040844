package TopGunPractice;
import java.util.*;

public class Day2P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		int arr3[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+"element of arr1");
			arr1[i]=sc.nextInt();
			System.out.println("Enter "+i+"element of arr2");
			arr2[i]=sc.nextInt();
			int sum=arr1[i]+arr2[i];
			arr3[i]=sum;
		}
		
		System.out.print(Arrays.toString(arr3));
	
	}
	

}
