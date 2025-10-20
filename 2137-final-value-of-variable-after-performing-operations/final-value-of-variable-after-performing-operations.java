class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        int n=operations.length;
        for(int i=0;i<n;i++){
            String var=operations[i];
            if(var.equals("++X") || var.equals("X++")) X++;
            else if(var.equals("--X") || var.equals("X--")) X--;
        }
        return X;
    }
}