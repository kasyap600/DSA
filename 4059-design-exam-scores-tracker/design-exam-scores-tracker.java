class ExamTracker {
    List<Long> prefix;
    List<Integer> times;
    public ExamTracker() {
        prefix=new ArrayList<>();
        times=new ArrayList<>();
    }
    
    public void record(int time, int score) {
        times.add(time);
        if(prefix.isEmpty()) prefix.add((long)score);
        else prefix.add(prefix.get(prefix.size()-1)+score);
    }
    
    public long totalScore(int startTime, int endTime) {
        if(times.isEmpty()) return 0;
        int l=lowerbound(startTime);
        int r=upperbound(endTime)-1;

        if(l>r) return 0;
        if(l==0) return prefix.get(r);
        return prefix.get(r)-prefix.get(l-1);
    }
    private int lowerbound(int x){
        int low=0;
        int high=times.size();
        while(low<high){
            int mid=low+(high-low)/2;
            if(times.get(mid)<x){
                low=mid+1;
            }
            else high=mid;
        }
        return low;
    }
    private int upperbound(int x){
        int low=0;
        int high=times.size();
        while(low<high){
            int mid=low+(high-low)/2;
            if(times.get(mid)<=x){
                low=mid+1;
            }
            else high=mid;
        }
        return low;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */