class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m1=new HashMap<>();
        for(int i:nums){
            m1.put(i,m1.getOrDefault(i, 0)+1);
        }
        List<int[]> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> sorted:m1.entrySet()){
            arr.add(new int[]{sorted.getKey(),sorted.getValue()});
           
            
        }
         arr.sort((a,b)->Integer.compare(b[1],a[1]));
        int[] res=new int[k];
            for(int i=0;i<k;i++){
                res[i]=arr.get(i)[0];
            }
        return res;
    }
}
