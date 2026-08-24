class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {

            count[s.charAt(i) - 'a']++;
        }
        String c=   Arrays.toString(count);
        System.out.println(c);
        map.putIfAbsent(c,new ArrayList<>());
            
map.get(c).add(s);
        }
        return new ArrayList(map.values());
    }


    
}
