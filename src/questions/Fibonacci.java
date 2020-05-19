package questions;

public class Fibonacci {
		public static void main(String s[]){
			int n=8;
			int a=0, b=1, c=0;
			
			if(n==0){
				System.out.println("0th Fibonacci no.= "+0);
			}
			else{
				
			for(int i=2;i<=n;i++){
				c=a+b;
				a=b;
				b=c;
				System.out.print(a+" ,");
			}
			System.out.print(c);
			System.out.println();
				System.out.println(n+"th "+"Fibonacci no.= "+c);
			}
		}
	} 

