class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int number=-n/2;
        for(int i=0;i<n-n%2;i++)
        {
            if(number==0)
            {
                number+=1;
            }
            ans[i] = number;
            number++;
        }
        return ans;
    }
}