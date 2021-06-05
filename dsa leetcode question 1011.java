dsa.java
//leetcode 1011
 public boolean isPossibleToShip(int[] weight,int capacity,int days,int  totalWeightPerDay) {
        int d = 0;
        for(int w: weight) {
            totalWeightPerDay+=w;
            if (totalWeightPerDay>capacity) {
                d++;
                 totalWeightPerDay=w;
            }
            if(d>days) 
                return false;
            
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days,int ei) {
        int maxEle =0;
        for(int w:weights) {
            maxEle = Math.max(maxEle,w);
            int sum;
            sum+= w;
            
        }
        int si = maxEle;
        int sum;
        ei =sum;
        while(si<=ei) {
            int capacity = (si+ei)/2;
            if (!isPossibleToShip(weights,capacity))
                si = capacity+1;
                else {
                                        ei = capacity;
                }
        
            
            return si;
        }
        
    }
}