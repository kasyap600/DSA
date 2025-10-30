class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        int[] strength=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    strength[i]++;
                }
                else break;
            }
        }
        List<Integer> rows=new ArrayList<>();
        for(int i=0;i<n;i++){
            rows.add(i);
        }
        Collections.sort(rows,(a,b) -> {
            if(strength[a]==strength[b]){
                return a-b;
            }
            return strength[a]-strength[b];
        });
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=rows.get(i);
        }
        return result;
    }
}