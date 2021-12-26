
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hillClimbing {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(maxStrength(n));
	}
	
	static int maxStrength(int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(n);
		int p = n;
		while(true) {
			int res = 0;
			while(p != 0) {
			   int f = n%10;
			   res = res + factorial(f);
			   n = n/10;
			}
			if(arr.contains(res)) {
				break;
			}
			p = res;
		}
		return Collections.max(arr) * arr.size() ;
	}
	static int factorial(int val) {
		int res = 1;
		if(val == 0) return 1;
		for(int i = val ; i > 0 ; i--) {
			res = res * i;
		}
		return res;
	}
	
	
}

