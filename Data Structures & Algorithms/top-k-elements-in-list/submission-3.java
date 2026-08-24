class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int l = nums.length;
        Set<Integer> n =new HashSet<>();
        for(int num:nums){
            m.putIfAbsent(num,0);
            m.put(num,m.get(num)+1);
        }
        Map<Integer, Integer> sortedMap = m.entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (e1, e2) -> e1,
                LinkedHashMap::new
            ));

        int[] result = new int[k];
        int i = 0;
        for (int key : sortedMap.keySet()) {
            if (i < k) {
                result[i++] = key;
            } else {
                break;
            }
        }
        return result;
    }
}
