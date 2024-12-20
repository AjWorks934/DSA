class Solution {
    public int longestPalindromeSubseq(String s) {
       int n = s.length();
        int arr[][]=new int[s.length()+1][s.length()+1];
         for(int i=1;i<=n;i++){
            int k=n;
                for(int j=1;j<=n;j++){
                    if(s.charAt(i-1)==s.charAt(k-1))
                        arr[i][j]= 1+arr[i-1][j-1];
                    else
                        arr[i][j]= Math.max(arr[i][j-1],arr[i-1][j]);
                    k--;
                }
            }
        return arr[n][n];
    
    }
}