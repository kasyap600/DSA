class Solution {
    public int compareVersion(String version1, String version2) {
        int n1=version1.length();
        int n2=version2.length();
        int len=Math.max(n1,n2);
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        for(int i=0;i<len;i++){
            int num1=i<v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2=i<v2.length ? Integer.parseInt(v2[i]) : 0;
            if(num1<num2) return -1;
            if(num1>num2) return 1;
        }
        return 0;

    }
}