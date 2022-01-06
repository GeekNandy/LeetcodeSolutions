class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num > 0) return (num % 10 != 0);
        return true;
    }
}
