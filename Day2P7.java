package TopGunPractice;
import java.util.*;

public class Day2P7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) continue;
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
	}
}
