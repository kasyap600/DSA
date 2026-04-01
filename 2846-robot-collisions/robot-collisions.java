class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n=positions.length;
        Stack<Integer> st=new Stack<>();
        List<Integer> ls=new ArrayList<>();
        int[][] order=new int[n][4];
        for(int i=0;i<n;i++){
            order[i][0]=positions[i];
            order[i][1]=healths[i];
            order[i][2]=directions.charAt(i)=='L'? 0:1;
            order[i][3]=i;
        }
        Arrays.sort(order,(a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            if(order[i][2]==1) st.push(i);
            else{
                while(!st.isEmpty() && order[i][1]>0 && order[st.peek()][2] == 1){
                    int top= st.peek();

                    if(order[top][1] < order[i][1]){
                        st.pop();
                        order[top][1]=0;
                        order[i][1]--;
                    }
                    else if(order[top][1]==order[i][1]){
                        st.pop();
                        order[top][1]=0;
                        order[i][1]=0;
                        break;
                    }
                    else{
                        order[top][1]--;
                        order[i][1]=0;
                        break;
                    }
                }
            }
        }
        int[] res=new int[n];
        Arrays.fill(res,-1);

        for(int i=0;i<n;i++){
            if(order[i][1]>0){
                res[order[i][3]]=order[i][1];
            }
        }
        for(int x:res){
            if(x!=-1) ls.add(x);
        }
        return ls;

    }
}