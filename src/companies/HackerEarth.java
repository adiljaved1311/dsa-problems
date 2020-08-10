/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
*/
package companies;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class HackerEarth {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        */
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i=1; i<=T; i++){
            int N = s.nextInt();
            print(N); 
        }                                      // Reading input from STDIN
        //System.out.println("Hi, " + T + ".");    // Writing output to STDOUT
        s.close();
        // Write your code here

    }
    public static void print(int N){
        for(int i=1; i<=N; i++){
            if(i%15 == 0 ){
                System.out.println("FizzBuzz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }   
        }
    }
}
