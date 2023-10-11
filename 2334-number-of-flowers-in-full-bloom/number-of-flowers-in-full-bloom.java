class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        // HashMap<Integer, Integer> garden = new HashMap<>();
        // for(int[] range: flowers){
        //     int i = range[0];
        //     int j = range[1];
        //     while(i<=j){
        //         if(!garden.containsKey(i)) garden.put(i, 1);
        //         else{
        //             int count = garden.get(i);
        //             ++count;
        //             garden.put(i, count);
        //         }
        //         i++;
        //     }
        // }
        // int[] ans = new int[people.length];
        // for(int i = 0; i<people.length; i++){
        //     if(!garden.containsKey(people[i]))  ans[i] = 0;
        //     else    ans[i] = garden.get(people[i]);
        // }
        // return ans;

        int[] arr = new int[people.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for(int i = 0; i < flowers.length; i++){
            pq.offer(new int[]{flowers[i][0],0});
            pq.offer(new int[]{flowers[i][1],2});
        }
        for(int i = 0; i < people.length; i++){
            pq.offer(new int[]{people[i],1,i});
        }
        int count = 0;
        while(!pq.isEmpty()){
            int[] temp = pq.poll();
            if(temp[1] == 0)    count++;
            else if(temp[1] == 2)   count--;
            else{
                arr[temp[2]] = count;
            }
        }
        return arr;
    }
}