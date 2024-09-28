class Solution {
    static String armstrongNumber(int n) {
        // code here
        int original=n;
        int sum=0;
        while(n!=0){
            int c=n%10;
            sum+=Math.pow(c,3);
            n=n/10;
        }
        if(original==sum){
            return "true";
        }else{
            return "false";
        }
    }
}
