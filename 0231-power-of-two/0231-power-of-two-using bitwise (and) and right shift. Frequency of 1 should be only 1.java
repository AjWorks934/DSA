class Solution {
    public boolean isPowerOfTwo(int n) {
        int c=0;
    while(n>=1){
        if((n&1)==1)
        c++;
       // System.out.println(c);
        n=n>>1;
    }
   if(c==1)
   return true;
   else
   return false; 
}
}