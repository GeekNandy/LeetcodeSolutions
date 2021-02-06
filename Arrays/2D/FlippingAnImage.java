class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        A = flipAll(A);
        A = invertAll(A);
        return A;
    }
    
    private int[][] flipAll(int[][] A){
        for(int[] arr : A)
            arr = flip(arr);
        return A;
    }
    
    private int[] flip(int[] arr){
        for(int i = 0 ; i < arr.length / 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }
    
    private int[][] invertAll(int[][] A){
        for(int [] arr : A)
           arr = invert(arr);
        return A;
    }
    
    private int[] invert(int[] arr){
         for(int i = 0 ; i < arr.length; i++)
                arr[i] = (arr[i] == 1) ? 0 : 1;
        return arr;
    }
}
