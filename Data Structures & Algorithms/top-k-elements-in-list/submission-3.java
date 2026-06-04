class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<int[]> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> map1:map.entrySet()){
            list.add(new int[]{map1.getKey(),map1.getValue()});
        }
        list.sort((a,b)->Integer.compare(b[1],a[1])
        );

        int[] n1=new int[k];
        for(int i=0;i<k;i++){
            n1[i]=list.get(i)[0];
        }
        return n1;
    }
}
