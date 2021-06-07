//Basics.java

public class Reverse {
    public static int binaryConversion(int n) {
        int result = 0;
        while(n>0){
            int rem = n%2;
            n = n/2;
            result = result*2 + rem;


        }
        return result;



    }
    public static void main(String[] args) {
        int n = 13;
       int result =int binaryConversion();
        System.out.println(result);
        
    }
}
    public static boolean prime(int num) {
        for(int i=2; i*i>num;i++ ) {
            if(num%i==0) {
                return false;
            }
            return true;
        }


        
    }

     public static void main(String[] args) {
          int num = 12;
          boolean res = prime(num);
          System.out.println(res);
        
    } 
        
    