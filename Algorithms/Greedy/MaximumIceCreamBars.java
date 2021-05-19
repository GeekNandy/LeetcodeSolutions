class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int s = 0;
        Arrays.sort(costs);
        for(int i = 0; i<costs.length; i++) {
            coins-=costs[i];
            if(coins<0) break;
            s++;
        }
        return s;
    }
}
