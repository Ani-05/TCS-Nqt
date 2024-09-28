
import java.util.*;
class HelloWorld {
    
    static int fiboSum(int n){
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int a=0;
        int b=1;
        int sum=a+b;
       for(int i=2;i<=n;i++){
            int c=b+a;
            sum+=c;
            a=b;
            b=c;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of terms");
        int n=sc.nextInt();
        System.out.println(fiboSum(n));
        
        
    }
}
