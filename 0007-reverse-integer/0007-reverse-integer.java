class Solution {
    public int reverse(int x) {
        int n=x;long rev=0;
      while(n!=0){
        int d=n%10;
       // if(d!=0)
        rev=rev*10+d;
        n=n/10;
      } 
      if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
      return 0;
      else
      return (int)rev;
    }
}