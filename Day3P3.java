package TopGunPractice;
import java.util.*;
public class Day3P3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int v=0;
		int c=0;
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o'
					||a.charAt(i)=='u') {
				v++;
				
			}
			else {
				c++;
			}
		}
		System.out.print("Vowels: "+v+"Consonents: "+c);
	}

}
