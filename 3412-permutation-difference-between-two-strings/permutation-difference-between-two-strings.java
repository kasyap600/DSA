class Solution {
    private int getindex(String t,char c){
        int n=t.length();
        for(int i=0;i<n;i++){
            char ch=t.charAt(i);
            if(ch==c) return i;
        }
        return 0;
    }
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        int n=s.length();
        int n1=t.length();
        if(n!=n1) return 0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            int ind=getindex(t,c);
            sum+=Math.abs(i-ind);
        }
        return sum;
    }
}