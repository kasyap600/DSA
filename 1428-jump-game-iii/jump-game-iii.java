class Solution {
    private boolean solve(int i,int[] arr,boolean[] vis){
        if(i>arr.length || i<0 || vis[i]) return false;
        if(arr[i]==0) return true;
        vis[i]=true;
        boolean pick=false;
        if(i+arr[i]<arr.length) pick=solve(i+arr[i],arr,vis);
        boolean not=false;
        if((i-arr[i])>=0) not=solve(i-arr[i],arr,vis);
        return pick || not; 
    }
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        boolean[] vis=new boolean[n];
        return solve(start,arr,vis);
    }
}