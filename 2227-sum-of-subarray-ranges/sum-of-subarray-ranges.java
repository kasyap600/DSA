class Solution {
    private int[] NSE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int el=arr[i];
            while(!st.isEmpty() && arr[st.peek()] >= el) st.pop();
            ans[i]=st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        return ans;
    }
    private int[] PSE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int el=arr[i];
            while(!st.isEmpty() && arr[st.peek()] > el) st.pop();
            ans[i]=st.isEmpty() ? -1 :st.peek();
            st.push(i);
        }
        return ans;
    }
    private int[] NGE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int el=arr[i];
            while(!st.isEmpty() && arr[st.peek()] <= el) st.pop();
            ans[i]=st.isEmpty() ? n:st.peek();
            st.push(i);
        }
        return ans;
    }
    private int[] PGE(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int el=arr[i];
            while(!st.isEmpty() && arr[st.peek()] < el) st.pop();
            ans[i]=st.isEmpty() ? -1 :st.peek();
            st.push(i);
        }
        return ans;
    }
    private long subArrayMin(int[] arr){
        int n=arr.length;
        int[] nse=NSE(arr);
        int[] pse=PSE(arr);
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            long val=(freq*arr[i]*1L);
            sum+=val;
        }
        return sum;
    }
    private long subArrayMax(int[] arr){
        int n=arr.length;
        int[] nse=NGE(arr);
        int[] pse=PGE(arr);
        long sum=0;
        for(int i=0;i<n;i++){
            int left=i-pse[i];
            int right=nse[i]-i;
            long freq=left*right*1L;
            long val=(freq*arr[i]*1L);
            sum+=val;
        }
        return sum;
    } 
    public long subArrayRanges(int[] nums) {
        return (subArrayMax(nums)-subArrayMin(nums));
    }
}