package TopGunPractice;
import java.util.*;

public class Day2P8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		System.out.print("Enter target: ");
		int target=sc.nextInt();
		int arr[]=new int[size];
		ArrayList<Integer> new_arr=new ArrayList<>();
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]==target) {
				continue;
			}
			else {
				new_arr.add(arr[i]);
			}
		}
		System.out.print(new_arr);
	}
}
