class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        Set<Integer> set=new HashSet<>();
        int maxi=0;
        for(int num:arr1){
            while(num!=0){
                set.add(num);
                num/=10;
            }
        }
        for(int num:arr2){
            while(num!=0){
                if(set.contains(num)){
                    int len=String.valueOf(num).length();
                    maxi=Math.max(maxi,len);
                }
                num/=10;
            }
        }
        return maxi;
    }
}