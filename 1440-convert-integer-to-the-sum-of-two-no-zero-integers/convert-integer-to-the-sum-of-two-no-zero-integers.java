class Solution {
    public int[] getNoZeroIntegers(int n) {
        int number =n;
        while(n-->0)
        {
            if(f(n) && f(number-n))
            {
                break;
            }
            n--;
        }
        return new int[]{number-n,n};
    }
    public boolean f(int num)
    {
        while(num>0)
        {
            if(num%10==0)
            {
                return false;
            }
            num/=10;
        }
        return true;
    }
}