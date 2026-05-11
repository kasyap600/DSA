class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=nums[i];
            List<Integer> temp=new ArrayList<>();
            while(num>0){
                int digit=num%10;
                temp.add(digit);
                num/=10;
            }
            Collections.reverse(temp);
            ls.addAll(temp);
        }
        
        int size=ls.size();
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            ans[i]=ls.get(i);
        }
        return ans;
    }
}