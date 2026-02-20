class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n=plants.length;
        int cap=capacity;
        int steps=0;
        for(int i=0;i<n;i++){
            if(cap<plants[i]){
                steps+=2*i;
                cap=capacity;
            }
            
            steps++;
            cap-=plants[i];
            
        }
        return steps;
    }
}