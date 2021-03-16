package tavant;

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    private static void pattern1(int n){
        for(int i =1 ;i<=n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
                if(i != 1){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
