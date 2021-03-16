package tavant;

public class Prime {
    public static void main(String[] args) {
        int num = 27;
        System.out.println(Math.sqrt(num));
        System.out.println(isPrime(num));
    }
    private static boolean isPrime(int num){
        for(int i = 2 ; i<num/2 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
