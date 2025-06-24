package TopGunPractice;
import java.util.*;
public class Day2P5 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int size=sc.nextInt();
	int even_count=0;
	int odd_count=0;
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		if(arr[i]%2==0) {
			even_count+=1;
		}
		else {
			odd_count+=1;
		}
	}
	System.out.println(even_count);
	System.out.println(odd_count);
}
}
