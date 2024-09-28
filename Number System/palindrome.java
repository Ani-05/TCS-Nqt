class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int r=n;
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s*10+d;
            n/=10;
        }
        if(r==s){
            return "Yes";
        }else{
            return"No";
        }
    }
}
