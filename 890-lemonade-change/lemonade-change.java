class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill==5) five++;
            else if(bill==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else    return false;
            }
            else{
                if(ten==0 && five>2)    five-=3;
                else if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else    return false;
            }
        }
        return true;
    }
}