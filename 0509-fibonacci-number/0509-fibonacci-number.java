class Solution {
    public int fibhelp(int n, int arr[]){
        if(n==0|| n==1)
        return n;
        if(arr[n]!=-1)
        return arr[n];
        arr[n]=fibhelp(n-1,arr)+fibhelp(n-2,arr);
        return arr[n];
    }
    public int fib(int n) {
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        return fibhelp(n,arr);
    }
}