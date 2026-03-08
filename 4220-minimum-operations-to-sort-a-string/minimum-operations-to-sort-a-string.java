class Solution {
    public int minOperations(String s) {
        int n=s.length();
        //if(n<=1) return 0;
        char[] c=s.toCharArray();
        char[] t=s.toCharArray();
        //Arrays.sort(t);
        //if(Arrays.equals(c,t)) return 0;
        //if(n<=2) return -1;
        Arrays.sort(c,0,n-1);
        Arrays.sort(t,1,n);
        if(isSorted(s.toCharArray())) return 0;
        if(isSorted(c) || isSorted(t)) return 1;
        if(c[n-1]>= c[0]) return 2;
        if(t[0]<=t[n-1]) return 2;

        if(n>2) return 3;

        return -1;
    }
    private boolean isSorted(char[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}