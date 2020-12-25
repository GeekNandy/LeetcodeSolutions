class CustomStack {

    int[] elems;
    int top, maxSize;
    
    public CustomStack(int maxSize) {
        elems = new int[maxSize];
        top = -1;
        this.maxSize = maxSize;
    }
    
    public void push(int x) {
        if(top<maxSize-1) {
            top++;
            elems[top] = x;    
        }
    }
    
    public int pop() {
        if(top!=-1) {
            int p = elems[top];
            elems[top] = 0;
            top--;
            return p;
        }
        else return -1;
    }
    
    public void increment(int k, int val) {
        int lim = 0;
        if(k>(top+1)) {
            lim = top+1;
        }
        else lim = k;
        for(int i=0; i<lim; i++) elems[i] = elems[i]+val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
