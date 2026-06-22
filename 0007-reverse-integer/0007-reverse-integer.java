class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x<0){
            neg = true;
            x = -x;
        }

        long sum = 0;
        while(x!=0){
            int rem = x % 10;
            sum = sum * 10 + rem;
            x = x/10;
        }

        if(sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE){
            return 0;
        }

        if(neg){
            sum = -sum;
        }
        return (int)sum;
    }
}