package input_output;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}
