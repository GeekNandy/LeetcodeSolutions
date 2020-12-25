class ArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> al = new ArrayList<>();
        for(int i=1, size = 0; i<=n && size<target.length; i++) {
            al.add("Push");
            if(target[size]==i) size++;
            else al.add("Pop");
        }
        return al;
    }
}
