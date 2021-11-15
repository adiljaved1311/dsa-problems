
class Singleton {
    private Singleton(){
        System.out.println("SingleTon class constructer invoked");
    }
    private static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

public class SingletonTest{
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
