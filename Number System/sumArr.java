
import java.util.*;
class HelloWorld {
    
    static int Sum(int a[]){
        int sum=0;
       for(int i=0;i<=a.length-1;i++){
            sum+=a[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        System.out.println("Enter the array");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Sum(arr));
        
        
    }
}
