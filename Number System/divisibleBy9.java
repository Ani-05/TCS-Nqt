
import java.util.*;
class HelloWorld {
    
    static boolean div9(String s){
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=(s.charAt(i)-'0');
            
        }if(sum%9==0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
       String str=sc.next();
        System.out.println(div9(str));
        
        
    }
}
