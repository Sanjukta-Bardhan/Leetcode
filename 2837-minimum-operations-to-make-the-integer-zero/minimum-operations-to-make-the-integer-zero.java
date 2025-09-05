class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        if(num1<num2)
        {
            return -1;
        }
        int k=1;
        while(k<61)
        {
            long target=(long) num1-(long) k* num2;
            if(target >=0 && f(target,k))
            {
                return k;
            }
            k++;
        }
        return -1;
    }
public boolean f(long target ,int k)
{
    int min= Long.bitCount(target);
    long max=target;
    return (k>=min && k<= max);
}

}