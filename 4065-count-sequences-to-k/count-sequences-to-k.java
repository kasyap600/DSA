class Solution {
    Map<String,Integer> dp;
    public int countSequences(int[] nums, long k) {
        dp=new HashMap<>();
        return solve(nums,k,1L,1L,0);
    }
    private int solve(int[] nums,long k,long num,long den,int idx){
        if(idx==nums.length){
            return num==k*den ? 1 :0;
        }
        long g=gcd(num,den);
        num/=g;
        den/=g;
        String key=num+ " "+den + " " + idx;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int cnt=0;
        cnt+=solve(nums,k,num*nums[idx],den,idx+1);
        cnt+=solve(nums,k,num,den*nums[idx],idx+1);
        cnt+=solve(nums,k,num,den,idx+1);
        dp.put(key,cnt);
        return cnt;
    }
    private long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}