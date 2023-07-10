class Solution {
    public int findComplement(int num) {
        int n = num;
        int k=0;    //bits
        while(n>0){
            k++;
            n>>=1;
        }
        int mask = (1<<k)-1;
        return num^mask;
    }
}