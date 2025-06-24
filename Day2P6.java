package TopGunPractice;
import java.util.*;
public class Day2P6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		boolean aa=true;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size-1;i++) {
			if(arr[i]>=arr[i+1]) {
				aa=false;
		}
		}
		System.out.print(aa);
	}
}
