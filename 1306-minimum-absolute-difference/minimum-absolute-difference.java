class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            mini=Math.min(mini,arr[i+1]-arr[i]);
        }
        for(int i=0;i<n-1;i++){
            List<Integer> ls=new ArrayList<>();
            if(arr[i+1]-arr[i]==mini){
                ls.add(arr[i]);
                ls.add(arr[i+1]);
                ans.add(ls);
            }

        }
        return ans;
    }
}